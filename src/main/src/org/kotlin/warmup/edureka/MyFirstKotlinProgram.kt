package org.kotlin.warmup.edureka

fun main(){

    var edureka = Kotlin()
    edureka.name = "Edureka Kotlin"
    println("The given name is: " + edureka.name)
    println("The dynamic given name is: ${edureka.name}")

    //re-instantiating the object with a new value
    edureka = Kotlin();
    edureka.myName = "Yasin"
    println("The value is: ${edureka.myName}")

    //re-instantiating the object will get an empty result
    edureka = Kotlin()
    println("The value is: ${edureka.myName}")

}