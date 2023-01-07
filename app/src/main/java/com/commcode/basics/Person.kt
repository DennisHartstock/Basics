package com.commcode.basics

fun main() {
    val me = Person("Dennis", "Hartstock")
    val john = Person()
    val johnWick = Person(lastName = "Wick")
}

class Person(firstName: String = "John", lastName: String = "Smith") {

    init {
        println("Initialized new Person object with first name: $firstName and last name: $lastName")
    }
}