package com.lsgggg123.demo.kotlin.reflection

import kotlin.reflect.KProperty

/*
    属性引用（Property Reference）
    :: 形式
    p43
 */
const val a = 1
var b = 3

fun main() {
    println(::a) // 表示类型 KProperty<Int> 的属性对象，可以通过 get 来获取值，name 来获取属性名
    println(::a.get())
    println(::a.name)

    val kp: KProperty<Int> = ::a
    println(kp::class.java)
    println("-----------------")

    println(::b) // 表示类型 KMutableProperty<Int> 的属性对象，拥有 set 方法
    ::b.set(5)
    println(b)
}