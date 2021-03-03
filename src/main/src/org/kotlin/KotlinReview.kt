package org.kotlin

import org.kotlin.kotlinlang.Address
import org.kotlin.kotlinlang.concept.transform
import org.kotlin.kotlinlang.parseInt
import org.kotlin.kotlinlang.scopefunctions.Person
import java.io.File
import java.lang.Exception
import java.lang.IllegalArgumentException
import java.lang.NumberFormatException
import java.nio.file.Files
import java.nio.file.Paths
import java.util.*
import kotlin.random.Random

fun main() {
    //Check the presence of an element in a collection
    val list: List<Int> = listOf(1, 4, 6, 8, 0)
    if (6 in list) {
        println(list.indexOf(6))
    }
    if (5 !in list) {
        println("No 5 found")
    }

    //Iterate over a range
    for (i in 1..5) {
    }
    for (i in 2 until 8) {
    }
    for (i in 2..7 step 3) {
    }
    for (i in 10 downTo 1) {
    }
    var i = 3
    if (i in 1..5) {
    }

    val c = Array(5) { i -> (i * i) }
    c.forEach { println(it) }
    println(Arrays.toString(c))
    println(c.contentToString())

    var line = readLine()?.toInt()
    var line2 = readLine()!!.toInt()
    if (line != null) {
        println(line + line2)
    }

    val numbersMap = mutableMapOf("key1" to 1, "key2" to 2, "key3" to 3, "key4" to 4)
    println("All keys: ${numbersMap.keys}")
    println("All values: ${numbersMap.values}")
    println(numbersMap.keys + numbersMap.values)
    println("Key2 value is: ${numbersMap["key2"]}")
    numbersMap.put("key5", 5)

    val numbers = mutableListOf("one", "two", "three")
    println(numbers.get(2))
    println(numbers[2])
    val nums = numbers.iterator()
    while (nums.hasNext()) {
        println(nums.next())
    }

    var nu = "Hello"
    var vr: Int? = try {
        parseInt(nu)
    } catch (e: NumberFormatException) {
        null
    }

    //Java 7's try-with-resources
    val stream = Files.newInputStream(Paths.get("src/main/src/org/kotlin/warmup/kotlinlang/concept.txt"))
    stream.buffered().reader().use { reader -> println(reader.readText()) }

    //null / not-null shorthand & Exception
    val files = File("File/test.txt").listFiles()
    println(files?.size)
    println(files?.size ?: "Not found!")
}

fun digitValue(c: Char): Int {
    if (c !in '0'..'9')
        throw IllegalArgumentException("Out of range!")
    return c.toInt()
}

fun getStrLength(obj: Any): Int? {
    if (obj !is String)
        return null
    return obj.length
}

fun safeRun() {
    val listWithNull: List<*>? = listOf("Kotlin", "Java", null)
    val ls: List<*>? = listWithNull?.filterNotNull()
    for (item in listWithNull!!) {
        item.let { println(it) }
    }
    println(ls)
}

fun iteratorOne() {
    val nums = listOf(1, 2, 3, 4, 5)
    val numsIterator = nums.iterator()
    while (numsIterator.hasNext()) {
        println(numsIterator.next())
    }
}


fun forLoop() {
    val items = listOf("apple", "banana", "kiwi")
    for (item in items)
        println(item)

    for (index in items.indices)
        println("Item at index $index: ${items[index]}")
}

fun whileLoop() {
    var items = listOf("apple", "kiwi", "banana")
    var index = 0
    while (index < items.size) {
        println("Item at index $index: ${items[index]}")
        index++
    }
}

//whenExpression
fun describe(obj: Any): Any =
    when (obj) {
        1 -> "number"
        "Hi" -> "String"
        is Long -> "Long"
        !is String -> "Not a String"
        else -> "Unkown"

    }

//returns a string
fun describeString(obj: Any): String =
    when (obj) {
        1 -> "One"
        "Hello" -> "Greeting"
        is Long -> "Long"
        !is String -> "Not a string"
        else -> "Unknown"
    }

