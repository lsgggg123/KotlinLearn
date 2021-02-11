package com.lsgggg123.demo.kotlin.exception

/*
    throw 在 Kotlin 中是个表达式
    这样我们可以将 throw 作为 Elvis 表达式的一部分 Elvis 表达式：?:
    throw 表达式的类型是一种特殊的类型：Nothing
    Nothing 没有值标记永远不触达的代码位置，永远不会返回的函数
 */
fun main() {
    val str: String?
    str = "3"

    val str2 = str ?: throw NullPointerException("值不能为空")
    println(str2)
    println("-------------")

    val str3 = str ?: myMethod("hello")
    println(str3)
    println("-------------")

    val nothing = null
    println(nothing is Nothing?)
    println("-------------")

    val noneList = listOf(null)
    println(noneList is List<Nothing?>)
}

fun myMethod(message: String): Nothing {
    throw IllegalArgumentException(message)
}