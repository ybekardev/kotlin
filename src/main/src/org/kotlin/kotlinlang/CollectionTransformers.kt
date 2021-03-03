package org.kotlin.kotlinlang

fun main(){
    zipColl()
    associateWithColl()
    flattenColl()
    stringColl()
}

/*
zip() returns the List of Pair objects.
The elements of the receiver collection are the first elements in these pairs.
 */
fun zipColl() {
    val colors = listOf("red", "brown", "grey")
    val animals = listOf("fox", "bear", "wolf")
    println(colors.zip(animals) { colors, animal -> "The ${animal.capitalize()} is $colors"})
    // To unzip a list of pairs, call unzip()
    val numberPairs = listOf("one" to 1, "two" to 2, "three" to 3, "four" to 4)
    println(numberPairs.unzip())
}


fun associateWithColl(){
    val numbers = setOf("One", "two", "three")
    println(numbers.associateWith { it.length }) // {one=3, two=3, three=5}
    println(numbers.associateBy { it.first().toUpperCase() })
    println(numbers.associateBy(keySelector = { it.first().toUpperCase() }, valueTransform = { it.length }))
}

fun flattenColl() {
    val containers = listOf(listOf("one", "two", "three"), listOf("four", "five", "six"), listOf("seven", "eight"))
    println(containers.flatMap { it })

}

// joinToString() builds a single String from the collection elements based on the provided arguments.
// joinTo() does the same but appends the result to the given Appendable object.
fun stringColl(){
    val numbers = listOf("one", "two", "three", "four")
    println(numbers.joinToString(separator = " | ", prefix = "start: ", postfix = ": end"))
}

