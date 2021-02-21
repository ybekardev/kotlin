package org.kotlin.jetbrains

import java.util.*

fun main(){

    //initialize and reassign REQUIRES the type
    val greetings : String
    greetings = "Hello"

    val num : Int
    num = 5

    var grt : String
    grt = "Hello world"

    var rl = readLine()
    var arr : List<String>? = rl?.split(" ")
    if (arr != null) {
        for(i in arr)
            println(i)
    }


    var n : Int
    n = 8

    val result = println("text")
    println(result)
    //All functions return a result, even the println function.
    //Its result is a special value called Unit, which means "no result".

    val scanner = Scanner(System.`in`)
    val scan = scanner.nextLine()
    println(scan.split(" "))

    val line = readLine()
    println(line)

    var arr3 = readLine()
    var arr2 = readLine()

    var one : List<String>? = arr3?.split(" ")
    if (one != null) {
        for(i in one)
            print(i)
    }

    var two : List<String>? = arr2?.split(" ")
    if (arr2 != null) {
        for(j in arr2)
            print(j)
    }

}