package org.kotlin.wrapUp.edureka

import java.util.*

fun main(){
    var num = arrayOf(1,2,3,4,5)
    println(Arrays.toString(num))

    var num2 = IntArray(5, {i -> i * 2 + 3})
    println(Arrays.toString(num2))

    num2[3] = 20
    println(num2[3])

    println(num2.get(2))

    num.set(0,8)
    println(num[0])

    val num3 = num.plus(1)
    println(Arrays.toString(num3))

    println(num.first())
    println(num.last())
    println(num.size)
    println(num.count())
    println(num.indexOf(2))

    val even = num.count{it % 2 ==0}
    println("The number of even numbers: $even")

    val sortedArray = num.sortedArray()
    println(Arrays.toString(sortedArray))
    val reversedOrder = num.sortedArrayDescending()
    println(Arrays.toString(reversedOrder))

    val array = arrayOf(intArrayOf(1,3), intArrayOf(5,8))
    println(Arrays.deepToString(array))


}