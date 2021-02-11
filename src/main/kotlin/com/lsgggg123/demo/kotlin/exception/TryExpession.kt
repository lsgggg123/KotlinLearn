package com.lsgggg123.demo.kotlin.exception

import java.lang.Integer.parseInt
import java.lang.NumberFormatException

/*
   try 在 kotlin 中是个表达式
   try 的返回值是 try 或者 catch 中的最后一个表达式的值

   Kotlin 中是没有 checked exception（编译时异常 即 throw 操作）
   只有运行时异常（unchecked exception）
 */
fun main() {
    val s = "3"
    val  result: Int? = try {
        parseInt(s)
    } catch (ex: NumberFormatException) {
        null
    } finally {
        println("finally")
    }
}