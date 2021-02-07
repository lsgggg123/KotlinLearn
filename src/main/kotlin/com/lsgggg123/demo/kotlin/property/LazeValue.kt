package com.lsgggg123.demo.kotlin.property

// lazy(supplier) 如果一个函数最后一个参数是 lambda，那么可以把括号省略
// LazyThreadSafetyMode

/*
    1.SYNCHRONIZED：默认情况下，延迟属性的计算是同步的，值只会在一个线程中得到计算，所有线程都会使用相同的结果。
    2.PUBLICATION：如果不需要初始化委托的同步，这样多个线程可以同时执行
    3.NONE：如果确定初始化操作只会在一个线程中执行，这样会减少线程安全方面的开销
 */
val LazeValue: Int by lazy {
    println("laze init")

    30
}

fun main() {
    println(LazeValue)
    println(LazeValue)
}