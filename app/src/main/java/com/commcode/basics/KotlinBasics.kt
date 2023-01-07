package com.commcode.basics

fun main() {
    // immutable String
    val greetings = "Hello, world!"
    // mutable String
    var name = "Vita"
    name = "Dennis"
    println("$greetings I'm $name")

    // TODO: learn basic types

    // type Byte (8 bits)
    val byte: Byte = 127
    // type Short (16 bits)
    val short: Short = 32_767
    // type Int (32 bits)
    val int = 2_147_483_647
    // type Long (64 bits)
    val long: Long = 9_223_372_036_854_775_807

    // type Float (32 bits)
    val float: Float = 125.125f
    // type Double (64 bits)
    val double = 1223545.4656454

    // type Boolean (true or false)
    var isSunny = true
    isSunny = false

    // type Character
    var letterChar = 'A'
    var digitChar = '1'

    // type Strings
    val myString = "Summer"
    val firstLetterChar = myString[0]
    val lastLetterChar = myString[myString.length - 1]
    println("First letter: $firstLetterChar\nLast letter: $lastLetterChar")

    // Arithmetic operators
    var result = 14 % 3
    println(result)

    val a = 3.0
    val b = 2
    result = (a / b).toInt()
    println(result)
    val resultToDouble: Double = a / b
    println(resultToDouble)

    // Comparison operators
    val isEqual = 2 == 2
    println("isEqual is $isEqual")
    val isNotEqual = 2 != 2
    println("isNotEqual is $isNotEqual")

    println("Is 4 greater than 3 ${4 >= 3}")

    // Assignment operators
    var number = 1
    number += 2
    println("$number")
    number *= 4
    println("$number")
    number %= 2
    println("$number")

    // Increment and decrement operators
    println("${number++}")
    println("${--number}")

    // if Statements
    val age = (0..110).random()
    println("age is $age")

    if (age > 100) {
        println("Die!")
    } else if (age > 21) {
        println("Work in McDonald's!")
    } else if (age > 16) {
        println("Go to the university!")
    } else if (age > 6) {
        println("Go to the school!")
    } else if (age > 3) {
        println("Go to the kindergarten!")
    }

    // when
    val season = (1..5).random()
    println("season is $season")

    when (season) {
        1 -> println("It's spring")
        2 -> println("It's summer")
        3 -> {
            println("It's fall")
            println("It's autumn")
        }
        4 -> println("It's winter")
        else -> println("Invalid season")
    }

    when (age) {
        0, 1, 2 -> println("Stay at home!")
        in 3 until 6 -> println("Go to the kindergarten!")
        in 6 until 16 -> println("Go to the school!")
        in 16 until 21 -> println("Go to the university!")
        in 21 until 100 -> println("Work in McDonald's!")
        !in 0..100 -> println("Die!")
        else -> println("You're already dead!")
    }

    val x: Any = 313245.22f
    when (x) {
        is Int -> println("$x is an Int")
        is Double -> println("$x is a Double")
        is String -> println("$x is a String")
        else -> println("$x is none of above")
    }

    // while loop
    var y = 100
    while (y > 0) {
        print("$y ")
        y /= 2
    }
    println("\nWhile loop is done")

    // do while
    do {
        print("$y ")
        y++
    } while (y <= 10)
    println("\nDo while loop is done")

    // another one while loop
    var feltTemp = "cold"
    var roomTemp = 10
    while (feltTemp == "cold") {
        roomTemp++
        if (roomTemp >= 20) {
            feltTemp = "comfy"
            println("It's comfy now")
        }
    }

    // for loops
    for (i in 1..10) {
        print("$i ")
    }
    println()

    for (i in 1 until 10) {
        print("$i ")
    }
    println()

    for (i in 12 downTo 1 step 3) {
        print("$i ")
    }
    println()

    // break and continue
    for (i in 1 until 20) {
        if (i / 2 == 5) {
            break
        }
        print("$i ")
    }
    println("For loop is done")

    for (i in 1 until 20) {
        if (i / 2 == 5) {
            continue
        }
        print("$i ")
    }
    println("For loop is done")

    // nullables
    var myName = "Dennis"
    // myName = null -> Compilation error
    val lengthOfMyName = myName.length
    println("Length of myName is $lengthOfMyName")

    var nullableName: String? = "Dennis"
    // nullableName = null
    println("Length of nullableName is ${nullableName?.length}")

    // Elvis operator
    myName = nullableName ?: "Guest"
    println("myName is $myName")

    println("nullableName to lower case is ${nullableName!!.lowercase()}")

    // You can perform a chain safe calls:
    // var childAge: Int? = person?.child?.age :? 0

    myFunction(5)
}

// parameter and variables

// this is a parameter
fun myFunction(a: Int) {
    //this is a variable
    val b = a
    println("b is $b")
}