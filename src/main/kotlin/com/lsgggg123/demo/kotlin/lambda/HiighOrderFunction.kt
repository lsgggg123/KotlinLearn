package com.lsgggg123.demo.kotlin.lambda

/*
    高阶函数（high-order function）
    使用一个函数作为参数，或者返回值是一个函数

    Lambda 表达式要求：
    1. 一个 lambda 表达式总是被一对花括号所包围
    2. 参数（如果有的话）位于 -> 之前（类型可省略）
    3. 执行体位于 -> 之后
 */
val add: (Int, Int) -> Int = { a: Int, b: Int -> a + b }
val multiply: (Int, Int) -> Int = { a, b -> a * b }
val subtract = { a: Int, b: Int -> a - b }

val info = { println("hello word") }  // val info: () -> Unit = { println("hello word") }
val retNull: (Int, Int) -> Int? = { _, _ -> null } // _ 代表占位符，在函数中不会用
val funcNull: ((Int, Int) -> Int)? = null
