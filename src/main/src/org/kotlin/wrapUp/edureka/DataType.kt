package org.kotlin.wrapUp.edureka

fun main(){

    val a : Int = 100
    val b : Double = 10.0
    val c : Float = 10.4f
    val d : Long = 1000000000322322322
    val e : Boolean = true
    val f : Char = 'C'

    var number : Int = 46
    var number2 : Int = 90
    println("Number1: $number and Number2: $number2 and the total is ${number + number2}")

    println("Enter the input:")
    val name : String? = readLine()
    val age : Int? = Integer.valueOf(readLine())
    println("Your name: $name, age: $age" )




}