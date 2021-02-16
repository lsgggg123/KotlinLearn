package com.lsgggg123.demo.coroutine.create

import kotlinx.coroutines.GlobalScope
import kotlinx.coroutines.delay
import kotlinx.coroutines.launch
import kotlinx.coroutines.runBlocking

fun main() = runBlocking {
    val job = GlobalScope.launch {
        delay(1000)
        println("long task finish")
    }
    job.join()
    println("wait task finished in main")
}