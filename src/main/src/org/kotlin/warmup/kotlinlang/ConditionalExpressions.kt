package org.kotlin.warmup.kotlinlang

import com.sun.tools.internal.ws.processor.model.Request
import jdk.nashorn.internal.ir.RuntimeNode

fun main() {
    println(max(4, 8))
    println(max2(3, 7))
    println(max3("Hi", "Hello"))
    hasPrefix("Hello")
    hasPrefix(5)

    var max = readLine()?.toInt()
    if (max!! < 7) max = 7
    println(max)

    var mx = if (max < 8) 8 else max
    println(mx)

    var str = readLine()
    if (str.equals("Hello")) str = "World!"
    println(str)

    // If you're using if as an expression, for example, for returning its value or assigning it to a variable, the else branch is mandatory.

    // To define a common behavior for multiple cases, combine their conditions in a single line with a comma:

    when (val num = readLine()?.toInt()) {
        1, 3, 5, 7, 9 -> println(num * 2)
        else -> println(num!! * 1)
    }

    val x = readLine()
    when (x) {
        is String -> println(x)
        else -> println("Not a string")
    }


}


fun max(a: Int, b: Int): Int {
    if (a > b) return a
    else return b
}

fun max2(a: Int, b: Int) = if (a > b) a else b

fun max3(a: String, b: String) = a ?: -1

fun hasPrefix(x: Any) = when(x){
    is String -> if(x.startsWith("H")) println(x) else "Not matching"
    is Int -> x * 5
    else -> println("Not supported")
}



