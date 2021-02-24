package org.kotlin.warmup.kotlinlang.inheritance

class Car(override val vertexCount: Int = 4) : Vehicle { // Always has 4 vertices

    // must override the vertexCount in the signature
}