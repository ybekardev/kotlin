package org.kotlin.kotlinlang.interfaces

interface MyInterface {

    val prop: Int //abstract
    val property: String
        get() = "foo"

    fun foo() {
        println(prop)
    }
}