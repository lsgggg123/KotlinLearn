package com.lsgggg123.demo.kotlin.lambda

/*
    函数组合
 */
fun <A, B, C> compose(f: (B) -> C, g: (A) -> B): (A) -> C {
    return { x -> f(g(x)) }
}

fun isEven(x: Int) = 0 == x % 2
fun mLength(s: String) = s.length

fun main() {
    val evenLength = compose(::isEven, ::mLength)

    val strings = listOf("a", "ab", "abc")
    strings.filter(evenLength).forEach { println(it) }
}