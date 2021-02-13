package com.lsgggg123.demo.kotlin.reflection

import kotlin.reflect.KClass

fun main() {
    val kClass1: KClass<out String> = "kotlin"::class
    val kClass2: KClass<out String> = "java"::class
    val kClass3: KClass<out String> = "ruby"::class
    println(kClass1)
    println(kClass2)
    println(kClass3)
    println(kClass1 == kClass2)
    println(kClass2 == kClass3)
    println("----------------")
    val kClass = Class.forName("java.util.Date").kotlin
    println(kClass)
    println(Class.forName("java.util.Date"))
    println(kClass == Class.forName("java.util.Date")) // 输出 false
    println(kClass == Class.forName("java.util.Date").kotlin) // 输出 true
    println(kClass::class)
    println(kClass::class.java)
    println(kClass::class.java.kotlin)
}