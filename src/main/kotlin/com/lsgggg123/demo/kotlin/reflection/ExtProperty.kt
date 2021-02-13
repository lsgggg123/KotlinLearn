package com.lsgggg123.demo.kotlin.reflection

val String.firstChar: Char
    get() = this[0]

fun main() {
    val s = "xyz"
    println(s.firstChar)
    println(String::firstChar.get("xyz"))
}