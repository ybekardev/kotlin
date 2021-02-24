package org.kotlin.warmup.kotlinlang

fun main() {

    label()
    labelLambda()
    labelForEach()
    labelLoop()

    forLoop()
    whileLoop()
    println(describe(1))
    println(describe("Hi"))
    println(describe(12L))
    println(describe(1.32))
    println(describeString("Hi"))
    withIndexLoop()

}
fun forLoop() {
    val items = listOf("apple", "banana", "kiwi")
    for (item in items)
        println(item)

    for (index in items.indices)
        println("Item at index $index: ${items[index]}")
}

fun whileLoop() {
    var items = listOf("apple", "kiwi", "banana")
    var index = 0
    while (index < items.size) {
        println("Item at index $index: ${items[index]}")
        index++
    }
}

//whenExpression
fun describe(obj: Any): Any =
        when (obj) {
            1 -> "number"
            "Hi" -> "String"
            is Long -> "Long"
            !is String -> "Not a String"
            else -> "Unkown"

        }

//returns a string
fun describeString(obj: Any): String =
        when (obj) {
            1 -> "One"
            "Hello" -> "Greeting"
            is Long -> "Long"
            !is String -> "Not a string"
            else -> "Unknown"
        }

// Alternatively, you can use the withIndex library function:
fun withIndexLoop(){
    var items = listOf("apple", "kiwi", "banana")
    for((index, values) in items.withIndex()){
        println("The element is: $index, - $values")
    }
}

// when matches its argument against all branches sequentially until some branch condition is satisfied.
// The else branch is evaluated if none of the other branch conditions are satisfied. If when is used as an expression, the else branch is mandatory

// The return -expression returns from the nearest enclosing function
fun label(){
    listOf(1,2,3,4,5).forEach{
        if (it == 3) return // non-local return directly to the caller of foo()
        println(it)
    }
    println("Unreachable point")
}

fun labelLambda(){
    listOf(1,2,3,4,5).forEach lit@{
        if (it == 3) return@lit // local return to the caller of the lambda - the forEach loop
        println(it)
    }
    println(" done with explicit label")
}

fun labelForEach(){
    listOf(1,2,3,4,5).forEach {
        if(it == 3) return@forEach
        println(it)
    }
    println(" done with implicit label")
}

fun labelLoop(){
    listOf(1,2,3,4,5).forEach loop@{
        if(it == 3) return@loop
        println(it)
    }
    println(" done with nested loop")
}