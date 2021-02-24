package org.kotlin.warmup.kotlinlang.classes.`class`

fun main(){
    //as soon as the object is created teh values comes from the InitOrderDemo
    var order = InitOrderDemo("Katharina")
    println(order.firstProperty)
    println(order.secondProperty)

}