package com.lsgggg123.demo.kotlin.seal

// 密封类表示受限的类型, 表示父子类的限制型结构 可以类比为枚举类
// 密封类可以有子类, 密封类的子类的实例可以有多个 直接子类定义在密封类同一个文件内 间接子类可以在任何地方
// 是一个抽象类, 不可实例化
// 构造方法默认私有
sealed class Season
class Spring: Season()
class Summer: Season()
class Autumn: Season()
class Winter: Season()

fun seasonMonth(season: Season) {
    when(season) {
        is Spring -> println("3, 4, 5")
        is Summer -> println("6, 7, 8")
        is Autumn -> println("9, 10, 11")
        is Winter -> println("12, 1, 2")
    }
}

