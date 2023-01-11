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

    // Lists
    val months = listOf("January", "February", "March", "April", "Mai", "June")
    println(months)

    val mutableMonths = months.toMutableList()
    val otherMoths = listOf("Juli", "August", "September", "October", "November", "December")
    mutableMonths.addAll(otherMoths)
    println(mutableMonths)

    mutableMonths.add(5, "John")
    println(mutableMonths)
    mutableMonths.removeAt(5)
    println(mutableMonths)

    // Sets
    val fruitsSet = setOf("Apple", "Orange", "Grape", "Mango", "Apple")
    println(fruitsSet.size)
    println(fruitsSet)

    val fruitsMutableSet = fruitsSet.toMutableSet()
    fruitsMutableSet.add("Melon")
    println(fruitsMutableSet.elementAt(3))

    // Maps
    val days = mapOf(1 to "Monday", 2 to "Tuesday", 3 to "Wednesday")
    println(days[1])

    for (key in days.keys) {
        print("$key is to ${days[key]}, ")
    }

    val daysMutableMap = days.toMutableMap()
    daysMutableMap[4] = "Thursday"
    daysMutableMap[5] = "Friday"
    daysMutableMap[6] = "Saturday"
    daysMutableMap[7] = "Sunday"
    println(daysMutableMap)

    val fruitsMap = mapOf(
        "Premium" to Fruit("Apple", 4.8),
        "Standard" to Fruit("Orange", 5.9),
        "Basic" to Fruit("Melon", 10.5)
    )
    println("\n${fruitsMap.toSortedMap()}")

    // Lambdas
//    val sum = sum(5, 8)
//    println(sum)

//    val sum: (Int, Int) -> Int = {a: Int , b: Int -> a + b}
//    println(sum(2,4))

    val sum = { a: Int, b: Int -> println(a + b) }
    sum(5, 6)
}

//fun sum(a: Int, b: Int): Int {
//    return a + b
//}

data class Fruit(val name: String, val price: Double)