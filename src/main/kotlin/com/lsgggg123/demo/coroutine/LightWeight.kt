package com.lsgggg123.demo.coroutine

import kotlinx.coroutines.delay
import kotlinx.coroutines.launch
import kotlinx.coroutines.runBlocking

fun main() = runBlocking {
    repeat(1000, action = {
        launch {
            delay(100)
            println("repeat $it")
        }
    })
    println("1000 coroutine")
}