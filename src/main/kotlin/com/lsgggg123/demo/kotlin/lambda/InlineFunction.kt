package com.lsgggg123.demo.kotlin.lambda

/*
   内联函数 (inline function)
   通过字节码可以看出来，调用内联函数的地方，代码做了替换，直接把调用换成了内联函数内的代码
 */
inline fun inlineFunc(x: Int, y: Int)  = x + y

fun main() {
    println(inlineFunc(1, 2))
}