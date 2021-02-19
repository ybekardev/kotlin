package org.kotlin.wrapUp.edureka

fun main(){
    println(sum(3,6))
    println(sum2(4,1))
    var num : Unit = size(7, 10)
    println(subtract(6,2))
    println(twoFunctions(4))
    val(two, three) = twoFunctions(1)
    println("$two,$three")
    println("Total is ${getData(20,40)}")

    val multiply = {num1 : Int, num2 : Int -> num1 * num2}
    println("15 * 6 = ${multiply(15,6)}")

    println("5! = ${fact(5)}")
}

fun sum(a : Int , b : Int) : Int{
    return a + b
}

fun sum2(a : Int, b : Int) : Int = a + b

fun size(c : Int, d : Int ) {
    if (c > d)
        println(d)
    else
        println(c)
}

fun subtract(a : Int, b : Int) : Int = a-b

fun twoFunctions(num : Int) : Pair<Int, Int>{
    return Pair(num + 1, num + 2)
}

fun getData(vararg result : Int) : Int{
    var sub = 0
    result.forEach{n -> sub += n}
    return sub
}

fun fact(x : Int) : Int{
    //tailrec is a recursive function which calls itself
    tailrec fun factorial(a : Int, b : Int) : Int {
        if(a == 0) return b
        else return factorial(a-1, a*b)
    }
    return factorial(x, 1)
}


