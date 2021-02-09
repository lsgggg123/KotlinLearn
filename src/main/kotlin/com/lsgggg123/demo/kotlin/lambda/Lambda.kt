package com.lsgggg123.demo.kotlin.lambda

// 如果函数的最后一个参数是 lambda 表达式，而且调用方式在圆括号之外，就可以不为默认参数具名
fun compute(x: Int = 3, y: Int = 4, com: (a: Int, b: Int) -> Unit) {
    com(x, y)
}

fun comImpl(i: Int, j: Int) {
    println(i * j)
}

fun main() {
    // 不使用用默认值
    compute(2, 3, ::comImpl)
    compute(2, 3, { a, b -> println(a - b) })
    compute(2, 3) { a, b -> println(a - b) }

    // 使用默认值
    compute() { a, b -> println(a - b) }
    compute(2) { a, b -> println(a - b) }
    compute(y = 2) { a, b -> println(a - b) }

    // com 可省略具名
    compute(com = { a, b -> println(a - b) })
    compute() { a, b -> println(a - b) }
}