package com.lsgggg123.demo.kotlin.companion

// 对象声明 可以有方法和属性（和类一样）
object ObjectDeclare {
    fun method() {
        println("method")
    }
}

// 伴生对象
// 在 java 中有静态方法的替代（全局方法的概念）
// 在 Kotlin 中类没有 static 方法
// 在大多情况下 Kotlin 推荐的做法是使用包级别的函数来做静态方法
// Kotlin 会将包级别的函数当作静态方法来看待

class MyTest {
    // 伴生对象 伴随 MyTest 而存在 一个类只能有一个伴生对象
    // 如果伴生对象没有名字 编译器会提供默认名字 Companion
    // 相当于一个内部类
    // 伴生对象看起来像是 java 中的静态成员 但是在运行期他们依旧是实例成员
    // 在 JVM 上可以将伴生对象的成员真正生成为类的静态方法与属性 这是通过 @JvmStatic 注释来实现的
    // 伴生对象在编译后会生成一个静态内部类
    companion object MyObject {
        var a: Int = 100

        @JvmStatic
        fun method() {
            println("MyTest MyObject method invoke")
        }
    }

}

fun main() {
    // 对象可以直接被调用 不用像类一样创建对象后再使用
    ObjectDeclare.method()

    MyTest.MyObject.method()
    MyTest.method()
    println(MyTest.a)

    val v = MyTest.MyObject.javaClass
    println(v)
}