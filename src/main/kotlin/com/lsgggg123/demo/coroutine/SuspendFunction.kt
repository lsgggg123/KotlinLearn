package com.lsgggg123.demo.coroutine

import kotlinx.coroutines.delay
import kotlinx.coroutines.launch
import kotlinx.coroutines.runBlocking

/*
    被 suspend 修饰的函数叫做挂起函数 (suspending function)

    挂起函数可以像普通函数一样用在协程当中，不过它拥有自己的一些特性：可以使用其他的挂起函数。
    重点：挂起函数只能用在协程或者另外一个挂起函数当中。
 */
suspend fun ioBlocking() {
    delay(4000)
    println("io finish")
}

suspend fun callIO() {
    ioBlocking()
}

fun main() = runBlocking {
    launch {
        callIO()
    }
    println("runBlocking finish")
}