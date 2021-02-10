package com.lsgggg123.demo.kotlin.lambda

/*
    闭包
 */
fun main() {
    var sum = ""
    val strings = arrayOf("hello", "world", "hello world", "welcome", "ok")
    strings.filter { it.contains("h") }.forEach { sum += it }
}