package com.lsgggg123.demo.kotlin.innerclass

class OuterClass {
    private val str: String = "hello world"

    class NestedClass {
        fun nestedMethod():String {
            return "welcome"
        }
    }

    //局部嵌套类 作用域仅限方法内部
    fun getName(): String {
        class LocalNestedClass {
            val name: String = "my test"
        }
        return LocalNestedClass().name
    }
}

fun main() {
    println(OuterClass.NestedClass().nestedMethod())

    println(OuterClass().getName())
}

