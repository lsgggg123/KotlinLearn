package com.lsgggg123.demo.kotlin.enum

enum class Season(val temperature: Int) {
    SPRING(1), SUMMER(30), AUTUMN(20), WINTER(-10)
}

enum class Season2 {
    SPRING {
        override fun getSeason(): Season2 {
            return SPRING
        }
    },
    SUMMER {
        override fun getSeason(): Season2 {
            return SUMMER
        }
    },
    ;
    abstract fun getSeason(): Season2
}

fun main() {
    Season.values().forEach { println(it) }
    val spring = Season.valueOf("SPRING")
}