package com.lsgggg123.oop

/**
 *
 * @author: lsggg
 * @date: 2021/1/23
 */
// 所有类默认无法被继承，所有类默认都是 final 类
open class Parent(name: String, age: Int)

class Child(name: String, age: Int) : Parent(name, age) {
    private var name: String
    private var age: Int

    init {
        this.name = name
        this.age = 12
    }
}

// 如果一个类没有 primary 构造方法，那么每个 secondary 都需要通过 super 来初始化父类型
class ChildWithoutPrimaryConstructor : Parent {
    constructor(name: String, age: Int) : super(name, age)
}