package com.lsgggg123.demo.kotlin.kotlin

/**
 *
 * @author: lsggg
 * @date: 2021/1/17
 */
fun main() {
    val a: Int = 1
    val b = 1

    var c: Int = 1
    var d = 1
    c = 2
    d = 2

    var x = 10
    var y: Byte = 1
    x = y.toInt() //compile error: x = y

    println(x)

    val arr = intArrayOf(1, 2, 3)
    // arr = intArrayOf(4, 5)
    arr.set(0, 4)
    arr[1] = 5
    for (item in arr) {
        println(item)
    }
}