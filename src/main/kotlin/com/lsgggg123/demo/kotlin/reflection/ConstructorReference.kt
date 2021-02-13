package com.lsgggg123.demo.kotlin.reflection

/*
    构造方法引用 (Constructor Reference)
    两点要求：
    函数对象的参数要与构造方法的参数保持一致（参数个数和类型）
    函数对象的返回结果要与构造方法所在类的类型保持一致
 */
class B(val x: Int)

fun factoryB(factory: (Int) -> B, x: Int):B {
    return factory.invoke(x)
}

fun main() {
    val b = factoryB(::B, 20)
    println(b.x)
}