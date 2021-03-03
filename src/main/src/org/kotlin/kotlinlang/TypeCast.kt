package org.kotlin.kotlinlang

fun main() {

    println(getStringLength("Hello"))
    println(getStringLength(22))

    println(getLength("Hi"))
    println(getLength(21))

    println(getLen("Hola"))
    println(getLen(20))

    val c = """
        Foo 
        Bar
        """.trimIndent()
    println(c)

    val d = """if(a > 1) {
        | return a
        \}""".trimMargin()
    println(d)

    // Type check
    val obj = "Hello"
    if(obj is String){
        println(obj.length)
    } else if(obj !is String){
        println("Not a string")
    }

    //smart cast
    val demo: Any = "Hello"
    if(demo is String){
        println(demo)
    }

    // Such smart casts work for when expressions and while loops as well:
    // Note that smart casts work only when the compiler can guarantee
    when(demo){
        is Int -> println(demo * 2)
        is String -> println("$demo World!")
    }




}

fun getStringLength(obj : Any) : Int? {
    if(obj is String)
        return obj.length
    return null
}

fun getLength(obj: Any) : Int?{
    if(obj !is String)
        return null
    return obj.length
}

fun getLen(obj: Any) : Int? {
    if(obj is String && obj.length > 0)
        return obj.length
    return null
}