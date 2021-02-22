package org.kotlin.warmup.kotlinlang.concept

import java.io.File
import java.lang.Exception
import java.lang.IllegalArgumentException
import java.nio.file.Files
import java.nio.file.Paths

fun main(){

    //Filter a list
    val list : List<Int> = listOf(1,4,6,8,0)
    val positives = list.filter { x -> x > 2 }
    val pos = list.filter { it > 0 }
    println(positives)
    println(pos)

    //Check the presence of an element in a collection
    if (6 in list) { println(list.indexOf(6))}
    if(5 !in list) { println("No 5 found")}

    //String intrepolation
    val name = "Millian"
    println("Name is: $name")

    //Instance checks
    var str : String = when (name == "Millian") {
        true -> "Hello $name"
        else -> "Good Bye!"
    }
    println(str)

    //Read-only list
    var lst : List<String> = listOf("a", "b", "c")
    for(i in lst) println(i)

    //Read-only map
    val map : Map<String, Int> = mapOf("County" to 0, "City" to 1, "Country" to 2)
    for(i in map) {
        println(i)
        println(i.key)
        println(i.value)
        println(map["Country"])
        println("${map.keys}")
        println("${map.values}")
    }
    for((key, value) in map){
        println("$key -> $value")
    }

    //Iterate over a range
    for(i in 1..5) {}
    for(i in 2 until 8) {}
    for(i in 2..7 step 3) {}
    for(i in 10 downTo 1) {}
    var i = 3
    if(i in 1..5) {}

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
    var cities : List<String> = listOf("San Antonio", "Dallas", "Houston")
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
    val b : Boolean? = "One".equals("OnE")
    if(b == true)
        println("true")
    else
        println("False")

    //Swap two variables
    var a = 1
    var f = 2
    a = f.also { f = a }
    println("Numbers $a and $f")




}





//Create a singleton
object Singleton {
    const val name : String = "Mike"
    //age could be const as well
    val age : Int = 34
}

//Extension functions
fun String.spaceToCamelCase(){
    "Convert this to camelcase".spaceToCamelCase()
}

//Return on when statement
fun transform(color : String) : Int {
    return when(color){
        "Red" -> 0
        "Green" -> 2
        "Blue" -> 4
        else -> throw IllegalArgumentException("No matching item found!")
    }
}

//try-Catch
fun testException(){
    val result = try {
        transform("White")
    } catch (e : Exception){
        throw Exception("Not Found!")
    }
}

fun condition(param : Int){
    val result =
        if (param == 1)
        println("One")
    else if (param == 2)
        println("Two")
    else ("three")
}

fun arrayOfMinusOnes(size : Int, size2 : Int) : IntArray {
    return IntArray(size).apply { fill(-1) }
}

//Single-expression functions
fun theAnswer() = 42

fun theAnswer2() : Int {
    return 42
}

//effectively combined with other idioms
fun transformColor(color : String) : Int = when (color){
    "Red" -> 1
    "Blue" -> 3
    "Black" -> 6
    else -> throw IllegalArgumentException("Invalid Item")
}


class Turtle {
    fun penDown() {}
    fun penUp() {}
    fun turn(degrees : Double) {}
    fun forward(degree: Double) {}

}

//Call multiple methods on an object instance (with)
fun drawCircle(){
    val myTurtle = Turtle()
    with(myTurtle) {
        penDown()
        for(i in 1..4){
            forward(100.0)
            turn(90.0)
        }
        penUp()
    }
}

class Rectangle(){
    var length : Int = 4
    var breadth : Int = 5
    var color : String = "0xFAFAFA"
}

//Generic function that requires the generic type information
/*
//  public final class Gson {
//     ...
//     public <T> T fromJson(JsonElement json, Class<T> classOfT) throws JsonSyntaxException {
//     ...
inline fun <reified T: Any> Gson.fromJson(json: JsonElement): T = this.fromJson(json, T::class.java)
 */