package com.lsgggg123.demo.kotlin.property

/**
 *
 * @author: lsggg
 * @date: 2021/1/24
 */
class Late {
    // 非抽象类的非空类型属性必须构造方法中初始化 或者 lateinit 修饰
    // lateinit 只能用在类体中声明的 var 属性上，不能用在一级构造方法上声明的属性上
    // 属性不能拥有自定义的 setter getter 方法
    // 属性类型需要为非空，且不能是原生数据类型（Int Float Boolean）
    lateinit var attr: String

    fun init() {
        attr = "a"
    }
}