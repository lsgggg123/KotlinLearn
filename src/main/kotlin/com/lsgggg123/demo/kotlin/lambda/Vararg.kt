package com.lsgggg123.demo.kotlin.lambda

fun test(vararg strings: String) {
    println(strings.javaClass)
    strings.forEach { println(it) }
}

fun main() {
    test("a", "b", "c")

    val arr = arrayOf("a", "b", "c", "d")
    // 不允许直接传数组
    // test(arr)

    // * 代表打散运算符
    test(*arr)
}