package org.kotlin.kotlinlang

fun main() {
    val numbers = setOf(1,2,3,4,5,6)
    if(numbers.contains(1)){
        println("The size: ${numbers.size}")
    }
    val backwardNumbers = setOf(6,5,4,3,2,1)
    println(numbers == backwardNumbers) // true
    println(numbers === backwardNumbers) // false
    println(numbers.first() == backwardNumbers.first()) // false

}

/*
Set<T> stores unique elements; their order is generally undefined. null elements are unique as well: a Set can contain only one null.
Two sets are equal if they have the same size, and for each element of a set there is an equal element in the other set.
The default implementation of Set – LinkedHashSet – preserves the order of elements insertion.
Hence, the functions that rely on the order, such as first() or last(), return predictable results on such sets.
 */