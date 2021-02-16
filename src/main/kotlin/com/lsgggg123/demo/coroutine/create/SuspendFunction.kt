package com.lsgggg123.demo.coroutine.create

import kotlinx.coroutines.*

/*
    被 suspend 修饰的函数叫做挂起函数 (suspending function)

    挂起函数可以像普通函数一样用在协程当中，不过它拥有自己的一些特性：可以使用其他的挂起函数。
    重点：挂起函数只能用在协程或者另外一个挂起函数当中。

    挂起函数不执行完，是不能执行后面的代码的!
    挂起函数是一个提醒，我本身耗时，请放在协程里面执行!
 */
suspend fun ioBlocking() {
    delay(4000)
    println("io finished, in thread: " + Thread.currentThread().name)
}

suspend fun callIO() {
    withContext(Dispatchers.IO) {
        ioBlocking()
    }
    println("callIO submit, continue in thread: " + Thread.currentThread().name)
}

fun main() = runBlocking {
    launch {
        callIO()
    }
    println("runBlocking finished, in thread: " + Thread.currentThread().name)
}