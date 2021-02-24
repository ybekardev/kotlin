package org.kotlin.warmup.kotlinlang.inheritance

import org.kotlin.warmup.kotlinlang.Address

fun main() {
    var circle = Circle();
    circle.draw()
    circle.fill()
    // can't see the delete() since it is private
    // circle.delete()
    var ch = Circle()
    ch.fill()
    ch.vertexCount = 8
    println(ch.vertexCount)
    ch.update()

    var base = Base("Nancy")
    var derived = Derived("Maisa", "Long")

    var address = Address()
    println(address.name)

}

