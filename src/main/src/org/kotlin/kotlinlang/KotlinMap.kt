package org.kotlin.kotlinlang

fun main() {
    val numbersMap = mutableMapOf("key1" to 1, "key2" to 2, "key3" to 3, "key4" to 4)
    println("All keys: ${numbersMap.keys}")
    println("All values: ${numbersMap.values}")
    println(numbersMap.keys + numbersMap.values)
    numbersMap.put("key5", 5)

    if("key2" in numbersMap)
        println("Key2 value is: ${numbersMap["key2"]}")
    if(1 in numbersMap)
        println("Value is in the map")
    if(numbersMap.containsValue(2))
        println(numbersMap.containsKey("key2"))

    // Two maps containing the equal pairs are equal regardless of the pair order.
    val numberMap = mapOf("key1" to 1, "key2" to 2, "key3" to 3, "key4" to 1)
    val anotherMap = mapOf("key2" to 2, "key1" to 1, "key4" to 1, "key3" to 3)

    println("The maps are equal: ${numberMap == anotherMap}") // true
    println("The maps are equal: ${numberMap === anotherMap}") // false

 }

/*
Map<K, V> is not an inheritor of the Collection interface; however, it's a Kotlin collection type as well. A Map stores unique key, can be same value pairs
The default implementation of Map – LinkedHashMap – preserves the order of elements insertion when iterating the map.
In turn, an alternative implementation – HashMap – says nothing about the elements order.
 */


