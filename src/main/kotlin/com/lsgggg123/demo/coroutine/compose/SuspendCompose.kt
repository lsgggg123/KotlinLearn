package com.lsgggg123.demo.coroutine.compose

import kotlinx.coroutines.*
import kotlin.system.measureTimeMillis

/*
    suspend 关键字导致前者必须执行完才能执行下一个
 */
suspend fun suspend1(): Int {
    delay(2000)
    return 15
}

suspend fun suspend2(): Int {
    delay(3000)
    return 20
}

fun suspend1Async() = GlobalScope.async {
    suspend1()
}

fun suspend2Async() = GlobalScope.async {
    suspend2()
}

suspend fun intSum(): Int = coroutineScope {
    val deferred1 = async { suspend1() }
    val deferred2 = async { suspend2() }
    deferred1.await() + deferred2.await()
}

fun main() = runBlocking {
    val elapsedTime = measureTimeMillis {
        //都是挂起函数 所以会挂起协程并等待
        val value1 = suspend1()
        val value2 = suspend2()

        println("value1 + value2 = ${value1 + value2}")
    }

    println("total time: $elapsedTime")
}