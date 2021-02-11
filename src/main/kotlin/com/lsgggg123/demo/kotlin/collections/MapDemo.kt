package com.lsgggg123.demo.kotlin.collections

/*
    map
 */
fun main() {
    val map = mapOf("a" to "1", "b" to "2")

    for ((k, v) in map) {
        println("map key is $k, value is $v")
    }
}
