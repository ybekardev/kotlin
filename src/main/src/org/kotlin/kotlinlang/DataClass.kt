package org.kotlin.kotlinlang

data class DataClass(val name: String, val age: Int) {
    val position: String = "Employee"
}

fun main() {
    var dc = DataClass("Alice", 32)
    println(dc.toString())
}