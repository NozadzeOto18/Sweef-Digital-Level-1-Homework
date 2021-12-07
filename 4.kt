private fun init() {
        var text = "(())()"
        if (isProperly(text)) {
            println("brackes are correctly written")
        } else {
            println("brackets are incorrectly written")
        }
    }

    fun append(arr: Array<String>, element: String): Array<String> {
        val list: MutableList<String> = arr.toMutableList()
        list.add(element)
        return list.toTypedArray()
    }
    fun removeLast(arr: Array<String>): Array<String>{
        var list: MutableList<String> = arr.toMutableList()
        list.removeLast()
        return list.toTypedArray()
    }

    private fun isProperly(sequence: String): Boolean {
        var bracket = emptyArray<String>()
        for (char in sequence) {
            if (char.toString() == "(") {
                bracket = append(bracket, "(")
            } else {
                if (bracket.isEmpty()) {
                    return false
                }
                removeLast(bracket)
            }
        }
        return !bracket.isEmpty()
    }
