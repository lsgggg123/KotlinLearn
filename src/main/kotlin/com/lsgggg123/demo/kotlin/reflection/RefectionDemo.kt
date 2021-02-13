package com.lsgggg123.demo.kotlin.reflection

import kotlin.reflect.KMutableProperty
import kotlin.reflect.full.functions
import kotlin.reflect.full.memberFunctions
import kotlin.reflect.full.memberProperties
import kotlin.reflect.full.superclasses

/*
    p45
 */
class TypeParameterGeneric<K, V>(var k: K, var v: V)
class TypeParameter(var k: Int, var v: String) {
    fun printInfo() {
        println("k is $k, v is $v")
    }

    fun printInfoWithParam(x: String) {
        println("k is $k, v is $v, param is $x")
    }
}

fun main() {
    val typeParameterGenericClz = TypeParameterGeneric::class
    println(typeParameterGenericClz.typeParameters)
    println(typeParameterGenericClz.typeParameters.size)
    println(typeParameterGenericClz.typeParameters[0])
    println(typeParameterGenericClz.typeParameters[1])
    println(typeParameterGenericClz.superclasses)

    val typeParameter = TypeParameter(1, "a")
    println(typeParameter::class.memberProperties)

    TypeParameter::class.memberFunctions.filter { it.name == "printInfo" }.forEach { it.call(typeParameter) }
    TypeParameter::class.functions.find { it.name == "printInfo" }?.call(typeParameter)
    TypeParameter::class.functions.find { it.name == "printInfoWithParam" }?.call(typeParameter, "p")

    val kProperty = TypeParameter::class.memberProperties.find { it.name == "k" }
    println(kProperty?.getter?.call(typeParameter))
    println(kProperty?.get(typeParameter))
    println(kProperty?.call(typeParameter))
    if (kProperty is KMutableProperty<*>) {
        kProperty.setter.call(typeParameter, 3)
        println(typeParameter.k)
    }
}