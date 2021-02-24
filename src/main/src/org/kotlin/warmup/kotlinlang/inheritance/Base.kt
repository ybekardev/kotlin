package org.kotlin.warmup.kotlinlang.inheritance

open class Base(val name: String) {
    init {
        println("Initializing a base class")
    }

    open val size: Int = name.length.also { println("Initializing size in the base class $it") }

}