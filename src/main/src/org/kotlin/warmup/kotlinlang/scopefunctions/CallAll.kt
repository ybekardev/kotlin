package org.kotlin.warmup.kotlinlang.scopefunctions

import kotlin.random.Random

fun main() {
    scopeFunction()
}

fun scopeFunction() {

    // With let, no object creation/assign
    Person("Alice", 20, "Amsterdam").let {
        println(it.name)
    }

    // If you write the same without let, you'll have to introduce a new variable and repeat its name whenever you use it.
    val alice = Person("Alice", 20, "Amsterdam")
    println(alice.name)

    /*
let
The context object is available as an argument (it ). The return value is the lambda result.
let can be used to invoke one or more functions on results of call chains.
     */
    val num = mutableListOf("one", "two", "three", "four")
    val resultList = num.map { it.length }.filter { it > 3 }
    println(resultList)
    // or without assignment
    num.map { it.length }.filter { it > 3 }.let {
        println(it)
    }

    /*
run
The context object is available as a receiver (this ). The return value is the lambda result.
run does the same as with but invokes as let- as an extension function of the context object.
run is useful when your lambda contains both the object initialization and the computation of the return value.
     */
    val str = "Hello"
    str.run {
        this.toUpperCase()
        println("The string length: $length")
        println("The string length: ${this.length}") // same as upper one
    }

    str.let {
        it.toUpperCase()
        println("The string length: ${it.length}")
    }

    /*
Apply
The context object is available as a receiver (this ). The return value is the object itself.
Use apply for code blocks that don't return a value and mainly operate on the members of the receiver object.
The common case for apply is the object configuration.
Such calls can be read as “ apply the following assignments to the object.”
 */
    val adam = Person("Alice", 20, "Amsterdam").apply {
        this.name = "Adam" // or it can name = "Adam
        this.city = "Houston" // city = "Houston
    }
    println(adam.name)

    getRandomInt()
    getRandomInt2()

    numberList()

    val numbers = mutableListOf("One", "Two", "Three")
    val countsEndsWithE = numbers.run {
        add("Four")
        add("Five")
        count { it.endsWith("e") }
    }
    println("Count is: $countsEndsWithE")

    /*
with
A non-extension function: the context object is passed as an argument, but inside the lambda, it's available as a receiver (this ).
The return value is the lambda result.
We recommend with for calling functions on the context object without providing the lambda result.
In the code, with can be read as “ with this object, do the following.”
     */
    val nums = mutableListOf("one", "two", "three")
    with(nums) {
        val firstItem = first()
        val lastItem = last()
        println("Printing items: $firstItem - $lastItem")
    }

    /*
also
The context object is available as an argument (it ). The return value is the object itself.
also is good for performing some actions that take the context object as an argument.
Use also for actions that need a reference rather to the object than to its properties and functions, or when you don't want to shadow this reference from an outer scope.
When you see also in the code, you can read it as “ and also do the following with the object.”
     */
    val nums2 = mutableListOf("one", "two", "three")
    nums2
        .also { println("The list elements before adding a new one: $it") }
        .add("four")
    println(nums2)







}


/*
There are two main differences between each scope function:
The way to refer to the context object
The return value.

The scope functions differ by the result they return:
apply and also return the context object. The return value of apply and also is the context object itself.
let, run, and with return the lambda result.

Context object
The return value of apply and also is the context object itself.
Hence, they can be included into call chains as side steps: you can continue chaining function calls on the same object after them.
They also can be used in return statements of functions returning the context object
val numberList = mutableListOf<Double>()
numberList.also { println("Populating the list") }
    .apply {
        add(2.71)
        add(3.14)
        add(1.0)
    }
    .also { println("Sorting the list") }
    .sort()

Lambda result
let, run, and with return the lambda result.
So, you can use them when assigning the result to a variable, chaining operations on the result, and so on.
Additionally, you can ignore the return value and use a scope function to create a temporary scope for variables.
val numbers = mutableListOf("one", "two", "three")
val countEndsWithE = numbers.run {
    add("four")
    add("five")
    count { it.endsWith("e") }
}
println("There are $countEndsWithE elements that end with e.")
val numbers = mutableListOf("one", "two", "three")
val countEndsWithE = numbers.run {
    add("four")
    add("five")
    count { it.endsWith("e") }
}
println("There are $countEndsWithE elements that end with e.")

The Kotlin standard library contains several functions whose sole purpose is to execute a block of code within the context of an object.
When you call such a function on an object with a lambda expression provided, it forms a temporary scope.
In this scope, you can access the object without its name. Such functions are called scope functions. There are five of them: let, run, with, apply, and also.
Basically, these functions do the same: execute a block of code on an object.

'it' is shorter than this and expressions with it are usually easier for reading.
However, when calling the object functions or properties you don't have the object available implicitly like this.
Hence, having the context object as it is better when the object is mostly used as an argument in function calls.

*/

fun getRandomInt(): Int {
    return Random.nextInt(100).also { value ->
        println("$value")
    }
}

fun getRandomInt2(): Int {
    return Random.nextInt(100).also {
        println("Generated value $it")
    }
}

fun numberList() {
    val nums = mutableListOf<Double>()
    nums.also { println("Populating list:") }
        .apply {
            add(12.4)
            add(34.6)
            add(5.32)
        }
        .also { println("Sorting the list") }
        .sort()
    println(nums)
}