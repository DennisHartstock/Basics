package com.commcode.basics

fun main() {
    val numbers = ArrayList<Double>()
    numbers.add(212.545)
    numbers.add(656.6546)
    numbers.add(2166.979)
    numbers.add(15798.654)
    numbers.add(1543.389)

    var sum = 0.0
    for (number in numbers) {
        sum += number
    }
    val average = sum / numbers.size
    println("Average of numbers in ArrayList is $average")

    println("Average of numbers in ArrayList is ${numbers.sum() / numbers.size}")

    println("Average of numbers in ArrayList is ${numbers.average()}")
}