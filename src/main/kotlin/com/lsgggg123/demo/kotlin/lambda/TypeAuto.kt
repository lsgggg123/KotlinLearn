package com.lsgggg123.demo.kotlin.lambda

/*
    函数、方法引用
    支持重载 ::
    p42
 */

fun x(x: Int): Int = x * 2
fun x(s: String): Int = 10

val lambdaRef: (Int) -> Int = ::x
val lambdaStrRef: (String) -> Int = ::x

val charAt: (String, Int) -> Char = String::get
val charAt2: String.(Int) -> Char = String::get

fun main() {
    val intArray = intArrayOf(0, 1, 2, 3)
    intArray.map(::x).forEach { println(it) }

    val strArray = arrayOf("b", "t")
    strArray.map(::x).forEach { println(it) }

    val str = "chat"
    intArray.forEach { print(charAt(str, it)) }
    intArray.forEach { print(charAt2(str, it)) }
}