// Alternatively, you can use the withIndex library function:
fun withIndexLoop() {
    var items = listOf("apple", "kiwi", "banana")
    for ((index, values) in items.withIndex()) {
        println("The element is: $index, - $values")
    }

    val numbersMap = mapOf("key1" to 1, "key2" to 2, "key3" to 3, "key11" to 11)
    val filteredMap = numbersMap.filter { (key, value) -> key.endsWith("1") && value > 10 }
    println(filteredMap)
}

/*
When matches its argument against all branches sequentially until some branch condition is satisfied.
The else branch is evaluated if none of the other branch conditions are satisfied. 
If when is used as an expression, the else branch is mandatory
*/
fun max(a: Int, b: Int): Int {
    if (a > b) return a
    else return b
}

fun max2(a: Int, b: Int) = if (a > b) a else b

fun max3(a: String, b: String) = a ?: -1

fun hasPrefix(x: Any) = when (x) {
    is String -> if (x.startsWith("H")) println(x) else "Not matching"
    is Int -> x * 5
    else -> println("Not supported")
}

// The return -expression returns from the nearest enclosing function
fun label() {
    listOf(1, 2, 3, 4, 5).forEach {
        if (it == 3) return // non-local return directly to the caller of foo()
        println(it)
    }
    println("Unreachable point")
}

fun labelLambda() {
    listOf(1, 2, 3, 4, 5).forEach lit@{
        if (it == 3) return@lit // local return to the caller of the lambda - the forEach loop
        println(it)
    }
    println(" done with explicit label")
}

fun labelForEach() {
    listOf(1, 2, 3, 4, 5).forEach {
        if (it == 3) return@forEach
        println(it)
    }
    println(" done with implicit label")
}

fun labelLoop() {
    listOf(1, 2, 3, 4, 5).forEach loop@{
        if (it == 3) return@loop
        println(it)
    }
    println(" done with nested loop")
}

//Function Type
fun runTransformation(f: (String, Int) -> String): String {
    return f("Hello ", 3)
}

fun printAll(strings: Collection<String>) {
    for (str in strings) println("$str")
}

fun getRandomInt(): Int {
    return Random.nextInt(100).also {
        println("Generated value $it")
    }
}

// Functions can have generic parameters which are specified using angle brackets before the function name:
fun <T> asList(vararg ts: T): List<T> {
    val result = ArrayList<T>()
    for (t in ts)
        result.add(t)
    return result
}

fun sum(a: Int, b: Int): Int {
    return a + b
}

fun sum2(a: Int, b: Int) = a + b

/*
ExtensionFunction
For example, you can write new functions for a class from a third-party library that you can't modify.
Such functions are available for calling in the usual way as if they were methods of the original class.
*/
fun MutableList<Int>.swap(index1: Int, index2: Int) {
    val temp = this[index1]
    this[index1] = this[index2]
    this[index2] = temp
}

// To make it generic
fun <T> MutableList<T>.swapGeneric(index1: Int, index2: Int) {
    val temp = this[index1]
    this[index1] = this[index2]
    this[index2] = temp
}

fun writer() {
    val ls = mutableListOf(1, 2, 3)
    ls.swap(0, 2)
    println(ls)
}

fun List<String>.getShortWords(shortWords: MutableList<String>, maxLength: Int) {
    filterTo(shortWords) { it.length <= maxLength }
    val articles = setOf("a", "A", "an", "An", "the", "The")
    shortWords -= articles
}

//Extension properties, Similarly to functions, Kotlin supports extension properties:
val <T> List<T>.lastIndex: Int
    get() = size - 1

fun <T> List<T>.customCountType(function: (T) -> Boolean): Int {
    var counter = 0
    for (string in this) {
        if (function(string)) {
            counter++
        }
    }
    return counter
}

/*
Nullable receiver
Note that extensions can be defined with a nullable receiver type.
Such extensions can be called on an object variable even if its value is null, and can check for this == null inside the body.
This way you can call toString() in Kotlin without checking for null: the check happens inside the extension function.
*/

fun Any?.toString(): String {
    if (this == null) return "null"
    // after the null check, 'this' is autocast to a non-null type, so the toString() below
    // resolves to the member function of the Any class
    return toString()
}


