package org.kotlin.warmup.kotlinlang

fun main() {

    //Read-only local variables are defined as val and value can be assigned only once
    val a : Int = 1
    val b = 2
    val c : Int
    c = 3

    //variables can be reassigned by using var keyword
    var x : Int = 5
    x += 3

    val PI = 3.14
    var y = 8

   println(increment())

    var str : String = "Hello"
    var s = "Hi"
    println("${str.replace("Hello","Kotlin")}, but now is: \n$s, Kotlin!")

}

var z = 9
fun increment() : Int {
    z++
    return z
}
