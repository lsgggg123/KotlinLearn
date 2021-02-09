package com.lsgggg123.demo.kotlin.lambda

// 默认参数 default argument
fun add(x: Int = 1, y: Int = 1) = println(x + y)

open class Super {
    open fun method(a: Int, b: Int = 5) = a + b
}

// 对于重写的方法来说，子类所拥有的重写方法会使用与父类相同的默认参数值，method 中的 b 也具有默认值 4
// 在重写一个拥有默认参数的方法时，方法签名中必须要将默认参数值省略
// 带 override 的函数不能指明默认值
class Sub : Super() {
    override fun method(a: Int, b: Int) = a + b
}

// 如果一个默认参数位于其他无默认值的参数前面，那么无默认值的参数只能通过在调用函数时使用具名参数的方式来使用
fun test2(a: Int = 10, b: Int) = println(a - b)

fun main() {
    add()
    add(2)
    add(3, 4)
    add(y = 2)

    println("----------------")

    println(Sub().method(1))
    println(Sub().method(1, 3))
    println(Sub().method(a = 2))
    println(Sub().method(a = 2, b = 3))

    println("----------------")

    test2(b = 2)
}