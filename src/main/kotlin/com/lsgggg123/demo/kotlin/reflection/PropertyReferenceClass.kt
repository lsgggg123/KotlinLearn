package com.lsgggg123.demo.kotlin.reflection

import kotlin.reflect.jvm.javaField
import kotlin.reflect.jvm.javaGetter

/*
    p44
 */
class T(val x: Int)

fun main() {
    println(T::x)
    println(T::x.javaGetter)
    println(T::x.javaField)

    println("-----------")

    println(T(10).javaClass)
    println(T(10).javaClass.kotlin)

    println(String.javaClass)
    println(String.javaClass.kotlin)
}