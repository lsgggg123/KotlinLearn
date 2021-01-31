package com.lsgggg123.demo.kotlin.basic

/**
 *
 * @author: lsggg
 * @date: 2021/1/17
 */
fun main() {
    println(add(3,4))
    println(add2(5,3))
    println(voidMethod(9, 1))
}

fun add(x: Int, y: Int): Int {
    return x + y
}

fun add2(x: Int, y: Int) = x + y

fun voidMethod(x: Int, y: Int): Unit {
    println("$x + $y = ${x + y}")
}