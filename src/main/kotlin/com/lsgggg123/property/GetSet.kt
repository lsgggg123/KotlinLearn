package com.lsgggg123.property

/**
 *
 * @author: lsggg
 * @date: 2021/1/24
 */
class Person(name: String, age: Int) {
    val name: String
        get() = "hz"
    var age: Int = age
        get() {
            println("get called")
            return field
        }
        private set(value) {
            println("set called")
            field = value
        }
}

fun main() {
    val p = Person("a", 1)
    println(p.name)
    println(p.age)
    // p.age = 23
}