package org.kotlin.warmup.kotlinlang.abstract

fun main() {
    val obj = object : MyAbstractClass() {
        override fun doSomething() {
            println("Doing something")
        }

        override fun sleep() {
            println("Sleep in action")
        }

    }

    obj.doSomething()
    obj.sleep()

}