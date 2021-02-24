package org.kotlin.warmup.kotlinlang.classes.`class`

class InitOrderDemo(name: String) {
    val firstProperty = "First property: $name".also(::println)

    // Parameters of the primary constructor can be used in the initializer blocks. They can also be used in property initializers declared in the class body
    init {
        println("First Initializer: ${name.toUpperCase()}")
    }

    val secondProperty = "Second Property: ${name.length}".also(::println)

    init {
        println("Second Initializer: ${name.length}")
    }

}

/*
The primary constructor cannot contain any code. Initialization code can be placed in initializer blocks, which are prefixed with the init keyword.
During an instance initialization, the initializer blocks are executed in the same order as they appear in the class body, interleaved with the property initializers
 */