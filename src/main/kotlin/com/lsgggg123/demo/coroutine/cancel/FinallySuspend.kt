package com.lsgggg123.demo.coroutine.cancel

import kotlinx.coroutines.*


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
            withContext(NonCancellable) {
                println("执行了 withContext 块")
                try {
                    delay(1000)
                    println("在 withContext delay 后执行的代码片段")
                } catch (ex: Exception) {
                    println("withContext 捕获了一个异常 ${ex.localizedMessage}")
                }
            }

            delay(1000)
            println("finally cleaning")
        }
    }
    delay(1300)
    println("before cancel")
    myJob.cancelAndJoin()
    println("after cancel")
}