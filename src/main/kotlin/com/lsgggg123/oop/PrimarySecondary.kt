package com.lsgggg123.oop

/**
 *
 * @author: lsggg
 * @date: 2021/1/23
 */
class Person constructor(name: String) {
    private var name: String
    private var age: Int
    private var man: Boolean

    init {
        this.name = name
        this.age = 12
        this.man = true
    }

    // Secondary constructor must call primary constructor directly or indirectly
    constructor(name: String, age: Int) : this(name) {
        this.age = age
        this.man = true
    }

    constructor(name: String, age: Int, man: Boolean) : this(name, age) {
        this.man = man
    }

    fun printInfo() {
        println("Person name = $name, age = $age, " + if(man) "man" else "woman")
    }
}
// 构造参数前有 val，说明参数同时还是成员变量
// constructor 可以省略，但前面有 private 等修饰符则不可省略
// class Person2 (private val name: String, private var age: Int, private var man: Boolean) {
// class Person2 private constructor(private val name: String, private var age: Int, private var man: Boolean) {
class Person2 constructor(private val name: String, private var age: Int, private var man: Boolean) {
    fun printInfo() {
        println("Person2 name = $name, age = $age, " + if(man) "man" else "woman")
    }
}

// 构造方法可以有默认值
// 如果类的 primary 构造方法的所有参数都有默认值，则编译器会默认生成一个无参构造函数，这个无参构造方法仍能使用默认值
class Person3 constructor(private val name: String = "test") {
    fun printInfo() {
        println("Person3 name = $name")
    }
}

fun main() {
    Person("z3").printInfo()
    Person("l4", 24).printInfo()
    Person("w5", 36, false).printInfo()
    Person2("w5", 36, false).printInfo()

    var p3 = Person3()
    p3.printInfo()
}