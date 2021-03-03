package org.kotlin.kotlinlang

fun main() {
    val x = 10
    val y = 9
    if(x in 1..y + 8)
        println("In the range")

    var list = listOf("a", "b", "c")
    if(-1 !in 0..list.lastIndex)
        println("-1 is out of range")

    if(list.size !in list.indices)
        println("List is out of range")

    for(a in 1..10 step 2)
        println(a)

    for(b in 9 downTo 0 step 3)
        println(b)


}