package com.lsgggg123.demo.kotlin.implementation

/**
 *
 * @author: lsggg
 * @date: 2021/1/24
 */
open class BaseClass {
    open fun method() {

    }
}

//抽象类对普通类的继承可以做抽象继承
abstract class ChildClass : BaseClass() {
    abstract override fun method()
}