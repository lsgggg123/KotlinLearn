package com.lsgggg123.demo.kotlin.reflection

import kotlin.reflect.KMutableProperty
import kotlin.reflect.full.*

/*
    p45
 */
class TypeParameterGeneric<K, V>(var k: K, var v: V)
class TypeParameter(var k: Int = 1, var v: String = "a") {

    // constructor(): this(3, "c")

    fun printInfo() {
        println("k is $k, v is $v")
    }

    fun printInfoWithParam(x: String) {
        println("k is $k, v is $v, param is $x")
    }

    companion object {
        fun companionMethod() {
            println("hello world")
        }
    }
}

fun main() {
    val typeParameterGenericClz = TypeParameterGeneric::class
    println(typeParameterGenericClz.typeParameters)
    println(typeParameterGenericClz.typeParameters.size)
    println(typeParameterGenericClz.typeParameters[0])
    println(typeParameterGenericClz.typeParameters[1])
    println(typeParameterGenericClz.superclasses)
    println("------------------------------------")

    val typeParameter = TypeParameter(2, "b")
    val kClass = TypeParameter::class
    println(typeParameter::class.memberProperties)

    kClass.memberFunctions.filter { it.name == "printInfo" }.forEach { it.call(typeParameter) }
    kClass.functions.find { it.name == "printInfo" }?.call(typeParameter)
    kClass.functions.find { it.name == "printInfoWithParam" }?.call(typeParameter, "p")

    val kProperty = kClass.memberProperties.find { it.name == "k" }
    val vProperty = kClass.memberProperties.find { it.name == "v" }
    println(kProperty?.getter?.call(typeParameter))
    println(kProperty?.get(typeParameter))
    println(kProperty?.call(typeParameter))
    if (kProperty is KMutableProperty<*>) {
        kProperty.setter.call(typeParameter, 3)
        println(typeParameter.k)
    }
    println("------------------------------------")

    val companionObject = kClass.companionObject
    println(companionObject)
    TypeParameter.companionMethod()
    println("------------------------------------")

    val createInstance = kClass.createInstance()
    println("------------------------------------")
    createInstance.printInfo()
}