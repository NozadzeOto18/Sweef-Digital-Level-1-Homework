private fun notContain(array: Array<Int>): Int {
        var maxNum: Int = array.max() ?: 0
        var minNum = 0
        for (num in maxNum!! until 0 step -1) {
            println(num)
            if (num !in array && num > 0) {
                minNum = num
            }
        }
        return minNum
    }
