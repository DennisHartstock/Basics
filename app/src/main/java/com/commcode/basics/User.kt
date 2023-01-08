package com.commcode.basics

fun main() {
    val user1 = User(1, "John")
    println(user1)
    var user2 = User(2, "Jack")
    println(user2)

    user2 = user1.copy()
    println(user1 == user2)
    println(user2.component2())

    val (id, name) = user1
    println("id is $id and name is $name")
}

data class User(val id: Int, val name: String) {

}
