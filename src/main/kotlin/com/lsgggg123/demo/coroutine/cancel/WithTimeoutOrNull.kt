package com.lsgggg123.demo.coroutine.cancel

import kotlinx.coroutines.delay
import kotlinx.coroutines.runBlocking
import kotlinx.coroutines.withTimeoutOrNull

/*
    由 withTimeout 函数调用所抛出的 TimeoutCancellationException 异常是 CancellationException 的子类
    当该异常抛出时，我们并未在控制台上看到整个异常堆栈信息，这是因为在取消的协程当中，
    CancellationException 被认为是一种协程完成的正常原因而已。
    不过我们在该示例中，是在 main 函数中使用了 withContext 函数调用
    既然 CancellationException 仅仅是个异常而已，所有的资源也都会以通常的方式来关闭，
    那么我们就可以将相关代码放到一个 try...catch 块中；此外，Kotlin 还提供了更友好的函数调用：
    withTimeoutOrNull；从功能角度来看，他非常类似于 withTimeout，不过当超时发生时，
    它并不会抛出 CancellationException 异常，而是会直接返回null
 */
fun main() = runBlocking {
    val result = withTimeoutOrNull(2000) {
        repeat(10) {
            println("hello $it")
            delay(500)
        }
        "success"
    }
    // result 的值是 null 或者 success
    println(result)
}