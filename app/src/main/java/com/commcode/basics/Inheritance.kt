package com.commcode.basics

fun main() {
    val audiA3 = MyCar("A3", "Audi")
    val teslaS = MyElectricCar("S-Model", "Tesla", 85.0)
    teslaS.extendRange(100.0)
    teslaS.getRange()

    // Polymorphism
    audiA3.drive(200.0)
    teslaS.drive(50.0)
}

// Super class
open class Vehicle {
    // properties
    // methods
}

// Subclass of Vehicle
open class MyCar(
    val name: String,
    val brand: String
) : Vehicle() {
    open var range: Double = 0.0

    fun extendRange(amount: Double) {
        if (amount > 0) {
            range += amount
        }
    }

    open fun drive(distance: Double) {
        println("Drove for $distance km")
    }
}

// Subclass of MyCar
class MyElectricCar(name: String, brand: String, batteryLife: Double) : MyCar(name, brand) {
    override var range = batteryLife * 3

    override fun drive(distance: Double) {
        println("Drove for $distance km on electricity")
    }

    fun getRange() {
        println("Range is $range")
    }
}