package com.lsgggg123.demo.kotlin.collections

/*
    map demo
 */
fun main() {
    val map = mapOf("a" to "1a", "b" to "2b")

    for ((k, v) in map) {
        println("map key is $k, value is $v")
    }
    println("-------------")

    map.forEach { println(it) }
    println("-------------")

    map.mapKeys { entry -> entry.key.toUpperCase() }.forEach { println(it) }
    map.mapValues { entry -> entry.value.toUpperCase() }.forEach { println(it) }
    println("-------------")

    // 解构声明
    map.mapValues { (_, v) -> v.toUpperCase() + "-trans" }.forEach { println(it) }
    map.mapValues { (_, v): Map.Entry<String, String> -> v.toUpperCase() + "-trans" }
    map.mapValues { (_, v: String) -> v.toUpperCase() + "-trans" }
}
