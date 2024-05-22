package com.example.kotlinbasics

class Dog (val name : String, val bread : String, var age : Int = 0){
    init {
        bark(name)
    }
    fun bark(name: String){
        println("$name Woof Woof")
    }
}