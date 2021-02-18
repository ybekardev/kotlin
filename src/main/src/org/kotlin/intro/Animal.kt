package org.kotlin.intro

open class Animal(
        val name: String){
        val legCounts: Int = 4
    init {
        println("Hello, my name is $name and I have $legCounts legs")
    }

}


