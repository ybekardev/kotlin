package org.kotlin.warmup.edureka

data class User(val name : String, val age : Int){
    val edureka = User("Josh", 34)
    val eduCommunity = edureka.copy(age = 32)

}

