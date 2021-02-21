
open class Inherit {
    open fun run(){
        println("The person can run")
    }
}

class Derived : Inherit() {
    override fun run(){
        println("The person can't run")
    }
}

fun main(){
    var derived1 = Derived()
    derived1.run()
}