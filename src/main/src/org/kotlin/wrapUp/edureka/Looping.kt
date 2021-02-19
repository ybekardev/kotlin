package org.kotlin.wrapUp.edureka

import javax.xml.bind.DatatypeConverter.parseInt

fun main(){

    for(item in 2..8){
        println(item)
    }

    var item =1
    while(item < 5){
        println(item)
        item++
    }

    do {
        println("Hello, $item times Kotlin!")
        item++
    }while(item < 8)

    var i : Int = 1
    when(i){
        0,1 -> println("The value is $i")
        else -> println("Not in the range")
    }

    var str = ""
    when(i){
        parseInt(str) -> {
            println("str encodes x")
        } else -> println("str does not encode x")
    }

    var validNumbers = ""
    //i = 0
    i = 2
    when(i){
        in 1..8 -> println("is the range")
        !in 8..16 -> println("not in the range")
        else -> println("none of the above options")
    }

    //i = 9
    when(i){
        1 -> println("one")
        2 -> println("two")
        3-> println("three")
        4 -> println("four")
        else -> println("not specified")
    }

    var x : Int = 6
    while(x in 1..5)
        if(x > 5)
            break
        else
            println(x)

    var y : Int = 6
    var z : Int = 3
    loop@ while(y in 1..5){
        while (z in 6..10){
            println("y is $y and z is $z")
            if( y ==7)
                break@loop
        }
    }

    var t : Int = 6
    for(t : Int in 1..4){
        println("t is $t")
        val j : Int = 0
        if(j == 2)
            continue
    }


}