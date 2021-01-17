package com.lsgggg123.condition

/**
 *
 * @author: lsggg
 * @date: 2021/1/17
 */
fun main() {
    var x = 10
    var y = 20

    var max: Int
    var min: Int

    if (x > y) {
        max = x
        min = y
    } else {
        max = y
        min = x
    }

    println("max is $max, min is $min")

    var kotlinMax = if (x > y) x else y
    var kotlinMin = if (x > y) y else x
    println("kotlinMax is $kotlinMax, kotlinMin is $kotlinMin")
}