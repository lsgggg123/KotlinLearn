package com.lsgggg123.demo.kotlin.reflection

fun main() {
    val s = "android"
    val ref = s::get
    println(ref(0))
    println(s::length.get())

    val classRef = String::length
    println(classRef.get(s))
}