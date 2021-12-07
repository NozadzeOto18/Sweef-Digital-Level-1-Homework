package com.example.`homework`

internal class MyDS {
    fun notContain(array: Array<Int>): Int {
        var maxNum: Int = array.max() ?: 0
        var minNum = 0
        for (num in maxNum downTo 0 ) {
            if (num !in array && num > 0) {
                minNum = num
            }
        }
        return minNum
    }
}
internal object Main {
    @JvmStatic
    fun main(args: Array<String>) {
        val ds = MyDS()
        var arr = arrayOf(1, 2, 3, 4, 8, 5)
        var num = ds.notContain(arr)
        println(num)
    }
}
