package com.lsgggg123.demo.coroutine.create

import kotlinx.coroutines.GlobalScope
import kotlinx.coroutines.delay
import kotlinx.coroutines.launch

/*
    全局协程类似于守护线程（daemon thread）
    特点是：使用 GlobalScope 启动的协程并不会保持进程的声明，他们就像是守护线程一样
 */
fun main() {
    GlobalScope.launch {
        repeat(10) {
            delay(400)
            println("I'm sleeping $it")
        }
    }
    Thread.sleep(2100)
}