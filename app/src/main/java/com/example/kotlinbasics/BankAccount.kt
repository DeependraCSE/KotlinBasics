package com.example.kotlinbasics

class BankAccount(
    var accountHolder : String,
    var balance : Double
) {
    private val transactionHistory = mutableListOf<String>()
    fun deposit(amount : Double){
        balance+=amount
        transactionHistory.add("$accountHolder deposited Rs $amount")
    }

    fun withDrow(amount : Double){
        if(amount <= balance){
            //we can withDraw money
            balance-=amount
            transactionHistory.add("$accountHolder withdrew Rs $amount")
        }else{
            println("You don't have enough funds to withdraw Rs $amount")
        }
    }

    fun displayTransactionHistory(){
        println("Transaction history for $accountHolder")
        for(transaction in transactionHistory){
            println(transaction)
        }
        println("$accountHolder's balance is $balance")
    }
}