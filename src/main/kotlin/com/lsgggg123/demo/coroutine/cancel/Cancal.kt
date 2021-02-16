package com.lsgggg123.demo.coroutine.cancel

import kotlinx.coroutines.*

/*
    kotlinx.coroutines 包下的所有挂起函数都是可以取消的
    他们会检查协程的取消状态，当取消时就会抛出 CancellationException 异常（运行期异常）
    不过，如果协程正在处于某个计算过程当中，并且没有检查取消状态，那么他就是无法被取消的。
 */
fun main() = runBlocking {
    val job = GlobalScope.launch {
        repeat(100, action = {
            delay(200)
            println("loop $it")
        })
    }
    delay(1000)
    job.cancel()
    job.join()
    // job.cancelAndJoin()
    println("end")
}