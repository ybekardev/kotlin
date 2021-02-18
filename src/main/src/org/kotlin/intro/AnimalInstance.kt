package org.kotlin.intro

import org.kotlin.intro.abstraction.AbstractAnimal

fun main(){
    val dog = Animal("Tom")
    println(dog)

    val dog2 = Dog()
    dog2.bark()
    println(dog2.legCounts)

    val cat = Cat()
    cat.meow()

    val abs = AbstractAnimal()
    abs.run()
    abs.eat()

}