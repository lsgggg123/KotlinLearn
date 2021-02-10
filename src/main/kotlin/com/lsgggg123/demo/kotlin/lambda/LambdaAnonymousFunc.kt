package com.lsgggg123.demo.kotlin.lambda

/*
    匿名函数

    匿名函数如果类型可以推断，函数的参数类型可以省略（普通函数的参数类型不行）
 */
fun main() {
    val strings = arrayOf("hello", "world", "hello world", "welcome", "ok")

    // 匿名函数要放在圆括号里面，而不是花括号
    strings.filter(fun(item): Boolean = item.length > 3).forEach { println(it) }

}