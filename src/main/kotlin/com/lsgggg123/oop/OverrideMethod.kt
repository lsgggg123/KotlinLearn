package com.lsgggg123.oop

/**
 *
 * @author: lsggg
 * @date: 2021/1/23
 */
open class Fruit {
    // 可被覆盖的方法也必须写上 open
    // 可被复写的方法也必须有方法体
    open fun name() {
        println("fruit")
    }

    fun expirationData() {
        println("1 month")
    }
}

class Apple  : Fruit() {
    // override 必须强制加上 override 关键字
    override fun name() {
        println("Apple")
    }
}

open class Orange : Fruit() {
    final override fun name() {
        println("Orange")
    }
}

class SubOrange : Orange() {
     // override fun name() { println("Orange") }
}

fun main() {
    var apple = Apple()
    apple.name()

    var orange = Orange()
    orange.name()
}