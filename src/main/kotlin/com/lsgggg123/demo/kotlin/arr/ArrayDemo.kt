package com.lsgggg123.demo.kotlin.arr

/**
 *
 * @author: lsggg
 * @date: 2021/1/17
 */
fun main() {
    var arr: IntArray = intArrayOf(1, 2, 3)

    for (item in arr) {
        println(item)
    }
    println("-------------")
    for (x in arr.indices) {
        println("arr[$x] is ${arr[x]}")
    }
    println("-------------")
    for ((index, value) in arr.withIndex()) {
        println("arr[$index] is $value")
    }
}