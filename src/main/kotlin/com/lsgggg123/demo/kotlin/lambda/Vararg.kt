package com.lsgggg123.demo.kotlin.lambda

fun test(vararg strings: String) {
    println(strings.javaClass)
    strings.forEach { println(it) }
}

// kotlin 允许可变参数不在最后一个，通过具名参数就可以使用，如果最后一个是 lambda，通过把 lambda 放在圆括号外也可以
fun test2(vararg strings: String, a: Int, b: Int) {
    println(strings.javaClass)
    strings.forEach { println(it) }
    println(a + b)
}

fun main() {
    test("a", "b", "c")

    val arr = arrayOf("a", "b", "c", "d")
    // 不允许直接传数组
    // test(arr)

    // * 代表打散运算符
    test(*arr)

    test2("a", "b", "c", a = 1, b = 2)
}