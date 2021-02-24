package org.kotlin.warmup.kotlinlang

fun interface IntPredicate {
    fun accept(i: Int): Boolean
}

fun main() {
    val isEven = IntPredicate { it % 2 == 0 }
    println("is 7 even? ${isEven.accept(7)}")
}