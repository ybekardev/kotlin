package org.kotlin.warmup.bradtraversy

fun main() {

       error()
       println(lambda())
       println(lambdaCustom())

    }

fun error(){
    val number = readLine() ?: "0"
    val parsedNumber = try {
        number.toInt()
    } catch (e : Exception){
        0
    }
    println(parsedNumber)
}

fun lambda() : Int{
    val list = listOf("Kotlin", "Java", "JS")
    val count = list.count{currentString -> currentString.length == 6}
    return count
}

fun List<String>.customCount(function: (String) -> Boolean): Int {
    var counter = 0
    for(string in this){
        if(function(string)) {
            counter++
        }
    }
    return counter
}

fun lambdaCustom() : Int{
    val list = listOf("Kotlin", "Java", "JS")
    val count = list.customCount{currentString -> currentString.length == 6}
    return count
}

fun <T> List<T>.customCountType(function: (T) -> Boolean): Int {
    var counter = 0
    for(string in this){
        if(function(string)) {
            counter++
        }
    }
    return counter
}