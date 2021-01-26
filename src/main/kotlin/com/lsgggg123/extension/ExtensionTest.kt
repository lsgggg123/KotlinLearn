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

// 扩展方法和既有方法签名完全相同 既有函数优先级更高
class CC {
    fun foo() {
        println("member")
    }
}

fun CC.foo() {
    println("member2")
}

fun CC.foo(i: Int) {
    println("member3")
}

// 对可空类型扩展
fun Any?.toString(): String {
    return when (this) {
        null -> {
            "null"
        }
        else -> {
            toString()
        }
    }
}

fun main() {
    val extension = ExtensionTest()
    println(extension.add(1,2))
    println(extension.subtract(7,2))
    println(extension.ext(3,4))

    println("-----------------")

    // 输出都是 a
    printInfo(AA())
    printInfo(BB())

    // 扩展方法和既有方法签名完全相同 既有函数优先级更高
    println("-----------------")
    CC().foo()
    CC().foo(1)
}