package org.kotlin.warmup.kotlinlang.inheritance

open class Shape {

    open val vertexCount: Int = 0

    open fun draw() {
        println("Shape - draw object")
    }

    open fun fill() {
        println("Shape - fill object")
    }

    private fun delete() {
        println("Shape - delete object")
    }

    open fun update(){
        println("updating the shape")
    }
}

