package com.lsgggg123.demo.coroutine.util

import kotlinx.coroutines.async
import kotlinx.coroutines.runBlocking

/*
    add -Dkotlinx.coroutines.debug jvm parameter
 */
fun log(logMessage: String) = println("[${Thread.currentThread().name}] $logMessage")

fun main() = runBlocking<Unit> {
    val a = async {
        log("async 1")
        10
    }

    val b = async {
        log("async 2")
        20
    }
    log("the result is ${a.await() * b.await()}")
}