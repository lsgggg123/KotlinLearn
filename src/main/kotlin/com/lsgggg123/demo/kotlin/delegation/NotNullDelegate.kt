package com.lsgggg123.demo.kotlin.delegation

import kotlin.properties.Delegates

// 非空属性
// notNUll 适用于那些无法在初始化阶段确认属性值的场合
class MyPerson {
    var address: String by Delegates.notNull()
}

class Person {
    var age: Int by Delegates.observable(0) { prop, oldValue, newValue ->
        println("${prop.name}, oldValue: $oldValue, newValue: $newValue")
    }

    var name: String by Delegates.vetoable("") { prop, oldValue, newValue ->
        println("${prop.name}, oldValue: $oldValue, newValue: $newValue")
        if (newValue == "hml") {
            return@vetoable true
        }
        return@vetoable false
    }
}

fun main() {
    val person = Person()
    person.age = 30
    person.age = 40
    println("--------------")


    person.name = "hml"
    println("name ${person.name}")
    person.name = "cn"
    println("name ${person.name}")
    println("--------------")


    val myPerson = MyPerson()
    myPerson.address = "suzhou"
    println(myPerson.address)
}