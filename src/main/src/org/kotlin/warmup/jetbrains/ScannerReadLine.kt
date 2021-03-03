package org.kotlin.warmup.jetbrains

import java.util.*

fun main() {
    val scanner = Scanner(System.`in`)
    // put your code here
    val one = scanner.next()
    val two = scanner.nextLine()


    val n = one.split(" ")
    for (i in n)
        println(i)

    val m = two.split(" ")
    //while (scanner.hasNextLine()){
    //for(i in 0..m.size)
    println(m.get(0))
    println(m.get(1))
    println(m.get(2))
    // }

}