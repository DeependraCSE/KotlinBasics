package com.example.kotlinbasics

fun main(){
    val daysOfTheWeek = mapOf(1 to "Monday", 2 to "Tuesday", 3 to "Wednesday")
    //println(daysOfTheWeek[2])       // 2 is key, not index

    for (key in daysOfTheWeek.keys){
        print("$key is to ${daysOfTheWeek[key]}, ")       //print   1 is to Monday, 2 is to Tuesday, 3 is to Wednesday,
    }
}