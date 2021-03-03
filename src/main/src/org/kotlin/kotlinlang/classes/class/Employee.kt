package org.kotlin.kotlinlang.classes.`class`

class Employee {
    var employees: MutableList<Employee> = mutableListOf()
//Secondary constructors
//The class can also declare secondary constructors, which are prefixed with constructor
    constructor(manager: Employee) {
        manager.employees.add(this)
    }
}