package org.kotlin.kotlinlang

data class DataTransferObject(val name : String, val age : Int) {
}

fun main(){
    var dto = DataTransferObject("Mike", 34)
    println(dto.toString())
}

/*
provides a DTO class with the following functionality:
getters (and setters in case of var s) for all properties

equals()
hashCode()
toString()
copy()

 */