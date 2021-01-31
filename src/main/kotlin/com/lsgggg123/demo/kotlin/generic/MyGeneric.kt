package com.lsgggg123.demo.kotlin.generic

class MyGeneric<T>(var t: T) {
    var type: T = t
}

fun main() {
    // val myGeneric: MyGeneric<String> = MyGeneric<String>("1")
    val myGeneric = MyGeneric("1")

    myTest(MyClass("a", 1))
}

// 协变 (covariant) 与逆变 (contravariant)
// 协变：List<Integer> List<? extends Number> 用于读取，producer
// 逆变：List<? super Integer> 用于写入，consumer

class MyClass<out T, in R>(t: T, r: R) {
    private var t: T = t
    private var r: R = r

    fun getT():T = t

    fun setR(r: R) {
        this.r = r
    }
}

fun myTest(myClass: MyClass<String, Number>) {
    val c:MyClass<Any, Int> = myClass
    println(c.getT())
    c.setR(2)
}