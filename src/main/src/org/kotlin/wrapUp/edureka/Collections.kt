package org.kotlin.wrapUp.edureka

fun main(){

    map()
    set()
    list()

}

fun map(){
    val maps = mapOf<String, Int>("key" to 1, "key2" to 2, "key3" to 3)
    println("All keys: ${maps.keys}")
    println("All values: ${maps.values}")

    if("key2" in maps)
        println("the value key2: ${maps["key2"]}")

    if(1 in maps.values)
        println("The value is in maps")
}

fun set(){
    val nums = setOf(8,2,4,6,8)
    println(nums)

    if(nums.contains(1))
        println("Contains 1")
    else
        println("No 1 in the set")

    val reversed = setOf(3,2,5,3,7)
    println("The set is ${nums == reversed}")
}


fun list(){
    var result = listOf<Int>(1,8,17,4,45)
    println(result)

    var reversed = result.reversed()
    println(reversed)

    for(i : Int in result)
        println(i)

    for(( i : Int, j : Int) in result.withIndex())
        println("The index value is: $j")

    val nums = mutableListOf(2,8,6,9)
    nums.add(5)
    nums.removeAt(0)
    nums[0] = 34
    nums.shuffle()

    println(nums)
}