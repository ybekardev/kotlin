package org.kotlin.warmup.kotlinlang.classes.`class`

class Manager(val name: String) {
    var worker: MutableList<Manager> = mutableListOf()

    // If the class has a primary constructor, each secondary constructor needs to delegate to the primary constructor, either directly or indirectly through another secondary constructor(s).
    // Delegation to another constructor of the same class is done using the this keyword
    constructor(name: String, leader: Manager) : this(name) {
        leader.worker.add(this)
    }
}