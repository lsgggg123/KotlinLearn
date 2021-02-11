package com.lsgggg123.demo.kotlin.kotlin_call_java

fun main() {
    val list = ArrayList<String>()
    list.add("hello")
    list.add("world")
    list.add("hello world")
    for (str in list) {
        println(str)
    }

    for (i in 0 until list.size) {
        println(list[i])
    }
    println("-------------------")

    val javaUser = JavaUser()
    javaUser.age = 12
    javaUser.name = "z3"
    javaUser.isMarried = false
    println(javaUser)
    println("-------------------")

    /*
        在 Java 中，所有引用都可能为 null,然而在 Kotlin 中，对 null 是有严格的检查与限制的
        这就使得某个来自于 Java 的引用在 Kotlin 中变得不再适合，基于这个原因
        在 Kotlin 中，将来自于Java的声明类型称之为平台类型（Platform Types）
        对于这种类型(平台类型)来说，Kotlin 的 null 检查就会得到一定的缓和，变得不再那么严格了
        这样就使得空安全的语义变得与 Java 一致了
        平台类型不能由人为定义，只能由编译器判断生成
        当我们调用平台类型引用的方法时，Kotlin 就不会再编译器见附加空安全检查，使得编译可以正常通过
        但是在运行期间则有可能抛出异常，因为平台类型引用值可能为 null
     */
    val list2 = ArrayList<String>()
    list2.add("hello")
    val size = list2.size
    val item = list2[0]
    val s: String? = item //允许 总是可以的
    val s2: String = item //允许 不过可能运行时错误
    /*
        如果我们使用了不可空类型，编译器会在赋值时生成一个断言。这会防止 Kotlin 的不可空变量持有 null 值
        同样看，这一点也适用于 Kotlin 方法参数传递
        总体来说，Kotlin 会竭尽所能防止 null 的赋值蔓延到程序的其他地方，而是在发生问题之处就立刻通过断言来解决
     */
}