//COLLECTION TRANSFORMERS
/*
zip() returns the List of Pair objects.
The elements of the receiver collection are the first elements in these pairs.
 */
fun zipColl() {
    val colors = listOf("red", "brown", "grey")
    val animals = listOf("fox", "bear", "wolf")
    println(colors.zip(animals) { colors, animal -> "The ${animal.capitalize()} is $colors" })
    // To unzip a list of pairs, call unzip()
    val numberPairs = listOf("one" to 1, "two" to 2, "three" to 3, "four" to 4)
    println(numberPairs.unzip())
}

fun associateWithColl() {
    val numbers = setOf("One", "two", "three")
    println(numbers.associateWith { it.length }) // {one=3, two=3, three=5}
    println(numbers.associateBy { it.first().toUpperCase() })
    println(numbers.associateBy(keySelector = { it.first().toUpperCase() }, valueTransform = { it.length }))
}

fun flattenColl() {
    val containers = listOf(listOf("one", "two", "three"), listOf("four", "five", "six"), listOf("seven", "eight"))
    println(containers.flatMap { it })

}

// joinToString() builds a single String from the collection elements based on the provided arguments.
// joinTo() does the same but appends the result to the given Appendable object.
fun stringColl() {
    val numbers = listOf("one", "two", "three", "four")
    println(numbers.joinToString(separator = " | ", prefix = "start: ", postfix = ": end"))
}

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
    org.kotlin.kotlinlang.printAll(numbers.dropWhile { it.contains("i") })
    // chunked
    println(numbers.chunked(2))
    // windowed
    // Unlike chunked(), windowed() returns element ranges (windows) starting from each collection element.
    // All the windows are returned as elements of a single List.
    println(numbers.windowed(1, step = 2))
}

fun retrieveElement() {
    val numbers = linkedSetOf("one", "two", "three", "four", "five") //sortedSet(...)
    println(numbers.elementAt(3))
    // elementAtOrNull() returns null when the specified position is out of the collection bounds.
    println(numbers.first() { it.length > 3 }) //firstOrNull() , lastOrNull()
    println(numbers.random())
}


class Address {
    var name: String = "Holmes, Sherlock"
    var street: String = "Baker"
    var city: String = "London"
    var state: String? = null
    var zip: String = "123456"
}

fun copyAddress(address: Address): Address {
    var info = Address()
    info.name = address.name
    info.street = address.street
    info.city = address.city
    info.state = address.state
    info.zip = address.zip

    return info
}


// CONTEXT
/*
* 'it' is shorter than this and expressions with it are usually easier for reading.
However, when calling the object functions or properties you don't have the object available implicitly like this.
Hence, having the context object as it is better when the object is mostly used as an argument in function calls.

* The scope functions differ by the result they return:
apply and also return the context object. The return value of apply and also is the context object itself. Hence, they can be included into call chains as side steps, also can be used in return statements.
let, run, and with return the lambda result. You can use them when assigning the result to a variable, chaining operations on the result, and so on.

* Class layout
The contents of a class should go in the following order:
Property declarations and initializer blocks
Secondary constructors
Method declarations
Companion object

*Conditional Statements: Prefer using 'when' if there are three or more options.
return if (x) foo() else bar()

return when(x) {
    0 -> "zero"
    else -> "nonzero"
}

when(x) {
    0 -> return "zero"
    else -> return "nonzero"
}

* Immutability
Prefer using immutable data to mutable.
Always declare local variables and properties as val rather than var if they are not modified after initialization.
Always use immutable collection interfaces (Collection, List, Set, Map) to declare collections which are not mutated.
When using factory functions to create collection instances, always use functions that return immutable collection types when possible:

// Bad: use of mutable collection type for value which will not be mutated
fun validateValue(actualValue: String, allowedValues: HashSet<String>) { ... }

// Good: immutable collection type used instead
fun validateValue(actualValue: String, allowedValues: Set<String>) { ... }

// Bad: arrayListOf() returns ArrayList<T>, which is a mutable collection type
val allowedValues = arrayListOf("a", "b", "c")

// Good: listOf() returns List<T>
val allowedValues = listOf("a", "b", "c")

* The elvis operator ?: that allow to express idioms like "take the value if it is positive or else use length"
with a concise and readable expressions like .takeIf { it >= 0 } ?: s.length,
Condition: val b: Int = if (a != null) a.length else -1
Elvis: val b = a?.length ?: -1

* Note that unlike some other languages, there are no implicit widening conversions for numbers in Kotlin -> Error:
Type mismatch. NO TYPE CASTING!!!

* NPE-lovers: not-null assertion operator (!!) converts any value to a non-null type and throws an exception if the value is null.
Another option is to use safe casts that return null if the attempt was not successful: val aInt: Int? = a as? Int
"Safe" (nullable) cast operator: To avoid exceptions, use the safe cast operator as? that returns null on failure.
val x: String? = y as? String

* Smart casts
In most cases, you don't need to use explicit cast operators in Kotlin because the compiler tracks the is -checks and explicit casts
for immutable values and inserts (safe) casts automatically when needed:
fun demo(x: Any) {
    if (x is String) {
        print(x.length) // x is automatically cast to String
    }
}

* Kotlin has three structural jump expressions:
return by default returns from the nearest enclosing function or anonymous function
break terminates the nearest enclosing loop
continue proceeds to the next step of the nearest enclosing loop

* CONSTRUCTORS
* A class in Kotlin can have a primary constructor and one or more secondary constructors.
The primary constructor is part of the class header: it goes after the class name (and optional type parameters).
If the primary constructor does not have any annotations or visibility modifiers, the constructor keyword can be omitted:
To create a class and constructor
class Person constructor(firstName: String) {   }

If the primary constructor does not have any annotations or visibility modifiers, the constructor keyword can be omitted:
class Person(firstName: String) { /*...*/ }

