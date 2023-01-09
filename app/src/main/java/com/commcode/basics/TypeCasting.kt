package com.commcode.basics

import kotlin.math.floor

fun main() {
    val stringList = listOf<String>("John", "Jack", "Jim", "Joanne")
    val mixedTypeList = listOf<Any>("Anne", 24, -4512.251, 'A', true)

    for (value in mixedTypeList) {
        if (value is String) {
            println("String: $value of ${value.length}")
        } else if (value is Int) {
            println("Integer: $value")
        } else if (value is Double) {
            println("Double: $value with floor value ${floor(value)}")
        } else if (value is Char) {
            println("Char: $value")
        } else if (value is Boolean) {
            println("Boolean: $value")
        } else {
            println("Unknown type")
        }
    }

    for (value in mixedTypeList)
        when (value) {
            is String -> println("String: $value of ${value.length}")
            is Int -> println("Integer: $value")
            is Double -> println("Double: $value with floor value ${floor(value)}")
            is Char -> println("Char: $value")
            is Boolean -> println("Boolean: $value")
            else -> println("Unknown type")
        }

    // Smart cast
    val obj: Any = "Hello world"
    if (obj !is String) {
        println("Not a String")
    } else {
        println("Found a string of length ${obj.length}")
    }

    val obj1: Any = 35165
    val string: String? = obj1 as? String
    println(string?.length ?: "Not a string")
}