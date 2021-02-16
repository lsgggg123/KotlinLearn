package com.lsgggg123.demo.coroutine.compose

import kotlinx.coroutines.runBlocking
import kotlin.system.measureTimeMillis

fun main() {
    val elapsedTime = measureTimeMillis {
        val deferred1 = suspend1Async()
        val deferred2 = suspend2Async()
        // 这种异步风格的函数官方不建议使用，
        // 因为如果在当前这里发生了异常，程序终止后，不会执行后面的代码，
        // 协程可能会没有机会被停止
        runBlocking {
            println("the answer is ${deferred1.await() + deferred2.await()}")
        }
    }
    println("total time: $elapsedTime")

    // 推荐的写法
    val elapsedTime2 = measureTimeMillis {
        runBlocking {
            println("the answer is " + intSum())
        }
    }
    println("total time: $elapsedTime2")
}