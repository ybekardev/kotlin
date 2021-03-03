package org.kotlin.kotlinlang

class ExtensionFunction {

    /*
For example, you can write new functions for a class from a third-party library that you can't modify.
Such functions are available for calling in the usual way as if they were methods of the original class.
This mechanism is called extension functions.
There are also extension properties that let you define new properties for existing classes.
Extension functions
To declare an extension function, prefix its name with a receiver type, that means the type being extended.
The following adds a swap function to MutableList<Int>:
     */

     fun MutableList<Int>.swap(index1: Int, index2: Int) {
        val temp = this[index1]
        this[index1] = this[index2]
        this[index2] = temp
    }

    //to make it generic

    fun <T> MutableList<T>.swapGeneric(index1: Int, index2: Int) {
        val temp = this[index1]
        this[index1] = this[index2]
        this[index2] = temp
    }


    fun writer() {
        val ls = mutableListOf(1, 2, 3)
        ls.swap(0, 2)
        println(ls)
    }

    //Extension properties
    //Similarly to functions, Kotlin supports extension properties:

    val <T> List<T>.lastIndex: Int
        get() = size - 1

    /*
    Nullable receiver
    Note that extensions can be defined with a nullable receiver type.
    Such extensions can be called on an object variable even if its value is null, and can check for this == null inside the body.
    This way you can call toString() in Kotlin without checking for null: the check happens inside the extension function.
    */

    fun Any?.toString(): String {
        if (this == null) return "null"
        // after the null check, 'this' is autocast to a non-null type, so the toString() below
        // resolves to the member function of the Any class
        return toString()
    }
}

fun main(){

val w = ExtensionFunction().writer()


}