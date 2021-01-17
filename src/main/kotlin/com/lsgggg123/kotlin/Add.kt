package com.lsgggg123.kotlin

/**
 *
 * @author: lsggg
 * @date: 2021/1/17
 */
fun main() {
    println(add(3,4))
    println(add2(5,3))
}

fun add(x: Int, y: Int): Int {
    return x + y
}

fun add2(x: Int, y: Int) = x + y