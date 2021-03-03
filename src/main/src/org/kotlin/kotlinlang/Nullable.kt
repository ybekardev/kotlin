package org.kotlin.kotlinlang

fun main() {

    println(parseInt("Hello")) // 5
    println(parseInt("")) // 0

    printProduct("Hei", "Hola")

    println(sample())

    letSafe()

    filterNulls()
}

fun parseInt(str: String): Int? {
    return str.length
}

fun printProduct(arg1: String, arg2: String) {
    val x = parseInt(arg1)
    val y = parseInt(arg2)

    if (x != null && y != null)
        println(x * y)
    else
        println("$arg1 or $arg2 is not a number")
}

fun sample() {
    var a: String = "abc"
    //a = null compile error

    var b: String? = "abc"
    b = null //this is OK
    //if (b != null) {
    //  println(b.length)
    //}
    //b?.let { println(it.length) }
    println(b?.length)
    //println(b!!.length)

    val m: Int = if (b != null) b.length else -1
    //Elvis operator
    val l: Int = b?.length ?: -1

    val r: String? = "Kotlin"
    if (r != null && r?.length > 0) {
        println("String length: ${r.length}")
    } else {
        println("Empty string")
    }
}

// To perform a certain operation only for non-null values, you can use the safe call operator together with let:
fun letSafe() {
    val listWithNull: List<*>? = listOf("Kotlin", "Java", null)
    for (item in listWithNull!!) {
        item.let { println(it) }
    }
// The !! operator
// Another option is for NPE-lovers: the not-null assertion operator (!!) converts any value to a non-null type and throws an exception if the value is null.
// You can write b!!, and this will return a non-null value of b (for example, a String in our example) or throw an NPE if b is null:
// val l = b!!.length
}

fun filterNulls() {
    val nullableList: List<Int?> = listOf(1, 2, 3, 4, null)
    val intList: List<Int> = nullableList.filterNotNull()
    println(intList)
}

// Safe Cast
// Regular casts may result into a ClassCastException if the object is not of the target type.
// Another option is to use safe casts that return null if the attempt was not successful:
// val aInt: Int? = a as? Int