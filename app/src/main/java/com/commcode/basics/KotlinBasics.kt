package com.commcode.basics

fun main() {
    //immutable String
    val greetings = "Hello, world!"
    //mutable String
    var name = "Vita"
    name = "Dennis"
    print("$greetings I'm $name")

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
}