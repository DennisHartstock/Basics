package com.commcode.basics

fun main() {
    val john = Human("John", "USA", 150.0, 4.0)
    val elephant = Elephant("Hathi", "India", 5_000.0, 40.0)

    john.displayDetails()
    john.run()
    john.breath()

    elephant.displayDetails()
    elephant.run()
    elephant.breath()
}

abstract class Mammal(
    private val name: String,
    private val origin: String,
    private val weight: Double
) {
    abstract var maxSpeed: Double

    abstract fun run()

    abstract fun breath()

    fun displayDetails() {
        println("Name: $name\nOrigin: $origin\nWeight: $weight\nMax speed: $maxSpeed")
    }
}

class Human(
    name: String,
    origin: String,
    weight: Double,
    override var maxSpeed: Double
) : Mammal(name, origin, weight) {

    override fun run() {
        println("Runs on two legs")
    }

    override fun breath() {
        println("Breath through mouth or nose")
    }
}

class Elephant(
    name: String,
    origin: String,
    weight: Double,
    override var maxSpeed: Double
) : Mammal(name, origin, weight) {

    override fun run() {
        println("Runs on four legs")
    }

    override fun breath() {
        println("Breath through mouth or trunk")
    }
}