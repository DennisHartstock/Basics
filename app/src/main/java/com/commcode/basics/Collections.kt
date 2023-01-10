package com.commcode.basics

fun main() {

    // Arrays
    val numbers = arrayOf(1, 2, 3, 4, 5, 6, 7, 8, 9, 10)
//    println(numbers.contentToString())
    for (number in numbers) {
        print("$number ")
    }
    numbers[0] = 11
    println("\n${numbers.contentToString()}")

    val fruits = arrayOf(Fruit("Apple", 2.3), Fruit("Orange", 3.5))
    println(fruits.contentToString())
    for (index in fruits.indices) {
        println("${fruits[index].name} is in index $index")
    }
    for (fruit in fruits) {
        println(fruit.name)
    }
}

data class Fruit(val name: String, val price: Double)