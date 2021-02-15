package com.lsgggg123.demo.coroutine

import kotlin.concurrent.thread

fun main() {
    thread {
        Thread.sleep(1000)
        println("Hello java thread")
    }

    /*
     上面的完整写法：
     thread(start = true,
        isDaemon = false,
        contextClassLoader = null,
        name = null,
        priority = -1,
        block = {
            Thread.sleep(1000)
            println("Hello java thread")
        })
     */

    println("Hello main")
    Thread.sleep(2000)
}