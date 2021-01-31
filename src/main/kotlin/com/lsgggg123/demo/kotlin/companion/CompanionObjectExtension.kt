package com.lsgggg123.demo.kotlin.companion

class CompanionObjectExtension {
    companion object {

    }
}

fun CompanionObjectExtension.Companion.method() {
    println("Companion method invoke")
}

fun main() {
    CompanionObjectExtension.method()
}