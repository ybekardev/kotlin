package org.kotlin.kotlinlang.concept

import java.lang.Exception
import java.lang.IllegalArgumentException

//Create a singleton
object Singleton {
    const val name: String = "Mike"

    //age could be const as well
    val age: Int = 34
}


//Extension functions
fun String.spaceToCamelCase() {
    "Convert this to camelcase".spaceToCamelCase()
}

//Return on when statement
fun transform(color: String): Int {
    return when (color) {
        "Red" -> 0
        "Green" -> 2
        "Blue" -> 4
        else -> throw IllegalArgumentException("No matching item found!")
    }
}

// TRY - CATCH
// There may be zero or more catch blocks. finally block may be omitted.
// However, at least one catch or finally block should be present.
fun testException() {
    val result = try {
        transform("White")
    } catch (e: Exception) {
        throw Exception("Not Found!")
    } finally {
        println("Exciting from execution...")
    }
}

fun condition(param: Int) {
    val result =
        if (param == 1)
            println("One")
        else if (param == 2)
            println("Two")
        else ("three")
}

fun arrayOfMinusOnes(size: Int, size2: Int): IntArray {
    return IntArray(size).apply { fill(-1) }
}

//Single-expression functions
fun theAnswer() = 42

fun theAnswer2(): Int {
    return 42
}

//effectively combined with other idioms
fun transformColor(color: String): Int = when (color) {
    "Red" -> 1
    "Blue" -> 3
    "Black" -> 6
    else -> throw IllegalArgumentException("Invalid Item")
}


class Turtle {
    fun penDown() {}
    fun penUp() {}
    fun turn(degrees: Double) {}
    fun forward(degree: Double) {}

}

//Call multiple methods on an object instance (with)
fun drawCircle() {
    val myTurtle = Turtle()
    with(myTurtle) {
        penDown()
        for (i in 1..4) {
            forward(100.0)
            turn(90.0)
        }
        penUp()
    }
}

class Rectangle() {
    var length: Int = 4
    var breadth: Int = 5
    var color: String = "0xFAFAFA"
}

//Generic function that requires the generic type information
/*
//  public final class Gson {
//     ...
//     public <T> T fromJson(JsonElement json, Class<T> classOfT) throws JsonSyntaxException {
//     ...
inline fun <reified T: Any> Gson.fromJson(json: JsonElement): T = this.fromJson(json, T::class.java)
 */