The primary constructor cannot contain any code. Initialization code can be placed in initializer blocks, which are prefixed with the init keyword.
During an instance initialization, the initializer blocks are executed in the same order as they appear in the class body, interleaved with the property initializers
Parameters of the primary constructor can be used in the initializer blocks. They can also be used in property initializers declared in the class body
The primary constructor cannot contain any code. Initialization code can be placed in initializer blocks, which are prefixed with the init keyword.
During an instance initialization, the initializer blocks are executed in the same order as they appear in the class body, interleaved with the property initializers

In fact, for declaring properties and initializing them from the primary constructor, Kotlin has a concise syntax:
class Person(val firstName: String, val lastName: String, var age: Int) { /*...*/ }
*
class Employee {
    var employees: MutableList<Employee> = mutableListOf()
Secondary constructors
The class can also declare secondary constructors, which are prefixed with constructor
    constructor(manager: Employee) {
        manager.employees.add(this)
    }
}
*
class Manager(val name: String) {
    var worker: MutableList<Manager> = mutableListOf()
If the class has a primary constructor, each secondary constructor needs to delegate to the primary constructor,
either directly or indirectly through another secondary constructor(s).
Delegation to another constructor of the same class is done using the this keyword
    constructor(name: String, leader: Manager) : this(name) {
        leader.worker.add(this)
    }
}
*
Code in initializer blocks effectively becomes part of the primary constructor.
Delegation to the primary constructor happens as the first statement of a secondary constructor,
so the code in all initializer blocks and property initializers is executed before the secondary constructor body.
Even if the class has no primary constructor, the delegation still happens implicitly, and the initializer blocks are still executed:

class Constructors {
    init {
        println("Init block")
    }
    constructor(i: Int) {
        println("Constructor $i")
    }
}
*
If a non-abstract class does not declare any constructors (primary or secondary), it will have a generated primary constructor with no arguments.
The visibility of the constructor will be public.
If you don't want your class to have a public constructor, declare an empty primary constructor with non-default visibility:
class DontCreateMe private constructor () { /*...*/ }
class Manager(val name: String) {
    var worker: MutableList<Manager> = mutableListOf()

    // If the class has a primary constructor, each secondary constructor needs to delegate to the primary constructor, either directly or indirectly through another secondary constructor(s).
    // Delegation to another constructor of the same class is done using the this keyword
    constructor(name: String, leader: Manager) : this(name) {
        leader.worker.add(this)
    }
}
* INHERITANCE
All classes in Kotlin have a common superclass Any, that is the default superclass for a class with no supertypes declared:
class Example // Implicitly inherits from Any
Any has three methods: equals(), hashCode() and toString(). Thus, they are defined for all Kotlin classes.
By default, Kotlin classes are final: they can’t be inherited. To make a class inheritable, mark it with the open keyword.
open class Base //Class is open for inheritance

