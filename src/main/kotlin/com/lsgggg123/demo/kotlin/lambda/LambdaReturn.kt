package com.lsgggg123.demo.kotlin.lambda

fun main() {
    val strings = arrayOf("hello", "world", "hello world", "welcome", "ok")

    // 默认 lambda 表达式中最后一个表达式的值会隐式作为返回值
    strings.filter {
        val f = it.length > 3
        f
    }
}