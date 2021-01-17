package com.lsgggg123.nullsafe

/**
 *
 * @author: lsggg
 * @date: 2021/1/17
 */
fun main() {
    println(convert2UpperCase("hello world"))
    println(convert2UpperCase(123))
}

fun convert2UpperCase(x: Any): String? {
    return if (x is String) {
        x.toUpperCase()
    } else {
        null
    }
}