package com.lsgggg123.demo.coroutine.threadlocal

import kotlinx.coroutines.*

fun main() = runBlocking {
    val tl = ThreadLocal<String>()
    tl.set("abc")
    println("1-thread local value is ${tl.get()}, current thread is: ${Thread.currentThread().name}")

    launch(Dispatchers.Default + tl.asContextElement()) {
        withContext(tl.asContextElement("new-value")) {
            println("2-thread local value is ${tl.get()}, current thread is: ${Thread.currentThread().name}")
            yield()
            println("3-thread local value is ${tl.get()}, current thread is: ${Thread.currentThread().name}")
        }
    }

    println("end")
}