package org.kotlin.warmup.kotlinlang.interfaces

interface Person : Named {
    val firstName: String
    val lastName: String

    override val name: String get() = "$firstName $lastName"
}