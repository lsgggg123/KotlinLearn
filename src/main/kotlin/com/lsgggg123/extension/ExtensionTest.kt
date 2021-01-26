package com.lsgggg123.extension

class ExtensionTest {
    fun add(x: Int, y: Int) = x + y
    fun subtract(x: Int, y: Int) = x - y
}

// 扩展方法
/* 扩展函数的解析是静态的 并不会插入原类
*  扩展函数的解析是静态分发的，而是不是动态的，即扩展时不支持多态的 调用值取决于对象的声明类型（Java取决于实例化的对象类型 即动态解析）
*  调用是由对象的声明类型决定的，而不是由对象的实际类型决定的
* */
fun ExtensionTest.ext(x: Int, y: Int) = x * y

// 扩展方法多态的验证
open class AA
open class BB: AA()

fun AA.a() = "a"
fun BB.a() = "b"

fun printInfo(a: AA) {
    println(a.a())
}

fun main() {
    val extension = ExtensionTest()
    println(extension.add(1,2))
    println(extension.subtract(7,2))
    println(extension.ext(3,4))

    // 输出都是 a
    printInfo(AA())
    printInfo(BB())
}