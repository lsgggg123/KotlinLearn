package com.lsgggg123.demo.kotlin.implementation

/**
 *
 * @author: lsggg
 * @date: 2021/1/24
 */
interface A {
    fun m() {
        println("A")
    }
}

open class B {
    open fun m() {
        println("B")
    }
}

class C : A, B() {
    // 这种情况下必须 override m
    override fun m() {
        println("C")
        super<A>.m()
        super<B>.m()
    }
}

fun main() {
    val c = C()
    c.m()
}