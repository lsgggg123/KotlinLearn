package com.lsgggg123.oop

/**
 *
 * @author: lsggg
 * @date: 2021/1/23
 */
open class User {
    open val name: String get() = "foo"

    open fun method() {
        println("parent method")
    }
}

class SubUser : User() {
    override fun method() {
        super.method()
        println("SubUser method")
    }

    // val 可以被 val var 覆盖  var 可以重写 var
    // 因为 var 是变量 同时有 get set 方法 但是val是常量只有get方法
    override val name: String get() = super.name + " SubUser child"
}