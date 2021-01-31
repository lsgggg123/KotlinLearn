package com.lsgggg123.demo.kotlin.extension

//扩展的作用域
/*
 扩展函数所定义在的类实例叫做分发接收者（dispatch receiver）
 扩展函数所扩展的那个类的实例叫做扩展接收者（extension receiver）
 当以上两个名字出现冲突时 扩展接收者优先级最高
* */

class DD {
    fun method() {
        println("DD method")
    }
}

class EE {
    fun method2() {
        println("EE method2")
    }

    fun world(dd: DD) {
        dd.hello()
    }

    fun DD.hello() {
        method() // 直接调用了 DD 已经拥有的方法和属性
        method2() // 也可以使用所在类的方法和属性
        println("DD hello")
    }

    fun DD.output() {
        println(toString()) // 其实调用的是 DD 的 toString()
        println(this@EE.toString()) // 这样调用的是 EE 的 toString()
    }

    fun test() {
        var dd = DD()
        dd.output()
    }
}

fun main() {
    var dd = DD()
    // dd.hello() 不可用 因为 hello 是再 EE 内部声明的 作用域仅限 EE

    EE().test()
}

// 扩展可以很好的解决 JAVA 中充斥的各种辅助类的问题 比如 Collections 类