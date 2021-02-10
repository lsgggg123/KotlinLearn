package com.lsgggg123.demo.kotlin.lambda

/*
    中缀符合 （infix notation）
    符合条件:
    1. 函数必须是成员函数
    2. 函数只拥有单个参数
    3. infix 修饰函数
 */
class InfixNotation(var i: Int) {
    infix fun add(a: Int): Int {
        return a + i
    }
}

fun main() {
    val infix = InfixNotation(2)
    println(infix add 4)
}