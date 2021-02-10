package com.lsgggg123.demo.kotlin.lambda

fun main() {
    val strings = arrayOf("hello", "world", "hello world", "welcome", "ok")
    strings.filter { it.contains("h") }.forEach { println(it) }

    println("----------------")

    strings.filter { it.length > 6 }.forEach { println(it) }

    println("----------------")

    strings.filter { it.endsWith("d", true) }.map { it.toUpperCase() }.forEach { println(it) }
}