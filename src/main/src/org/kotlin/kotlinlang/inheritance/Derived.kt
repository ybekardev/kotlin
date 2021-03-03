package org.kotlin.kotlinlang.inheritance

class Derived(name: String, val lastName: String) : Base(name.capitalize().also { println("argument for the base class $it") }) {
    init {
        println("Initializing a derived class")
    }

    override val size: Int = (super.size + lastName.length).also { println("Initializing size in a derived class") }

}