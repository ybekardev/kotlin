package org.kotlin.kotlinlang.inheritance

class Truck : Vehicle {
    override var vertexCount: Int = 5 // Can be set to any number later
}

/*
Vehicle - Car - Truck Example:
Overriding properties works in a similar way to overriding methods;
properties declared on a superclass that are then redeclared on a derived class must be prefaced with override, and they must have a compatible type.
Each declared property can be overridden by a property with an initializer or by a property with a get method.
You can also override a val property with a var property, but not vice versa.
This is allowed because a val property essentially declares a get method, and overriding it as a var additionally declares a set method in the derived class.
Note that you can use the override keyword as part of the property declaration in a primary constructor.
 */