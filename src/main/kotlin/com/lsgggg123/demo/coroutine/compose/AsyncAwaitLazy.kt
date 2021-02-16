package com.lsgggg123.demo.coroutine.compose

import kotlinx.coroutines.CoroutineStart
import kotlinx.coroutines.async
import kotlinx.coroutines.runBlocking
import kotlin.system.measureTimeMillis

/*
    使用 async 和 await 实现并发
    从概念上来说，async 就像是 launch 一样，它会开启一个单独的协程，这个协程是个轻量级线程，可以与其他协程并发工作。
    区别在于 launch会 返回一个 Job，但是 Job 并不会持有任何结果值，而 async 会返回一个 Deferred，这是一个轻量级的非阻塞的 future，它代表一个 promise，可以再稍后提供一个结果值。

    Deferred 继承自 Job，因此也可以取消
 */

fun main() = runBlocking {
    val elapsedTime = measureTimeMillis {
        val deferred1 = async(start = CoroutineStart.LAZY) { suspend1() }
        val deferred2 = async(start = CoroutineStart.LAZY) { suspend2() }

        Thread.sleep(3000)

        // start() 后才开始执行
        // 如果不调用 start()，等到 await() 的时候才会开始
        deferred1.start()
        deferred2.start()

        val value1 = deferred1.await()
        val value2 = deferred2.await()
        println("value1 + value2 = ${value1 + value2}")
    }

    println("total time: $elapsedTime")
}