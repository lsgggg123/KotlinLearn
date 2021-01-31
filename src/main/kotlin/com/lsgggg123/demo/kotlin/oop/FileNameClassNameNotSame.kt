package com.lsgggg123.demo.kotlin.oop

/**
 *
 * @author: lsggg
 * @date: 2021/1/22
 */
class ClassWithouBody

class MyClass constructor(name: String) {
    private var name: String = name.toUpperCase()
    init {
        this.name = name.toLowerCase()
        println(name)
    }
}

fun main() {
    var myClass = MyClass("abc")

}