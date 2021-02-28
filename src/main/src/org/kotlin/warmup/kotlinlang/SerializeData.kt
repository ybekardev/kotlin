package org.kotlin.warmup.kotlinlang

import kotlinx.serialization.decodeFromString
import kotlinx.serialization.encodeToString
import kotlinx.serialization.json.Json


/*
Update the POM!
Kotlin: Your current Kotlin version is 1.4.21, while kotlinx.serialization core runtime 1.1.0 requires at least Kotlin 1.4.30-M1. Please update your Kotlin compiler and IDE plugin.
https://github.com/Kotlin/kotlinx.serialization
https://github.com/Kotlin/kotlinx.serialization
 */

fun serializingData(){
    Json.encodeToString(DataSerialize(42, "Name"))
}

fun main(){
    serializingData()

    //You can also serialize object collections, such as lists, in a single call.
    val dataList = listOf(DataSerialize(42, "demo"), DataSerialize(12, "test"))
    val jsonList = Json.encodeToString(dataList)

    //To deserialize an object from JSON, use the decodeFromString() function:
    val obj = Json.decodeFromString<DataSerialize>("""{"a":42, "b": "str"}""")
}