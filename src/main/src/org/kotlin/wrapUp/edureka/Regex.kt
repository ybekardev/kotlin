package org.kotlin.wrapUp.edureka

import org.junit.jupiter.api.Assertions.assertTrue

private val Nothing?.length: Any
    get() {
        return length
    }

fun main(){
    var i : Int = 2
    if(i in 1..6)
        println(i)

    //var j : Int = 1
    for (j in 5 downTo 1)
        println(j)

    //var k =3;
    for(k in 9 downTo 3)
        println(k)

    //var l : Int = 2
    for(l in 4..8)
        println(l)

    //^ denotes the beginning
    //$denotes teh end of the expression

    val regex = """a([bc]+)d?""".toRegex()
    assertTrue(regex.matches("abcd"))
    assertTrue(regex.matches("acd"))
    assertTrue(regex.matches("abd"))

    var edu : String = "abc"
    //edu = null can't be done

    //nullable
    var ed : String? = "def"
    ed = null //can be done

    var e = null
    val l = e?.length ?: -1
    println(l)

    val d : String? = "Hello"
    val b = d?.length ?: -1
    println(b)

    val a = "World"
    val c = a.length ?: -1
    println(c)

}

/*
Elvis Operator (?:)

Example:
In Kotlin, we can declare variable which can hold null reference. Suppose we have a nullable reference a, we can say "if a is not null, use it, otherwise use some non-null value x"

var a: String? = "Nullable String Value"
Now, a can be null. So when we need to access value of a, then we need to perform safety check, whether it contains value or not. We can perform this safety check by conventional if...else statement.

val b: Int = if (a != null) a.length else -1
But here comes advance operator Elvis(Operator Elvis : ?:). Above if...else can be expressed with the Elvis operator as below:

val b = a?.length ?: -1
If the expression to the left of ?: (here : a?.length) is not null, the elvis operator returns it, otherwise it returns the expression to the right (here: -1). Right-hand side expression is evaluated only if the left-hand side is null.
 */