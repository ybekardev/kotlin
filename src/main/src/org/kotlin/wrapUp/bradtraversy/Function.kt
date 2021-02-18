package org.kotlin.wrapUp.bradtraversy

fun main(){
    printNumbers()

    println(isEven(6))

    println(isOdd(9))
    //optionally can be left blank as it will take the 10 from the method as default
    println(isOdd())

    val y = 7
    println(y.isOddOrNot())

}

fun printNumbers(){
    for (i in 1..10){
        println(i)
    }
}

fun isEven(number: Int): Boolean{
    return number % 2 == 0
}

fun isOdd(number: Int = 10): Boolean{
    return number % 2 != 0
}

fun Int.isOddOrNot(): Boolean {
    return this % 2 == 1
}