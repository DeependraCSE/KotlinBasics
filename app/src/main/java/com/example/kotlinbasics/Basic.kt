package com.example.kotlinbasics

fun main(){
  //practice1()
    //var addition = add(7,8);
    //println(addition)
    //classExample()
    //coffeeExample()
    //itemList()
    bankAccount()
}

fun bankAccount(){
    val danisBankAccount = BankAccount("Danis", 1338.25)
    //println(danisBankAccount.accountHolder)
    // we are not able to access transactionHistory directly
    danisBankAccount.deposit(124.1)
    danisBankAccount.withDrow(14.22)
    danisBankAccount.deposit(1224.1)
    danisBankAccount.withDrow(44.6)
    danisBankAccount.deposit(1245.1)
    danisBankAccount.displayTransactionHistory()
}

fun practice1(){
    var playerChoice = ""
    var computerChoice = ""
    println("Rock, Paper or Scissors? Enter your choice")
    playerChoice = readln()
    val randomNumber = (1..3).random()
    when (randomNumber) {
        1 -> {
            computerChoice = "Rock"
        }
        2 -> {
            computerChoice = "Paper"
        }
        3 -> {
            computerChoice = "Scissors"
        }
    }
    println(computerChoice)

    val winner = when{
        playerChoice == computerChoice -> "Tie"
        playerChoice == "Rock" && computerChoice == "Scissors" -> "Player"
        playerChoice == "Paper" && computerChoice == "Rock" -> "Player"
        playerChoice == "Scissors" && computerChoice == "Paper" -> "Player"
        else -> "Computer"
    }
    /*if(winner == "Tie"){
        println("It's Tie")
    }else if(winner == "Player"){
        println("Player Won")
    }else{
        println("Computer won")
    }*/
    if(winner == "Tie"){
        println("It's Tie")
    }else{
        println("$winner won")
    }
}

fun add(num1:Int, num2:Int) : Int{
    var result = num1 + num2
    return result
}

fun classExample(){
    var daisy = Dog("Daisy","Dwarf")
    println("name ${daisy.name} is bread of ${daisy.bread} and ${daisy.age} year old")
    daisy.age = 19
    println("name ${daisy.name} is bread of ${daisy.bread} and ${daisy.age} year old")
}

fun coffeeExample(){
    val coffeeForDenise = CoffeeDetails(0,"Denise","XXL",0)
    makeCoffee(coffeeForDenise)
}

fun makeCoffee(coffeeDetails: CoffeeDetails){
    println("Coffee for ${coffeeDetails.name} which has ${coffeeDetails.sugerCount} suger, " +
            "mug size is ${coffeeDetails.size} with ${coffeeDetails.creemAmount} creem")
}

data class CoffeeDetails(
    val sugerCount : Int,
    val name : String,
    val size : String,
    val creemAmount : Int
    )

fun itemList(){
    //immutable list, we can not add any item to this list
    //val shoppingList = listOf("item1","item2","item3","item4","item5","item6")

    val shoppingList = mutableListOf("item1","item2","item3","item4","item5","item6")
    shoppingList.add("item7")
    println(shoppingList)
    shoppingList.removeAt(2)
    println(shoppingList)
    shoppingList.add(2,"itemaddIndex")
    println(shoppingList)
    shoppingList[2] = "item3"
    println(shoppingList)
    shoppingList.set(2,"itemModified")
    println(shoppingList)
    println(shoppingList.contains("item1"))
    for (item in shoppingList){
        println("item name is $item")
    }

    for (index in 0 until shoppingList.size){
        println("item possition is ${index+1} and item is ${shoppingList[index]}")
    }
}