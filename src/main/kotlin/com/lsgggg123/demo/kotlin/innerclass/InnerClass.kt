package com.lsgggg123.demo.kotlin.innerclass

// inner class
class OuterClass2 {
    private val str: String = "hello world"

    inner class InnerClass {
        fun innerMethod():String {
            return "welcome: $str" + this@OuterClass2.info()
        }
    }

    fun info():String {
        return ", kotlin"
    }
}

fun main() {
    println(OuterClass2().InnerClass().innerMethod())
}