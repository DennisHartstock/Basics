package com.commcode.basics

fun main() {
    for (i in 0..10_000) {
        if (i == 9_001) {
            println("IT'S OVER 9 000!!!")
            var humidityLevel = 80
            var humidity = "humid"
            while (humidity == "humid") {
                humidityLevel -= 5
                println("Humidity decreased")
                if (humidityLevel < 60) {
                    humidity = "comfy"
                    println("It's comfy now")
                }
            }
        }
    }
}