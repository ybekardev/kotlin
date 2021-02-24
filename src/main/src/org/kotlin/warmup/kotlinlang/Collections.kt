package org.kotlin.warmup.kotlinlang

fun main() {
    var items = listOf("Orange", "Banana", "Kiwi")
    when {
        "Orange" in items -> println("Juicy")
        "Apple" in items -> println("Apple juice")
        else -> println("Not including the item, Bye")
    }

    items.filter { it.contains("a") }
            .sortedBy { it }
            .map { it.toUpperCase() }
            .forEach { println(it) }

}