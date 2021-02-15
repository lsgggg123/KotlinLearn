package com.lsgggg123.demo.coroutine

import kotlinx.coroutines.GlobalScope
import kotlinx.coroutines.delay
import kotlinx.coroutines.launch
import kotlinx.coroutines.runBlocking

fun main() {
    val job = GlobalScope.launch {
        delay(1000)
        println("coroutine delay 1000 finished")
    }

    println("main1")

    runBlocking {
        delay(2000)
        println("coroutine delay 2000 finished")
    }
    println("main2")
}