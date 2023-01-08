package com.commcode.basics

fun main() {
    val myCar = Car()
    myCar.owner = "Dennis"
    println(myCar.owner)

    println(myCar.brand)
    myCar.brand = "Pobeda"
    println(myCar.brand)

    myCar.maxSpeed = 10
    println(myCar.maxSpeed)

    println(myCar.color)
}

class Car {
    lateinit var owner: String

    var brand = "Niva"
        get() = field.lowercase()

    var maxSpeed = 1000
        set(value) {
            field = if (value > 0) value
            else throw java.lang.IllegalArgumentException("Max speed cannot be less than 0")
        }

    var color = "green"
        private set

    init {
        color = "red"
    }
}