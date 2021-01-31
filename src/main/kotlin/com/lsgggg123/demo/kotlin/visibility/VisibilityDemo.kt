package com.lsgggg123.demo.kotlin.visibility

// 可见性
// private protected internal public


// 顶层声明的时候
// public (默认) 同 java，任何地方都能用
// internal 同一个模块下可用
// protected 同 java，不能修饰顶层声明
// private 同 java，只能在当前文件可用
class VisibilityDemo {
    internal fun test() {
        println("test")
    }
}

fun main() {
    VisibilityDemo().test()
}