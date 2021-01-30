package com.lsgggg123.generic

interface Producer<out T> {
    fun produce(): T
}

interface Consumer<in T> {
    fun consume(t: T)
}

interface ProducerConsumer<T> {
    fun produce(): T
    fun consume(t: T)
}

open class Fruit
open class Apple : Fruit()
class ApplePear : Apple()

class FruitProducer : Producer<Fruit> {
    override fun produce(): Fruit {
        return Fruit()
    }
}

class AppleProducer : Producer<Apple> {
    override fun produce(): Apple {
        return Apple()
    }
}

class ApplePearProducer : Producer<ApplePear> {
    override fun produce(): ApplePear {
        return ApplePear()
    }
}

class Human : Consumer<Fruit> {
    override fun consume(t: Fruit) {
        println(t.javaClass.simpleName)
    }
}

class Man : Consumer<Apple> {
    override fun consume(t: Apple) {
        println(t.javaClass.simpleName)
    }
}

class Boy : Consumer<ApplePear> {
    override fun consume(t: ApplePear) {
        println(t.javaClass.simpleName)
    }
}


fun main() {
    // 对于 out 协变, 可以把子类型泛型类赋值给父类型泛型类
    val producer1: Producer<Fruit> = FruitProducer()
    val producer2: Producer<Fruit> = AppleProducer()
    val producer3: Producer<Fruit> = ApplePearProducer()

    // 对于 in 逆变, 可以把父类型泛型类赋值给子类型泛型类
    var consumer1: Consumer<ApplePear> = Human()
    var consumer2: Consumer<ApplePear> = Man()
    var consumer3: Consumer<ApplePear> = Boy()

    // 相当于把 ApplePear 类型赋值给 Apple 类型
    consumer2.consume(ApplePear())


}