package com.lsgggg123.demo.kotlin.oop

/*
    解构声明
    https://www.bilibili.com/video/BV1CQ4y1A7WQ?p=31
 */
data class MyResult(val result: String, val status: Int)

fun myMethod(): MyResult {
    return MyResult("Success", 1)
}

fun myMethod2(): Pair<String, Int> {
    return Pair("string", 4)
}

fun myMethod3(): Triple<String, String, String> {
    return Triple("1a", "2b", "c3")
}

fun main() {
    val myResult = myMethod()

    val (result, status) = myMethod()
    println(result)
    println(status)

    val (result2, status2) = myMethod2()
    println(result2)
    println(status2)

    val (result3, status3, s3) = myMethod3()
    println(result3)
    println(status3)
    println(s3)
}