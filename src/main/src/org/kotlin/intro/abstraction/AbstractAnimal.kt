package org.kotlin.intro.abstraction

class AbstractAnimal : AbstractClass("Tilki") {
    override fun run(){
        println("Running")
    }

    override fun eat() {
        println("Eating food, don't touch!")
     }
}