package com.example.kotlinbasics

fun main(){

    //this is immutable list, we can not add elements in months
    val months = listOf("january", "february","march")

    val additionalMonths = months.toMutableList()   // now we can add elements in additionalMonths
    val newMonths = arrayOf("april","may", "june")
    additionalMonths.addAll(newMonths)
    //println(additionalMonths)               //print [january, february, march, april, may, june]
    additionalMonths.add("july")
    //println(additionalMonths)                   // print [january, february, march, april, may, june, july]


    val days = mutableListOf<String>("Sunday","Monday")
    days.add("Tuesday")
    //println(days)                           // print [Sunday, Monday, Tuesday]
    val removeDays = mutableListOf<String>("Sunday","Tuesday")
    days.removeAll(removeDays)
    //println(days)                           //print [Monday]


}