package com.lsgggg123.demo.kotlin.delegation

// 类委托
interface MyInterface {
    fun myPrint()
}

class MyInterfaceImpl(private val str: String) : MyInterface {
    override fun myPrint() {
        println("welcome $str")
    }
}
/*
    委托原理
    by 关键字后面的对象实际上会被存在类的内部，编译器则会把父接口中的所有方法实现出来，并且将
    实现转移给委托对象来执行
 */
class MyClass(myInterface: MyInterface) : MyInterface by myInterface

fun main() {
    val myInterfaceImpl = MyInterfaceImpl("zhangsan")
    MyClass(myInterfaceImpl).myPrint()
}