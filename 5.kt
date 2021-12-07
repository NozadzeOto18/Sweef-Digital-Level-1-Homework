    private fun init() {
        // number of floors ( n )
        var floor = 2
        countVariants(floor)
    }

    fun factorial(num: Int): Int{
        var factorial : Long = 1
        for (i in 1..num) {
            factorial *=i.toLong()
        }
        return factorial.toInt()
    }

    private fun countVariants(stearsCount: Int): Int{
        //number of steps between each floor
        var step = 5
        var fullNumber = step * stearsCount
        var result = 2 // first variant (if all stages will be 1 step) and second (if all stages will be 2 step) 
        while(fullNumber > fullNumber/2){
            result += factorial(fullNumber)
            fullNumber--
        }
        return result
    }
