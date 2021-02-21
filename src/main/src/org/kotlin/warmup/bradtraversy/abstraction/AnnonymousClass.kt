package org.kotlin.warmup.bradtraversy.abstraction

fun main(){
    val bear = object : AbstractClass("Bear"){

        override fun run() {
            println("Bear is running")
        }

        override fun eat() {
            println("Bear is eating fish")
        }
    }
    bear.run()
    bear.eat()
}