package com.example.`homework`

internal class MyDS {
    fun isPalindrome(text: String): Boolean {
        var Str = text
        var reversedStr = Str.reversed()
        return (Str == reversedStr)
    }
}
internal object Main {
    @JvmStatic
    fun main(args: Array<String>) {
        val ds = MyDS()
        if (ds.isPalindrome("helleh")){
            println("Text is palindrome")
        }else{
            println("Text is not palindrome")
        }
    }
}
