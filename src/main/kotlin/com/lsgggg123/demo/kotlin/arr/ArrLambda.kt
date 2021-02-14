package com.lsgggg123.demo.kotlin.arr

/**
 *
 * @author: lsggg
 * @date: 2021/1/22
 */
fun main() {
    val list = listOf("hello", "world", "hello world", "welcome", "goodbye")
    list.filter { it.length > 5 }.map { it.toUpperCase() }.sorted().forEach { println(it) }
}