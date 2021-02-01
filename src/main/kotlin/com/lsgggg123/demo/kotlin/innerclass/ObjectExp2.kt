package com.lsgggg123.demo.kotlin.innerclass

// 1. 匿名对象只能在局部变量范围内或者 private 修饰范围内才可以识别具体的类型
// 2. 如果 objectExp 不是 private 类型, 它的实际类型是 object 声明的父类型，但这里没有父类型
//    所以 public 的 objectExp 是 Any 类型，Any 类型没有 output 方法

class MyClass {
    // 不能去掉 private
    private var objectExp = object {
        fun output() {
            println("output invoked");
        }
    }

    fun test() {
        println(objectExp.javaClass)
        objectExp.output()
    }
}

class MyClass2 {
    private fun m1() = object {
        val str = "m1"
    }

    internal fun m2() = object {
        val str = "m2"
    }

    fun methodTest() {
        m1().str
        m2() // m2 被当成 Any 没有 .str
    }

}

fun main() {
    MyClass().test()
}