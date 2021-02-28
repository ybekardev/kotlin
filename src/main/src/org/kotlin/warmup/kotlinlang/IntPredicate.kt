package org.kotlin.warmup.kotlinlang

fun interface IntPredicate {
    fun accept(i: Int): Boolean
}

fun main() {
    val isEven = IntPredicate { it % 2 == 0 }
    println("is 7 even? ${isEven.accept(7)}")


    val repeatFun: String.(Int) -> String = {times -> this.repeat(times)}
    val twoParam: (String, Int) -> String = repeatFun

    println(runTransformation(twoParam))
    invokingFunType()

}

//Function Type
fun runTransformation(f: (String, Int) -> String): String {
    return f("Hello ", 3)
}

// Invoking a function type instance
// A value of a function type can be invoked by using its invoke(...) operator: f.invoke(x) or just f(x).
fun invokingFunType(){
    val stringPlus: (String, String) -> String = String::plus
    val intPlus: Int.(Int) -> Int = Int::plus

    println(stringPlus.invoke("<-, ", " ->"))
    println(stringPlus("Hello", " World"))

    println(intPlus.invoke(1,1))
    println(intPlus(1,2))
}
