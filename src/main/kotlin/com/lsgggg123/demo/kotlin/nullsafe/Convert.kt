package com.lsgggg123.demo.kotlin.nullsafe

import java.lang.NumberFormatException

/**
 *
 * @author: lsggg
 * @date: 2021/1/17
 */
fun main() {
    println(convert2int("34"))
    println(convert2int("a34"))

    printMultiply("7", "8")
}

fun convert2int(arg: String): Int? {
    return try {
        arg.toInt()
    } catch (e : NumberFormatException) {
        null
    }
}

fun printMultiply(a : String, b: String) {
    val x = convert2int(a)
    val y = convert2int(b)
    if (x != null && y != null) {
        println("$a x $b is ${x * y}")
    }
}