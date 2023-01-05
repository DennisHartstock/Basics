package com.commcode.basics

fun main() {
    val result = getAverage(3, 24)
    print("Average is $result")
}

fun getAverage(a: Int, b: Int): Double {
    return (a + b.toDouble()) / 2
}