package org.kotlin.wrapUp.edureka

fun main(){

    val multiply  = {num1 : Int, num2 : Int -> num1 * num2}
    println("5 * 10 = ${multiply(5,10)}")

}



fun passFunction(abc : () -> Unit){
    abc()
}