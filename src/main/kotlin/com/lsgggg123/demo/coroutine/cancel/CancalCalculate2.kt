package com.lsgggg123.demo.coroutine.cancel

import kotlinx.coroutines.*

fun main() = runBlocking {
    val startTime = System.currentTimeMillis()
    val job = launch(Dispatchers.Default) {
        var nextPrintTime = startTime
        var i = 0
        while (i < 20 && isActive) {
            if (System.currentTimeMillis() >= nextPrintTime) {
                println("job: I am sleeping ${i++}")
                nextPrintTime += 500
            }
        }
    }
    delay(1300)
    println("hello world")
    job.cancelAndJoin()
    println("welcome")
}