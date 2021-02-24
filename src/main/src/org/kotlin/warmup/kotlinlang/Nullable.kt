package org.kotlin.warmup.kotlinlang

fun main() {

    println(parseInt("Hello")) // 5
    println(parseInt("")) // 0

    printProduct("Hei", "Hola")

}

fun parseInt(str: String): Int? {
    return str.length
}

fun printProduct(arg1: String, arg2: String) {
    val x = parseInt(arg1)
    val y = parseInt(arg2)

    if (x != null && y != null)
        println(x * y)
    else
        println("$arg1 or $arg2 is not a number")
}