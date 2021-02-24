package org.kotlin.warmup.kotlinlang

class Address {
    var name: String = "Holmes, Sherlock"
    var street: String = "Baker"
    var city: String = "London"
    var state: String? = null
    var zip: String = "123456"


}


fun main(){

    fun copyAddress(address: Address): Address{
        var info = Address()
        info.name = address.name
        info.street = address.street
        info.city = address.city
        info.state = address.state
        info.zip = address.zip

        return info
    }

    fun copyAddress2(add: Address){
        var info = Address()
        info.city = add.city
        println(info.city)
    }
}