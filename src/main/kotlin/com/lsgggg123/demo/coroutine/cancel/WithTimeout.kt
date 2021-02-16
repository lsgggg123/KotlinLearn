package com.lsgggg123.demo.coroutine.cancel

import kotlinx.coroutines.delay
import kotlinx.coroutines.runBlocking
import kotlinx.coroutines.withTimeout

/*
    我们在使用协程时，如果取消了协程，那么很大一部分原因在于协程的执行时间超过了某个设定值；
    我们可以通过手工引用与协程对应的 Job 的方式来启动一个单独的协程用于取消这个协程
    不过 Kotlin 提供了一个内建的函数来帮助我们又快又好的做到这一点。
 */

fun main() = runBlocking {
    try {
        withTimeout(2000) {
            repeat(10) {
                println("hello $it")
                delay(500)
            }
        }
    } catch (ex: Exception) {
        println("捕获了一个异常 ${ex.localizedMessage}")
    }
}