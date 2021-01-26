package com.lsgggg123.companion

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