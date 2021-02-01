package com.lsgggg123.demo.kotlin.innerclass


// 类似 Java 的匿名内部类，Kotlin 对象表达式中的代码食可以访问到外层的变量的。
// 与 Java 不同的是，外层变量无需声明为 final

fun main() {
    var i = 100
    val myObject = object {
        fun myMethod() {
            i++
        }
    }

    myObject.myMethod()
    println(i)
}