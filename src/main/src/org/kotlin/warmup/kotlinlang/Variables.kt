package org.kotlin.warmup.kotlinlang

import java.lang.IllegalArgumentException
import java.util.*

fun main() {

    // In Kotlin, everything is an object in the sense that we can call member functions and properties on any variable.

    //Read-only local variables are defined as val and value can be assigned only once
    val a: Int = 1
    val b = 2
    val c: Int
    c = 3

    //variables can be reassigned by using var keyword
    var x: Int = 5
    x += 3

    val PI = 3.14
    var y = 8

    println(increment())

    println(decimalDigitValue('8'))

    var str: String = "Hello"
    var s = "Hi"
    println("${str.replace("Hello", "Kotlin")}, but now is: \n$s, Kotlin!")

    // Note that unlike some other languages, there are no implicit widening conversions for numbers in Kotlin.
    // For example, a function with a Double parameter can be called only on Double values, but not Float, Int, or other numeric values.
    // val one: Double = 1 Compiler error
    val cast1: Double = 3.8
    val cast2: Int = cast1.toInt()

    val pi: Double = 1.0

    val two: Float = 1.0F

    // Longs are tagged by a capital L: 123L
    val three: Long = 5L

    // You can use underscores to make number constants more readable:
    val oneMillion = 1_000_000

    val floatingPoint = 5 / 2
    println(floatingPoint == 2) // true

    val floatingPoint2 = 5 / 2.toDouble()
    println(floatingPoint2 == 2.5)

    // iterate a string value
    val string = "abcd 123"
    for(i in string)
        println("i - value\n")

    val text = """
        |Tell me
        |What I
        |forgot?
    """.trimMargin() // To remove leading whitespace from raw strings, By default, | is used as margin prefix. Can change to trimMargin(">")
    println(text)

    val asc = Array(5) { i -> (i * i).toString()}
    asc.forEach { println(it) }

    val des = Array(4) {i -> (i + i).toString()}
    println(des[3])
    println(des.get(3))

    val array: IntArray = intArrayOf(1,3,6,9)
    array[0] = array[1] + array[2]
    println(array.contentToString())
    println(Arrays.toString(array))

    val array5 = IntArray(5)
    val array42 = IntArray(4) {23}
    val arrayM = IntArray(3) { it * 4 }
}

var z = 9
fun increment(): Int {
    z++
    return z
}

fun decimalDigitValue(c: Char): Int {
    if (c !in '0'..'9')
        throw IllegalArgumentException("Out of range")
    return c.toInt() - '0'.toInt()
}
