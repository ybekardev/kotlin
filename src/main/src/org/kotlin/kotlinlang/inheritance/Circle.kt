package org.kotlin.kotlinlang.inheritance

open class Circle() : Shape() {
    // Overriding properties works in a similar way to overriding methods;
    // properties declared on a superclass that are then redeclared on a derived class must be prefaced with override, and they must have a compatible type.
    // Each declared property can be overridden by a property with an initializer or by a property with a get method.
    // You can also override a val property with a var property, but not vice versa.
    // This is allowed because a val property essentially declares a get method, and overriding it as a var additionally declares a set method in the derived class.
    override var vertexCount = 4

    override fun draw() {
        println("Circle - draw object")
    }

    // can't override in any other classes
    final override fun fill() {
        println("Circle - fill object")
    }

    //if commented the parent class draw will be called

    open fun a() {
        println("Circle - a ")
    }

    override fun update() {
        // Code in a derived class can call its superclass functions and property accessors implementations using the super keyword:
        super.update()
        println("Updating the Circle")
    }
}