package com.lsgggg123.arr

/**
 *
 * @author: lsggg
 * @date: 2021/1/22
 */
fun main() {
    var list = listOf<String>("hello", "world", "hello world", "welcome", "goodbye")
    list.filter { it.length > 5 }.map { it.toUpperCase() }.sorted().forEach { println(it) }
}