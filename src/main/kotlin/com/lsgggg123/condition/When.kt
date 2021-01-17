package com.lsgggg123.condition

/**
 *
 * @author: lsggg
 * @date: 2021/1/17
 */
fun myPrint(arg: String): String {
    return when (arg) {
        "hello" -> "HELLO"
        "world" -> "WORLD"
        "hello world" -> "HELLO WORLD"
        else -> arg
    }
}

fun myPrint2(arg: String) = when (arg) {
    "hello" -> "HELLO"
    "world" -> "WORLD"
    "hello world" -> "HELLO WORLD"
    else -> arg
}

fun rangeWhen(a: Int) = when (a) {
    1 -> 10
    2 -> 20
    3, 4, 5 -> 30
    in 6..100 -> 40
    else -> 50
}