To declare an explicit supertype, place the type after a colon in the class header:
open class Base(p: Int)
class Derived(p: Int) : Base(p)
If the derived class has a primary constructor, the base class can (and must) be initialized right there, using the parameters of the primary constructor.
If the derived class has no primary constructor, then each secondary constructor has to initialize the base type using the super keyword, or to delegate to another constructor which does that.
Note that in this case different secondary constructors can call different constructors of the base type

* OVERRIDING
In Kotlin, implementation inheritance is regulated by the following rule:
if a class inherits multiple implementations of the same member from its immediate superclasses, it must override this member and provide its own implementation (perhaps, using one of the inherited ones).
To denote the supertype from which the inherited implementation is taken, use super qualified by the supertype name in angle brackets, e.g. super<Base>

*
Compile-time constants
If the value of a read-only property is known at the compile time, mark it as a compile time constant using the const modifier.
Such properties need to fulfil the following requirements:
Top-level, or member of an object declaration or a companion object.
Initialized with a value of type String or a primitive type
No custom getter

*
Late-initialized properties and variables
Normally, properties declared as having a non-null type must be initialized in the constructor.
However, fairly often this is not convenient.
For example, properties can be initialized through dependency injection, or in the setup method of a unit test.
In this case, you cannot supply a non-null initializer in the constructor,
but you still want to avoid null checks when referencing the property inside the body of a class.
To handle this case, you can mark the property with the lateinit modifier:

public class MyTest {
    lateinit var subject: TestSubject

    @SetUp fun setup() {
        subject = TestSubject()
    }
    @Test fun test() {
        subject.method()  // dereference directly
    }
}
The modifier can be used on var properties declared inside the body of a class
(not in the primary constructor, and only when the property does not have a custom getter or setter) as well as for
top-level properties and local variables. The type of the property or variable must be non-null, and it must not be a primitive type.

* Visibility modifiers
If you do not specify any visibility modifier, public is used by default, which means that your declarations will be visible everywhere.
private, it will only be visible inside the file containing the declaration.
internal, it is visible everywhere in the same module.
protected is not available for top-level declarations.

*
Single-expression functions
When a function returns a single expression, the curly braces can be omitted and the body is specified after a = symbol:
fun double(x: Int): Int = x * 2
Explicitly declaring the return type is optional when this can be inferred by the compiler:
fun double(x: Int) = x * 2

*
Variable number of arguments (Varargs)
fun <T> asList(vararg ts: T): List<T> {
    val result = ArrayList<T>()
    for (t in ts) // ts is an Array
        result.add(t)
    return result
}

* Tail recursive functions
Kotlin supports a style of functional programming known as tail recursion.
For some algorithms that would normally use loops you can use a recursive function instead without a risk of stack overflow.
When a function is marked with the tailrec modifier and meets the required form, the compiler optimizes out the recursion, leaving behind a fast and efficient loop based version instead:
To be eligible for the tailrec modifier, a function must call itself as the last operation it performs.
You cannot use tail recursion when there is more code after the recursive call, and you cannot use it within try/ catch/ finally blocks.
fun Fact(num: Int, x:Int):Long{
    return if(num==1)   // terminate condition
        x.toLong()
    else
        Fact(num-1,x*num)   //tail recursion
}
fun fact(x: Int): Int {
    // tailrec is a recursive function which calls itself
    tailrec fun factorial(a: Int, b: Int): Int {
        if (a == 0) return b
        else return factorial(a - 1, a * b)
    }
    return factorial(x, 1)
}
* Lambda expression syntax
The full syntactic form of lambda expressions is as follows:
val sum: (Int, Int) -> Int = { x: Int, y: Int -> x + y }

