package com.example.`homework`

internal class MyDS {
    var coin50:Int = 0
    var coin20:Int = 0
    var coin10:Int = 0
    var coin5:Int = 0
    var coin1:Int = 0
    fun minSplit(amount: Int): Int {
        var remain = amount
        coin50 = (remain - remain % 50) / 50
        remain = remain % 50
        coin20 = (remain - remain % 20) / 20
        remain = remain % 20
        coin10 = (remain - remain % 10) / 10
        remain = remain % 10
        coin5 = (remain - remain % 50) / 5
        remain = remain % 5
        coin1 = (remain - remain % 10) / 1
        //returns max values of coins
        return (coin50 + coin20 + coin10 + coin5 + coin1)
    }
    fun count(x:Int) {
        minSplit(x)
        //prints max values of each coins
        println("You have " + x + " amount")
        println(" coin 50 - " + coin50.toString() + ", coin 20 - " + coin20.toString() + ", coin 10 - " + coin10.toString() + ", coin 5 - " + coin5.toString() + ", coin 1 - " + coin1.toString())
    }
}
internal object Main {
    @JvmStatic
    fun main(args: Array<String>) {
        val ds = MyDS()
        ds.count(95)

    }
}
