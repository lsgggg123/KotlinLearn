package com.lsgggg123.demo.kotlin.lambda

/*
    lambda2 中的 action 只接受一个参数，在调用的时候可以省略
 */
fun main() {
    lambda(1) { }
    lambda2(1) { }
    lambda2(1) { println(it) }
    lambda3()
    lambda4(4)
    lambda5(5) { x: Int, y: Int ->
        x + y
    }

    // 方法引用
    lambda(1, ::lambda3)
    lambda2(2, ::lambda4)
    lambda5(5, ::lambda6)
}

fun lambda(x: Int, action: () -> Unit) {
    println("lambda, action has no arguments")
    action.invoke()
}

fun lambda2(x: Int, action: (Int) -> Unit) {
    println("lambda2, action has one arguments")
    action(x)
}

fun lambda3() {
    println("lambda3")
}

fun lambda4(x: Int) {
    println("lambda4, x=$x")
}

fun lambda5(x: Int, action: (Int, Int) -> Unit) {
    println("lambda5, x=$x")
    action(x, x)
}

fun lambda6(x: Int, y: Int) {
    println("lambda6, x=$x, y=$y")
}