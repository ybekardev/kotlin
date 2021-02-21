package org.kotlin.warmup.edureka

fun main(){

    var num : Int = 40
    var num2 : Int = 50

    if(num > num2){
        println("$num is bigger than $num2")
    }else{
        println("$num2 is bigger than $num")
    }

    //not required for single line
    if(num > num2)
        println("$num is bigger than $num2")
    else
        println("$num2 is bigger than $num")

}