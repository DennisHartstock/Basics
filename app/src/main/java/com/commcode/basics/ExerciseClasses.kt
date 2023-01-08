package com.commcode.basics

fun main() {
    val galaxy = Smartphone(_brand = "Samsung", _model = "Galaxy S20 Ultra")
    val iPhone = Smartphone(_brand = "Apple", _model = "iPhone 14 Pro", _osName = "iOS")
    val redmi = Smartphone(_brand = "Xiaomi", _model = "Redmi 10")
    val mySmartphone = Smartphone("Android", "ZTE", "Blade A0722")
    mySmartphone.chargeBattery()
}

class Smartphone(_osName: String = "Android", _brand: String, _model: String) {
    private val model = _model
    private var battery = (0..50).random()

    fun chargeBattery() {

        val charged = (0..50).random()
        println("Battery of $model was at $battery")
        println("Battery of $model charged by $charged")
        println("Battery of $model is at ${battery + charged} now")
    }

    init {
        println("The smartphone $_model is from $_brand and uses $_osName as ist operating system")
    }
}