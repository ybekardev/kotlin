package org.kotlin.warmup.kotlinlang

fun main() {

    println(sum(2, 4))
    println(sum2(3, 6))
    sum3(6, 2)
    sum4(4, 3)
    println(asList(1, 2, 3, 4))

    println(findFixPoint())

    println(1 shl 10)

    println(hasZeros(listOf(1, 2, 3, 5, 0)))

}

fun sum(a: Int, b: Int): Int {
    return a + b
}

fun sum2(a: Int, b: Int) = a + b

fun sum3(a: Int, b: Int): Unit {
    println("Sum of $a and $b is ${a + b}")
}

// Unit return type can be omitted.
fun sum4(a: Int, b: Int): Unit {
    println("Sum of $a and $b is ${a + b}")
    // `return Unit` or `return` is optional
}

// Functions can have generic parameters which are specified using angle brackets before the function name:
fun <T> asList(vararg ts: T): List<T> {
    val result = ArrayList<T>()
    for (t in ts)
        result.add(t)
    return result
}

/*
Tail recursive functions
Kotlin supports a style of functional programming known as tail recursion.
For some algorithms that would normally use loops you can use a recursive function instead without a risk of stack overflow.
When a function is marked with the tailrec modifier and meets the required form, the compiler optimizes out the recursion, leaving behind a fast and efficient loop based version instead:
To be eligible for the tailrec modifier, a function must call itself as the last operation it performs.
You cannot use tail recursion when there is more code after the recursive call, and you cannot use it within try/ catch/ finally blocks.
 */
const val eps = 1E-10

tailrec fun findFixPoint(x: Double = 1.0): Double {
    return if (Math.abs(x - Math.cos(x)) < eps) x else findFixPoint(Math.cos(x))
}

// The resulting code is equivalent to this more traditional style:
private fun findFixPoint(): Double {
    var x = 1.0
    while (true) {
        val y = Math.cos(x)
        if (Math.abs(x - y) < eps) return x
        x = Math.cos(x)
    }
}

fun hasZeros(ints: List<Int>): Boolean {
    ints.forEach {
        if (it == 0)
            return true
    }
    return false
}

infix fun Int.shl(x: Int): Int {
    x * 10
    return 16
}