A lambda expression is always surrounded by curly braces.
Parameter declarations in the full syntactic form go inside curly braces and have optional type annotations.
The body goes after an -> sign.
If the inferred return type of the lambda is not Unit, the last (or possibly single) expression inside the lambda body is treated as the return value.
If you leave all the optional annotations out, what's left looks like this:
val sum = { x: Int, y: Int -> x + y }

If the compiler can figure the signature out itself, it is allowed not to declare the only parameter and omit ->.
The parameter will be implicitly declared under the name it:
ints.filter { it > 0 } // this literal is of type '(it: Int) -> Boolean'
Another Example: strings.filter { it.length == 5 }.sortedBy { it }.map { it.toUpperCase() }

* Referential equality (=== - two references point to the same object and its negated counterpart !==)
Structural equality is checked by the == operation and its negated counterpart !=.
a?.equals(b) ?: (b === null)
*/



// TRY - CATCH
// There may be zero or more catch blocks. finally block may be omitted.
// However, at least one catch or finally block should be present.
fun testException() {
    val result = try {
        transform("White")
    } catch (e: Exception) {
        throw Exception("Not Found!")
    } finally {
        println("Exciting from execution...")
    }
}

//Create a singleton
object Singleton {
    const val name: String = "Mike"
    //age could be const as well
    val age: Int = 34
}


/*
LET
The context object is available as an argument (it ). The return value is the lambda result.
let can be used to invoke one or more functions on results of call chains.
*/
fun let() {
    val num = mutableListOf("one", "two", "three", "four")
    val resultList = num.map { it.length }.filter { it > 3 }
    println(resultList)
    // or without assignment
    num.map { it.length }.filter { it > 3 }.let {
        println(it)
    }

    // With let, no object creation/assign
    Person("Alice", 20, "Amsterdam").let {
        println(it.name)
    }
    // If you write the same without let, you'll have to introduce a new variable and repeat its name whenever you use it.
    val alice = Person("Alice", 20, "Amsterdam")
    println(alice.name)
}

/*
RUN
The context object is available as a receiver (this ). The return value is the lambda result.
run does the same as with but invokes as let- as an extension function of the context object.
run is useful when your lambda contains both the object initialization and the computation of the return value.
*/
fun run() {
    val str = "Hello"
    str.run {
        this.toUpperCase()
        println("The string length: $length")
        println("The string length: ${this.length}") // same as upper one
    }
    // if use let:
    str.let {
        it.toUpperCase()
        println("The string length: ${it.length}")
    }
}

/*
APPLY
The context object is available as a receiver (this ). The return value is the object itself.
Use apply for code blocks that don't return a value and mainly operate on the members of the receiver object.
The common case for apply is the object configuration.
Such calls can be read as “ apply the following assignments to the object.”
*/
fun apply() {
    val adam = Person("Alice", 20, "Amsterdam").apply {
        this.name = "Adam" // or it can name = "Adam
        this.city = "Houston" // city = "Houston
    }
    println(adam.name)

    val numbers = mutableListOf("One", "Two", "Three")
    val countsEndsWithE = numbers.run {
        add("Four")
        add("Five")
        count { it.endsWith("e") }
    }
    println("Count is: $countsEndsWithE")
}

/*
WITH
A non-extension function: the context object is passed as an argument, but inside the lambda, it's available as a receiver (this ).
The return value is the lambda result.
We recommend with for calling functions on the context object without providing the lambda result.
In the code, with can be read as “ with this object, do the following.”
 */
fun with() {
    val nums = mutableListOf("one", "two", "three")
    with(nums) {
        val firstItem = first()
        val lastItem = last()
        println("Printing items: $firstItem - $lastItem")
    }
}

/*
ALSO
The context object is available as an argument (it ). The return value is the object itself.
also is good for performing some actions that take the context object as an argument.
Use also for actions that need a reference rather to the object than to its properties and functions,
or when you don't want to shadow this reference from an outer scope.
When you see also in the code, you can read it as “ and also do the following with the object.”
 */
fun also() {
    val nums2 = mutableListOf("one", "two", "three")
    nums2
        .also { println("The list elements before adding a new one: $it") }
        .add("four")
    println(nums2)

    //Swap two variables
    var a = 1
    var f = 2
    a = f.also { f = a }
    println("Numbers $a and $f")
}


