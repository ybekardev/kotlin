package org.kotlin.warmup.kotlinlang.inheritance

class Square : Rectangle(), Triangle {
    override fun draw() {
        super<Rectangle>.draw()
        super<Triangle>.draw()
        println("Square - draw function")
    }

/*
In Kotlin, implementation inheritance is regulated by the following rule:
if a class inherits multiple implementations of the same member from its immediate superclasses, it must override this member and provide its own implementation (perhaps, using one of the inherited ones).
To denote the supertype from which the inherited implementation is taken, use super qualified by the supertype name in angle brackets, e.g. super<Base>
 */
}