package org.kotlin.warmup.kotlinlang.concept

import org.kotlin.warmup.kotlinlang.parseInt
import java.io.File
import java.lang.Exception
import java.lang.IllegalArgumentException
import java.lang.NumberFormatException
import java.nio.file.Files
import java.nio.file.Paths

fun main() {

    //Filter a list
    val list: List<Int> = listOf(1, 4, 6, 8, 0)
    val positives = list.filter { x -> x > 2 }
    val pos = list.filter { it > 0 }
    println(positives)
    println(pos)

    //Check the presence of an element in a collection
    if (6 in list) {
        println(list.indexOf(6))
    }
    if (5 !in list) {
        println("No 5 found")
    }

    //String intrepolation
    val name = "Millian"
    println("Name is: $name")

    //Instance checks
    var str: String = when (name == "Millian") {
        true -> "Hello $name"
        else -> "Good Bye!"
    }
    println(str)

    //Read-only list
    var lst: List<String> = listOf("a", "b", "c")
    for (i in lst) println(i)

    //Read-only map
    val map: Map<String, Int> = mapOf("County" to 0, "City" to 1, "Country" to 2)
    for (i in map) {
        println(i)
        println(i.key)
        println(i.value)
        println(map["Country"])
        println("${map.keys}")
        println("${map.values}")
    }
    for ((key, value) in map) {
        println("$key -> $value")
    }

    //Iterate over a range
    for (i in 1..5) {
    }
    for (i in 2 until 8) {
    }
    for (i in 2..7 step 3) {
    }
    for (i in 10 downTo 1) {
    }
    var i = 3
    if (i in 1..5) {
    }

    //Singleton fun
    println(Singleton.name)
    println(Singleton.age)

    //null / not-null shorthand & Exception
    val files = File("File/test.txt").listFiles()
    println(files?.size)
    println(files?.size ?: "Not found!")
    //println(files?.size ?: throw Exception("File Not found!") )
    //var exception = files?.size ?: throw Exception("File Not found!")

    //Get first item of a possibly empty collection
    var cities: List<String> = listOf("San Antonio", "Dallas", "Houston")
    var firstItem = cities.firstOrNull() ?: ""
    println(firstItem)

    //Execute if not null
    val value = "Hello"
    value?.let { println("${value} World!") }

    val mp = mapOf("One" to 1, "Two" to 2)
    val mapped = mp?.let { (it) } ?: -1
    println(mapped)

    //Return on when statement fun
    println(transform("Red"))

    //try-catch
    //testException()

    //if-else
    condition(2)

    //Builder-style usage of methods that return Unit
    println(arrayOfMinusOnes(9, 5).size)

    //single function
    println(theAnswer())

    //combined idioms
    println(transformColor("Red"))

    //Configure properties of an object (apply)
    val myRectangle = Rectangle().apply {
        length = 3
        breadth = 8
        color = "0xFAFAFA"
    }

    //Java 7's try-with-resources
    val stream = Files.newInputStream(Paths.get("src/main/src/org/kotlin/warmup/kotlinlang/concept.txt"))
    stream.buffered().reader().use { reader -> println(reader.readText()) }

    //Nullable Boolean
    val b: Boolean? = "One".equals("OnE")
    if (b == true)
        println("true")
    else
        println("False")

    //Swap two variables
    var a = 1
    var f = 2
    a = f.also { f = a }
    println("Numbers $a and $f")

    var nu = "Hello"
    var vr: Int? = try {
        parseInt(nu)
    } catch (e: NumberFormatException) {
        null
    }

    // throw is an expression in Kotlin, so you can use it, for example, as part of an Elvis expression:
    var s = nu.length ?: throw IllegalArgumentException("Message required!")

    // In your own code, you can use Nothing to mark a function that never returns:
    fun fail(message: String): Nothing {
        throw IllegalArgumentException(message)
    }
}


