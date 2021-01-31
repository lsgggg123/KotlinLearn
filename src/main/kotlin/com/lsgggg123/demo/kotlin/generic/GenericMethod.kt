package com.lsgggg123.demo.kotlin.generic

fun <T> getValue(item: T): T {
    return item
}

// 这里的 T 代表只能是实现了 Comparable 接口的对象
fun <T: Comparable<T>> upperClassBound(t: T) {}

// T 有多个上界
class UpperBoundsClass2<T> where T : Comparable<T>, T : Any

fun main() {
    println(getValue<Int>(3))
    println(getValue("a3"))

    upperClassBound(1)
    val upperBounds2 = UpperBoundsClass2<String>()
}