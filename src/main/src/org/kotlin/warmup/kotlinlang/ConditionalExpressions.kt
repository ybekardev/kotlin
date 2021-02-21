package org.kotlin.warmup.kotlinlang

fun main(){
    println(max(4,8))
    println(max2(3,7))
    println(max3("Hi","Hello"))
}

fun max(a : Int, b : Int) : Int {
    if(a > b ) return a
    else return b
}

fun max2 (a : Int, b : Int) = if(a > b) a else b

fun max3(a : String, b : String) = a ?: -1