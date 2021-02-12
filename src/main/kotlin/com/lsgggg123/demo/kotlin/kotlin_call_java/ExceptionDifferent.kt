package com.lsgggg123.demo.kotlin.kotlin_call_java

import kotlin.reflect.KClass

fun main() {
    val e = JavaCheckedException()
    // e.ioe() // 无需 try catch

    val clz: KClass<JavaCheckedException> = JavaCheckedException::class
    println(clz)
    println(clz.java)
}