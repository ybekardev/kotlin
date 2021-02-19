package org.kotlin.wrapUp.edureka

fun main(){

    val sum = {x : Int, y : Int -> x + y}
    println(sum(3,4))

    val lambda : (Int) -> Unit = {p : Int -> println(p)}
    multiply(5,9, lambda)

}

fun multiply(x : Int, y : Int, lambda : (Int) -> Unit){
    val multiply = x * y
    lambda(multiply)
}

//search for this function
fun course(n : String, linking : (String) -> Unit){
}




