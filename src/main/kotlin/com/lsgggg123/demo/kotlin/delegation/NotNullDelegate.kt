package com.lsgggg123.demo.kotlin.delegation

import kotlin.properties.Delegates

// 非空属性
// notNUll 适用于那些无法再初始化阶段无法确认属性值的场合
class MyPerson {
    var address: String by Delegates.notNull<String>()
}

fun main() {
    val myPerson = MyPerson()
    // myPerson.address = "suzhou"
    println(myPerson.address)
}