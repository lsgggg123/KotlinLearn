package com.lsgggg123.demo.kotlin.delegation

import java.util.*

/*
    map 委托
    将属性存储到 map 中
    一种常见的应用场景是将属性存储到 map 中
    这通常出现在 json 解析货是一些动态行为时候
    在这种情况中，你可以将 map 实例座位委托，作为类中属性的委托
    map 中的 key 的名字必须和类中属性的名字保持一致
 */

class Student(map: Map<String, Any?>) {
    val name: String by map
    val address: String by map
    val age: Int by map
    val birthday: Date by map
}

class Student2(map: MutableMap<String, Any?>) {
    var address: String by map
}

fun main() {
    val map = mapOf<String, Any?>(
        "name" to "z3",
        "address" to "beijing",
        "age" to 20,
        "birthday" to Date()
    )
    val student = Student(map)
    println(student.name)
    println(student.address)
    println(student.age)
    println(student.birthday)
    println("-------------------------")

    val mutableMap: MutableMap<String, Any?> = mutableMapOf(
        "address" to "beijing"
    )
    val student2 = Student2(mutableMap)
    println(student2.address)
    student2.address = "shanghai" // 最终这个值给了 map，因为 map 是数据的维护者
    println(mutableMap["address"])
    println(student2.address)
}