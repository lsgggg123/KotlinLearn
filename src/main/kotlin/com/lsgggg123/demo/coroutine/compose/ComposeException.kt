package com.lsgggg123.demo.coroutine.compose

import kotlinx.coroutines.async
import kotlinx.coroutines.coroutineScope
import kotlinx.coroutines.delay
import kotlinx.coroutines.runBlocking

/*
    两个协程都能取消
    关于父子协程的异常与取消问题，当协程存在父子关系的话，不管是抛出了异常还是出现了取消，都会沿着层次关系向上传播
 */
private suspend fun failureComputation(): Int = coroutineScope {
    val value1 = async<Int> {
        try {
            delay(9000)
            50
        } finally {
            println("value1 was cancelled")
        }
    }

    val value2 = async<Int> {
        delay(1000)
        println("value2 was cancelled")
        throw Exception()
    }
    value1.await() + value2.await()
}

fun main() = runBlocking {
    val cal = failureComputation()
    println(cal)
}