package com.commcode.basics

fun main() {
    val audiA3 = MyCar(200.0, "A3", "Audi")
    val teslaS = MyElectricCar(240.0, "S-Model", "Tesla", 85.0)
    teslaS.extendRange(100.0)
    teslaS.getRange()

    audiA3.brake()
    teslaS.brake()

    // Polymorphism
    audiA3.drive(200.0)
    teslaS.drive(50.0)
}

interface Drivable {
    val maxSpeed: Double
    fun drive(): String
    fun brake() {
        println("The drivable is braking")
    }
}

// Super class
open class Vehicle {
    // properties
    // methods
}

// Subclass of Vehicle
open class MyCar(
    override val maxSpeed: Double,
    val name: String,
    val brand: String,
) : Drivable {
    open var range: Double = 0.0

    fun extendRange(amount: Double) {
        if (amount > 0) {
            range += amount
        }
    }

    open fun drive(distance: Double) {
        println("Drove for $distance km")
    }

    override fun drive(): String = "Driving the interface drive"
}

// Subclass of MyCar
class MyElectricCar(maxSpeed: Double, name: String, brand: String, batteryLife: Double) :
    MyCar(maxSpeed, name, brand) {
    override var range = batteryLife * 3

    override fun drive(distance: Double) {
        println("Drove for $distance km on electricity")
    }

    fun getRange() {
        println("Range is $range")
    }

    override fun brake() {
        println("Brake inside of electric car")
    }
}