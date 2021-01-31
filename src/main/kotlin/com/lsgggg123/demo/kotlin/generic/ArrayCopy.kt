package com.lsgggg123.demo.kotlin.generic

fun copy(from: Array<out Any>, to: Array<Any>) {
    for (i in from.indices) {
        to[i] = from[i]
    }
}

fun main() {
    val from: Array<Int> = arrayOf(1, 2, 3, 4)
    val to: Array<Any> = Array(4) { "hello$it" }
    for (it in to) {
        println(it)
    }

    copy(from, to)
}