package com.example.kotlinbasics

fun main(){
    //val numbers : IntArray = intArrayOf(1,2,3,4,5,6)
    //val numbers  = intArrayOf(1,2,3,4,5,6)
    val numbers = arrayOf(1,2,3,4,5,6)
    //println(numbers)    // print address of numbers
    //println(numbers.contentToString())  // print array  [1, 2, 3, 4, 5, 6]

    for (element in numbers){
        //print("element")      // print 123456
        //print(" $element + 2")  // print 1 + 2 2 + 2 3 + 2 4 + 2 5 + 2 6 + 2
        //print(" ${element + 2}")    // print  3 4 5 6 7 8
    }

    val fruits = arrayOf(Fruit("Apple", 2.5),
                         Fruit(name = "Banana", price = 6.8))
    for (fruit in fruits){
        //println("${fruit.name}")
    }
    for (index in fruits.indices){
        //println("${fruits[index].name} is in index $index")
    }

    val mix = arrayOf("sunday", "monday", 1,2,3, Fruit("Apple", 5.6))
    print(mix.contentToString())    // print [sunday, monday, 1, 2, 3, Fruit(name=Apple, price=5.6)]
}

data class Fruit(val name : String, val price : Double)