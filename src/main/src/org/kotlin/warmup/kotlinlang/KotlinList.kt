package org.kotlin.warmup.kotlinlang


fun main() {
    val numbers = mutableListOf("one", "two", "three")
    println(
        "Size: $numbers.size" + "\nThird Element: ${numbers.get(2)}"
                + "\nthird Element: ${numbers[2]}"
                + "\nIndex element of \'two\': ${numbers.indexOf("two")}"
    )
    numbers.add("four")
    println(numbers.shuffled())

    val nums = numbers.iterator()
    while (nums.hasNext()) {
        println(nums.next())
    }

}


/*
List<T> stores elements in a specified order and provides indexed access to them.
Indices start from zero – the index of the first element – and go to lastIndex which is the (list.size - 1).
Default implementation of List is ArrayList which you can think of as a resizable array.
List elements (including nulls) can duplicate: a list can contain any number of equal objects or occurrences of a single object.
Two lists are considered equal if they have the same sizes and structurally equal elements at the same positions.

 */