package com.lsgggg123.demo.kotlin.lambda

 // 默认参数 default argument

fun add(x: Int = 1, y: Int = 1) = print(x + y)

fun main() {
    add()
    add(2)
    add(3, 4)
    add(y = 2)
}