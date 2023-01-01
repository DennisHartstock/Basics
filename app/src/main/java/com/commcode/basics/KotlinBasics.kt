package com.commcode.basics

fun main() {
    //immutable String
    val greetings = "Hello, world!"
    //mutable String
    var name = "Vita"
    name = "Dennis"
    println("$greetings I'm $name")

    //TODO: learn basic types

    //type Byte (8 bits)
    val byte: Byte = 127
    //type Short (16 bits)
    val short: Short = 32_767
    //type Int (32 bits)
    val int = 2_147_483_647
    //type Long (64 bits)
    val long: Long = 9_223_372_036_854_775_807

    //type Float (32 bits)
    val float: Float = 125.125f
    //type Double (64 bits)
    val double = 1223545.4656454

    //type Boolean (true or false)
    var isSunny = true
    isSunny = false

    //type Character
    var letterChar = 'A'
    var digitChar = '1'

    //type Strings
    val myString = "Summer"
    val firstLetterChar = myString[0]
    val lastLetterChar = myString[myString.length - 1]
    print("First letter: $firstLetterChar\nLast letter: $lastLetterChar")
}