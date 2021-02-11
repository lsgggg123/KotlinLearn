package com.lsgggg123.demo.kotlin.collections

/*
    Array List Map
    Kotlin 严格区分可变集合和不可变集合
    要清楚的一点是：区分开(可变集合的只读视图)与实际上真正的(不可变集合)
 */
fun main() {
    val list: MutableList<String> = mutableListOf("a", "b", "c")
    val readOnlyView: List<String> = list // 强制转换为不可变类型

    println(list)
    list.add("welcome")
    println(readOnlyView)
    // readOnlyView.clear()
    println("-----------------")

    val strings: HashSet<String> = hashSetOf("a", "b", "c", "c")
    println(strings.size)
    println("-----------------")

    //快照 把值深度复制 保留一个不可变的副本
    val items = mutableListOf("a", "b", "c")
    val items2 = items.toList()
    items.add("d")
    println(items)
    println(items2)
}