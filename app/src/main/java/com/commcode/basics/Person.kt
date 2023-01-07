package com.commcode.basics

fun main() {
    val me = Person("Dennis", "Hartstock")
    me.stateHobby()

    val vita = Person("Vita", "Hartstock", 13)
    vita.stateAge()

    val john = Person()
    john.stateAge()

    val johnWick = Person(_lastName = "Wick")
    johnWick.hobby = "to kill people"
    johnWick.stateHobby()
}

class Person(_firstName: String = "John", _lastName: String = "Smith") {

    // Member variables -> Properties
    private var firstName = _firstName
    private var lastName = _lastName
    private var age: Int? = null
    var hobby: String = "Powerlifting"

    // Member secondary constructor
    constructor(_firstName: String, _lastName: String, _age: Int) : this(_firstName, _lastName) {
        this.age = _age
    }

    // Member functions -> Methods
    fun stateHobby() {
        println("The hobby of $firstName $lastName is $hobby")
    }

    fun stateAge() {
        println("$firstName $lastName is $age years old")
    }

    init {
        println("Initialized new Person object with first name: $firstName and last name: $lastName")
    }
}