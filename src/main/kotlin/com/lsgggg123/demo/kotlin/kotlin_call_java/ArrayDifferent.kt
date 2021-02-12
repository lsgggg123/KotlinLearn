package com.lsgggg123.demo.kotlin.kotlin_call_java

/*
    数组
    在 Kotlin 中 array 是非协变逆变的,这一点与 Java 存在明显的不同。
    这意味着，我们无法将一个 Array<String> 赋给 Array<Any>，这样就可以防止可能出现的运行时异常
 */
fun varargMethod(vararg info: String) {
    println(info.javaClass)
    info.forEach { println(it) }
}

fun main() {
    val info = arrayOf("a", "b", "c")
    varargMethod(*info)

    /*
        一下代码在 java 中可以编译通过，但运行异常
        Object[] objects = new String[2];
        objects[0] = 1;
        objects[1] = 2;
     */

    val intArr = intArrayOf(1, 2, 3);
    val array = arrayOf("a", "b", "c")
    // array = intArr // compile error

    val javaUser = JavaUser()
    javaUser.scores = intArr
    javaUser.strArr = array
}