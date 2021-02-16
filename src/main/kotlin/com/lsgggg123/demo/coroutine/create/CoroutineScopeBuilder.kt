package com.lsgggg123.demo.coroutine.create

import kotlinx.coroutines.coroutineScope
import kotlinx.coroutines.delay
import kotlinx.coroutines.launch
import kotlinx.coroutines.runBlocking

/*
    除去不同的协程构建器所提供的协程作用域之外，我们还可以通过 coroutineScope builder 来声明自己的作用域。
    该构建器会创建一个协程作用域，并且会等待所有启动的子协程全部完成后自身才会完成。

    runBlocking 与 coroutineScope 之间的主要差别在于:
    后者 (coroutineScope builder) 在等待所有子协程完成其任务是并不会阻塞当前的线程。
    而 runBlocking 会阻塞主线程，仅用于调试

    runBlocking 并非挂起函数；也就是说，调用它的线程会一直位于该函数之中，直到协程执行完毕为止。
    coroutineScope 是挂起函数；也就是说如果其中的协程挂起，那么 coroutineScope 函数也会挂起，
    这样创建 coroutineScope 的外层函数就可以继续在同一个线程中执行了。
    该线程会「逃离」coroutineScope 之外，并且可以做其他一些事情。
 */
fun main() = runBlocking {
    launch {
        delay(1000)
        println("long task1 finish")
    }
    println("wait task1 finished")

    /*
        coroutineScope 等待所有子协程结束后自身才会结束
        last print 最后输出是因为 coroutineScope 方法是 suspend 和 delay 一样都是会阻塞流程继续，但是不会阻塞线程
     */
    coroutineScope {
        launch {
            delay(3000)
            println("long task2 finish")
        }
        delay(2000)
        println("wait task2 finished")
    }

    println("last print")
}