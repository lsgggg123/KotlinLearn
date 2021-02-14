package com.lsgggg123.demo.kotlin.condition

/**
 *
 * @author: lsggg
 * @date: 2021/1/17
 */
fun main() {
    val x = 10
    val y = 20

    val max: Int
    val min: Int

    if (x > y) {
        max = x
        min = y
    } else {
        max = y
        min = x
    }

    println("max is $max, min is $min")

    val kotlinMax = if (x > y) x else y
    val kotlinMin = if (x > y) y else x
    println("kotlinMax is $kotlinMax, kotlinMin is $kotlinMin")
}