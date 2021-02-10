package com.lsgggg123.demo.kotlin.lambda

fun String.filter(predicate: (Char) -> Boolean): String {
    val sb = StringBuilder()
    for (index in 0 until length) {
        val element = get(index)
        if (predicate(element)) {
            sb.append(element)
        }
    }
    return sb.toString()
}

fun main() {
    val str = "abc2def9xy7"
    println(str.filter { c -> !c.isDigit() })
    println(str.filter { c -> c.isDigit() })
}