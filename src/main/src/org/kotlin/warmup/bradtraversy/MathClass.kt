package org.kotlin.warmup.bradtraversy

fun main(){
    val x = 4 / 2
    println(x)

    val y = 4f / 3
    println(y)

    val a = 10 % 3
    println(a)

    val h1 = "Hello"
    val h2 = "Hello"
    val bool = (h1 == h2)
    println(bool)

    val bool2 = (h1 != h2)
    println(bool2)

    val bool3 = (true || true)
    println(bool3)

    val bool4 = (true && false)
    println(bool4)

    val string = "Learning Kotlin!"
    println(string.toUpperCase())

    val t = 1 + 1
    if(t == 2){
        println("t is 2")
    }else if(t == 3){
        println("t is 3")
    }else {
        println("t is NOT 2 or 3!")
    }

    val g = if(t == 2) 2 else 3
    println(g)

    //Null values
    val s: Int? = null
    println(s)

  /*  val userInput = readLine()
    val userInput2 = readLine()
    val total = userInput!!.toInt() + userInput2!!.toInt();
    println(total)

    val userInput3 = readLine() ?: "0"
    val userInput4 = readLine() ?: "0"
    val total2 = userInput3.toInt() + userInput4.toInt();
    println(total2)*/

    val shoppingList = listOf<String>("Lamborghini", "Rolex", "Ferrari")
    println(shoppingList)
    println(shoppingList[2])

    val shoppingList2 = mutableListOf<String>("Car", "House", "Job")
    shoppingList2.add("Office")
    println(shoppingList2)

    var counter = 0;
    while(counter < shoppingList2.size){
        val obj = shoppingList2[counter]
        println(obj)
        counter++
    }

    for(shplist in shoppingList2){
        println(shplist)
    }

    for(i in 1..10){
        print(i)
    }

    val r = 6
    when(r){
        in 1..3 -> println("value is between 1 - 3")
        in 4..6 -> println("value is between 4 - 6")
        else -> {
            println("value is not in the range")
        }

    }
}
