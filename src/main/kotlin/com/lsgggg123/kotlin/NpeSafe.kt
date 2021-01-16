package com.lsgggg123.kotlin

class NpeSafe {
    var str: String? = "null safe";

    fun setNull() {
        str = null
        println(str!!.length)
    }

    fun calculateTotal(obj: Any) {
        if (obj is Invoice) {
            obj.calculateTotal()
        }
    }
}

interface Invoice {
    fun calculateTotal();
}

fun main() {
    NpeSafe().setNull()
}