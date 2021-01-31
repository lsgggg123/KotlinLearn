package com.lsgggg123.demo.kotlin.kotlin

fun main() {
    val list = listOf("a", "b", "c")
    for (it in list) {
        println(it)
    }
    println("-------")
    list.forEach { println(it) }
    println("-------")
    list.forEach(System.out::println)
    println("-------")
}