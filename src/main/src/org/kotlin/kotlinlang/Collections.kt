package org.kotlin.kotlinlang


fun main() {
    var items = listOf("Orange", "Banana", "Kiwi")
    when {
        "Orange" in items -> println("Juicy")
        "Apple" in items -> println("Apple juice")
        else -> println("Not including the item, Bye")
    }

    items.filter { it.contains("a") }
        .sortedBy { it }
        .map { it.toUpperCase() }
        .forEach { println(it) }

    printAll(items)

    val words = "A long time ago in a galaxy far far away".split(" ")
    val shortWords = mutableListOf<String>()
    words.getShortWords(shortWords, 3)
    println(shortWords)


    retrieveColl()
}

fun printAll(strings: Collection<String>) {
    for (str in strings) println("$str")
}

fun List<String>.getShortWords(shortWords: MutableList<String>, maxLength: Int) {
    filterTo(shortWords) { it.length <= maxLength }
    val articles = setOf("a", "A", "an", "An", "the", "The")
    shortWords -= articles
}

/*
Note that altering a mutable collection doesn't require it to be a var:
write operations modify the same mutable collection object, so the reference doesn't change.
Although, if you try to reassign a val collection, you'll get a compilation error.
 */


/*
Test predicates
There are functions that simply test a predicate against collection elements:
any() returns true if at least one element matches the given predicate.
none() returns true if none of the elements match the given predicate.
all() returns true if all elements match the given predicate. Note that all() returns true when called with any valid predicate on an empty collection.
 */

fun TestPredicate() {
    val numbers = listOf("one", "two", "three", "four")

    println(numbers.any { it.endsWith("e") })
    println(numbers.none { it.endsWith("a") })
    println(numbers.all { it.endsWith("e") })

    println(emptyList<Int>().all { it > 5 })

    // any() and none() can also be used without a predicate: in this case they just check the collection emptiness.
    // any() returns true if there are elements and false if there aren't; none() does the opposite.
    val empty = emptyList<String>()

    println(numbers.any())
    println(empty.any())

    println(numbers.none())
    println(empty.none())
}

fun plusMinus() {
    val numbers = listOf("one", "two", "three", "four")

    val plusList = numbers + "five"
    val minusList = numbers - listOf("three", "four")
    println(plusList)
    println(minusList)
}

fun groupColl() {
    val numbers = listOf("one", "two", "three", "four", "five", "six")
    println(numbers.groupingBy { it.first() }.eachCount()) // {o=1, t=2, f=2, s=1}
    println(numbers.groupingBy { it.toUpperCase() })
}

/*
Namely, Grouping supports the following operations:
eachCount() counts the elements in each group.
fold() and reduce() perform fold and reduce operations on each group as a separate collection and return the results.
aggregate() applies a given operation subsequently to all the elements in each group and returns the result.
 */

fun retrieveColl() {
    // slice() returns a list of the collection elements with given indices. The indices may be passed either as a range or as a collection of integer values.
    val numbers = listOf("one", "two", "three", "four", "five", "six")
    println(numbers.slice(1..3))
    println(numbers.slice(0..4 step 2))

    // take & drop
    println(numbers.take(3))
    println(numbers.takeLast(2))
    println(numbers.drop(1))
    println(numbers.takeWhile { it.startsWith("o") })
    printAll(numbers.dropWhile { it.contains("i") })

    // chunked
    println(numbers.chunked(2))

    // windowed
    // Unlike chunked(), windowed() returns element ranges (windows) starting from each collection element.
    // All the windows are returned as elements of a single List.
    println(numbers.windowed(1, step = 2))

}

fun retrieveElement(){
    val numbers = linkedSetOf("one", "two", "three", "four", "five") //sortedSet(...)
    println(numbers.elementAt(3))

    // elementAtOrNull() returns null when the specified position is out of the collection bounds.

    println(numbers.first() { it.length > 3}) //firstOrNull() , lastOrNull()

    println(numbers.random())
}