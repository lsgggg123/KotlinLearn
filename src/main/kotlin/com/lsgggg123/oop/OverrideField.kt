package com.lsgggg123.oop

/**
 *
 * @author: lsggg
 * @date: 2021/1/23
 */
open class MyParent {
    open val name: String = "parent"
    val test: String = "test"
}

class MyChild : MyParent() {
    override val name: String = "child"
}

class MyChild2(override val name: String) : MyParent() {
    fun name() {
        println(this.name)
    }
}

fun main() {
    var myChild2 =  MyChild2("z3")
    myChild2.name()
}