package org.kotlin.warmup.kotlinlang

fun main() {

    println(getStringLength("Hello"))
    println(getStringLength(22))

    println(getLength("Hi"))
    println(getLength(21))

    println(getLen("Hola"))
    println(getLen(20))
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