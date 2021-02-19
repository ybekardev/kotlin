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

}
