package com.lsgggg123.demo.kotlin.delegation

import java.lang.Exception
import kotlin.properties.ReadOnlyProperty
import kotlin.reflect.KProperty

/*
    关于属性委托的要求
    1.对于只读属性来说（ val 标识的），委托需要提供一个 getValue 的方法，
    该方法接收如下参数：
    - thisRef，需要是属性拥有者相同的类型或者其父类型（对于扩展属性来说，这个类型就指的是被扩展的类型）
    - property，需要是 KProperty<*> 类型或者其父类型
    - getValue 方法需要返回与属性相同的类型或者其子类型
    2.对于可变属性来说（ var 修饰的），委托需要再提供一个名为 setValue 的方法，
    该方法需要接收如下参数：
    - thisRef，需要是属性拥有者相同的类型或者其父类型（对于扩展属性来说，这个类型就指的是被扩展的类型）
    - property，需要是 KProperty<*> 类型或者其父类型
    - new Value 需要与属性相同的类型或者其父类型
    setValue getValue 既可以作为委托类的成员方法实现，也可以座位其扩展方法来实现
    这两个方法必须用 operator 关键字标识，对于委托类来说，
    它可以实现 ReadOnlyProperty 或是 ReadWriteProperty 接口，
    这些几口包含了相应的 setValue getValue 方法，同时对于委托类来说也可以不实现这两个接口，
    而是自己单独实现 setValue getValue方法
    委托转换规则：
    对于每个委托属性来说，Kotlin 编译器在底层会生成一个辅助的属性，然后将原有属性的访问委托给这个辅助属性。
    比如说，对于属性prop来说，Kotlin 编译器所生成的遗隐含的属性名为 prop$delegate，
    然后对原有的 prop 属性的访问器的访问都只是委托给了这个额外的，Kotlin 编译器所生成的辅助属性。
 */

/*
    提供委托（providing a delegate）
    通过定义 provideDelegate operator，我们可以扩展委托的创建逻辑过程，
    如果对象定义了 provideDelegate 方法，那么该方法就会被调用来创建属性的委托实例
 */
class PropertyDelegate : ReadOnlyProperty<People, String> {
    override fun getValue(thisRef: People, property: KProperty<*>): String {
        return "hello world"
    }
}

class PeopleLauncher {
    // 提供委托，工厂角色
    operator fun provideDelegate(thisRef: People, property: KProperty<*>): ReadOnlyProperty<People, String> {
        println("welcome")
        when (property.name) {
            "name", "address" -> return PropertyDelegate()
            else -> throw Exception("not valid name")
        }
    }
}

class People {
    val name: String by PeopleLauncher()
    val address: String by PeopleLauncher()
    // val age: String by PeopleLauncher()
}

fun main() {
    val people = People()
    println(people.name)
    println(people.address)
}