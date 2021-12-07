package com.example.`homework`

internal class MyDS {
    fun factorial(num: Int): Int {
        var factorial = 1
        for (i in 1 until num) {
            factorial *= i
        }
        println(factorial)
        return factorial.toInt()
    }

    fun countVariants(stearsCount: Int): Int {
        //number of steps between each floor
        var step = 5
        var fullNumber = step * stearsCount
        var result =
            2 // first variant (if all stages will be 1 step) and second (if all stages will be 2 step)
        while (fullNumber > (fullNumber / 2)) {
            result += factorial(fullNumber)
            fullNumber--
        }
        return result
    }
}

internal object Main {
    @JvmStatic
    fun main(args: Array<String>) {
        val ds = MyDS()
        var variants = ds.countVariants(2)
        println(variants)

    }
}
