package org.kotlin.wrapUp.bradtraversy.abstraction

abstract class AbstractClass(
        val name : String
) {

    init {
       println("Run " + name + " Run")
    }

    abstract fun run()
    abstract fun eat()
}

