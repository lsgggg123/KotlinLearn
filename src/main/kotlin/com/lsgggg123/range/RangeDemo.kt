package com.lsgggg123.range

/**
 *
 * @author: lsggg
 * @date: 2021/1/22
 */
fun main() {
    var a = 5
    var b = 10
    if (a !in 2..4) {
        println("a not in 2..4")
    }

    if (b in 2..10) {
        println("b in 2..10")
    }

    println("i in 2..10")
    for (i in 2..10) {
        println(i)
    }

    println("i in 2..10 step 2")
    // for (i in 2.rangeTo(10)) {
    for (i in 2..10 step 2) {
        println(i)
    }

    println("i in 2..10 step 2")
    for (i in 2..10 step 2) {
        println(i)
    }

    println("i in 10 downTo 2 step 2")
    for (i in 10 downTo 2 step 2) {
        println(i)
    }
}