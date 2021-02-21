package org.kotlin.warmup.kotlinlang

fun main(){

    println(sum(2,4))
    println(sum2(3,6))
    sum3(6,2)
    sum4(4,3)
}

fun sum(a : Int, b : Int) : Int {
    return a + b
}

fun sum2(a : Int, b : Int) = a + b

fun sum3(a : Int, b : Int) : Unit {
    println("Sum of $a and $b is ${a+b}")
}

//Unit return type can be omitted.
fun sum4(a :Int, b : Int) {
    println("Sum of $a and $b is ${a + b}")
}