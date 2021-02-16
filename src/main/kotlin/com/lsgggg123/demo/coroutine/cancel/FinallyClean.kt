package com.lsgggg123.demo.coroutine.cancel

import kotlinx.coroutines.cancelAndJoin
import kotlinx.coroutines.delay
import kotlinx.coroutines.launch
import kotlinx.coroutines.runBlocking


/*
    使用 finally 来关闭资源
    join 与 cancelAndJoin 都会等待所有清理动作完成后才会继续往下执行
 */

fun main() = runBlocking {
    val myJob = launch {
        try {
            repeat(100) { i ->
                println("job I am sleeping $i")
                delay(500)
            }
        } finally {
            println("finally cleaning")
        }
    }
    delay(1300)
    println("before cancel")
    myJob.cancelAndJoin()
    println("after cancel")
}