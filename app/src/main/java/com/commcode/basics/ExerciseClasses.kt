package com.commcode.basics

fun main() {
    val galaxy = Smartphone(brand = "Samsung", model = "Galaxy S20 Ultra")
    val iPhone = Smartphone(brand = "Apple", model = "iPhone 14 Pro")
    val redmi = Smartphone(brand = "Xiaomi", model = "Redmi 10")
}

class Smartphone(osName: String = "Android", brand: String, model: String) {

    init {
        println("Initialized new smartphone: $brand $model, $osName")
    }
}