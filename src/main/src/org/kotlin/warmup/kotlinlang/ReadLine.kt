package org.kotlin.warmup.kotlinlang


fun main(){

    //println(readLn())
    //println(readInt())
    //println(readInts())
    var a = readLine()!!.toInt()
    var b = readLine()!!.split(" ").map { it.toInt() }
    var d =6
    var e = 7



}

//To make reading the input in competitive programming tasks like this more concise,
//you can have the following list of helper input-reading functions:
private fun readLn() = readLine()!! // string line
private fun readInt() = readLn().toInt() // single int
private fun readStrings() = readLn().split(" ") // list of strings
private fun readInts() = readStrings().map { it.toInt() } // list of ints

//java.util.Scanner is extremely slow. So slow, in fact, that parsing 10 5 or more integers with it might not fit into a typical 2 second time-limit,
//which a simple Kotlin's split(" ").map { it.toInt() } would handle.