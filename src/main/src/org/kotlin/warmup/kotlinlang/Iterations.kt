package org.kotlin.warmup.kotlinlang

fun main() {

    forLoop()
    whileLoop()
    println(describe(1))
    println(describe("Hi"))
    println(describe(12L))
    println(describe(1.32))
}

fun forLoop() {
    val items = listOf("apple", "banana", "kiwi")
    for (item in items)
        println(item)

    for(index in items.indices)
        println("Item at index $index: ${items[index]}")
}

fun whileLoop(){
    var items = listOf("apple", "kiwi", "banana")
    var index = 0
    while(index < items.size) {
        println("Item at index $index: ${items[index]}")
        index++
    }
}

//whenExpression
fun describe(obj : Any) : Any =
    when(obj){
        1 -> "number"
        "Hi" -> "String"
        is Long -> "Long"
        !is String -> "Not a String"
        else -> "Unkown"

    }

//returns a string
fun describeString(obj: Any): String =
    when (obj) {
        1          -> "One"
        "Hello"    -> "Greeting"
        is Long    -> "Long"
        !is String -> "Not a string"
        else       -> "Unknown"
    }