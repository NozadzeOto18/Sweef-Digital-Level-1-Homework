package com.example.homework

import androidx.appcompat.app.AppCompatActivity
import android.os.Bundle
import android.widget.Toast
import kotlinx.android.synthetic.main.activity_main.*

class PalindromeActivity : AppCompatActivity() {
    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        setContentView(R.layout.activity_main)
        init()
    }

    private fun init() {
        if (inputET.text.toString().isNotEmpty()) {
            if (isPalindrome(inputET.text.toString())) {
                Toast.makeText(this, "inputted text is palindrome", Toast.LENGTH_SHORT).show()
            } else {
                Toast.makeText(this, "inputted text is not palindrome", Toast.LENGTH_SHORT).show()
            }
        }else{
            Toast.makeText(this, "please input text", Toast.LENGTH_SHORT).show()
        }
    }

    private fun isPalindrome(text: String): Boolean {
        var Str = text
        var reversedStr = Str.reversed()
        return (Str == reversedStr)

    }
}
