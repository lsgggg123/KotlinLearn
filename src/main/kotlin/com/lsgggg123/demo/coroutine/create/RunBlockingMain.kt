package com.lsgggg123.demo.coroutine.create

import kotlinx.coroutines.GlobalScope
import kotlinx.coroutines.delay
import kotlinx.coroutines.launch
import kotlinx.coroutines.runBlocking

fun main() = runBlocking {
    GlobalScope.launch {
        delay(1000)
        println("coroutine in launch")
    }

    println("runBlocking main")
    delay(2000)
}