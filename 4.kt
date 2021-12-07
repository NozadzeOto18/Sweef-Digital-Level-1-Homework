package com.example.`homework`

internal class MyDS {
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

    fun isProperly(sequence: String): Boolean {
        var bracket  : Array<String> = emptyArray()
        for (char in sequence) {
            if (char.toString() == "(") {
                bracket = append(bracket, "(")
            } else {
                if (bracket.isEmpty()) {
                    return false
                }
                println(bracket)
                removeLast(bracket)
                println(bracket)
            }
        }
        return !bracket.isEmpty()
    }
}
internal object Main {
    @JvmStatic
    fun main(args: Array<String>) {
        val ds = MyDS()
        var text: String = "(()"
        var bool : Boolean = ds.isProperly(text)
        if(bool){
            println("brackes are correctly written")
        }else{
            println("brackes are incorrectly written")
        }
    }
}
