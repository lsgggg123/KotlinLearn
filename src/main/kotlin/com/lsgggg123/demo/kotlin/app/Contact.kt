package com.lsgggg123.demo.kotlin.app

import java.io.File
import java.nio.file.Files

/**
 * 苹果通讯录文件处理
 */
fun main() {
    val splitStr = "END:VCARD\r\n"
    // 打开文件，按单个名片分割
    val f = File("/Users/lsgggg123/Downloads/ic.vcf")
    val allContent = String(Files.readAllBytes(f.toPath()))
    val splitsTemp = allContent.split(splitStr)
    val splitResult = splitsTemp.dropLast(1).map { it + splitStr }.toList()
    // println(splitResult)

    // String 转化为 map, key: name, value: contact content
    val map = splitResult.associateBy {
        val line = it.split("\r\n")
        val fn = line.filter { it1 -> it1.startsWith("FN") }.map { it1 -> it1.split(":")[1] }.toList()[0]
        fn
    }

    // 去掉一些不再用的名片
    val filteredContactList = arrayListOf<String>()
    map.forEach {
        if (it.key.contains("爸爸") || it.key.contains("妈妈")) {
            // println("去除父母 ${it.key}")
        } else {
            filteredContactList.add(it.value)
        }
    }

    filteredContactList.forEach{ print(it)}

    val contactTemplate = """
        BEGIN:VCARD
        VERSION:3.0
        PRODID:-//Apple Inc.//iOS 14.3//EN
        N:%s;;;;
        FN:%s
        TEL;type=CELL;type=VOICE;type=pref:%s
        REV:2021-01-31T10:02:00Z
        END:VCARD
    """.trimIndent()

    // 打开文件，按单个名片分割
    val importFile = File("/Users/lsgggg123/Downloads/2020.csv")
    val importContent = String(Files.readAllBytes(importFile.toPath()))
    val importList = importContent.split("\r\n")
    importList.forEach {
        run {
            val name = "2020-" + it.split(",")[0]
            val no = it.split(",")[1]
            println(String.format(contactTemplate, name, name, no))
        }
    }
}