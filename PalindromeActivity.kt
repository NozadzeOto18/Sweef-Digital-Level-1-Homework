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

    // We have EditText layout and button
    private fun init() {
        var Str = inputET.text.toString()

        //reverse inputted text
        var reversedStr = inputET.text.toString().reversed()

        //With button click we compare inputted text to reversed inputted text
        button.setOnClickListener{

            //check if inputted text is empty
            if (inputET.text.toString().isNotEmpty()){
                if (Str == reversedStr){
                    Toast.makeText(this, "Text is palindrome", Toast.LENGTH_SHORT).show()
                }else{
                    Toast.makeText(this, "Text is not palindrome", Toast.LENGTH_SHORT).show()
                }
            }else{
                Toast.makeText(this, "Please input text", Toast.LENGTH_SHORT).show()
            }
        }
    }
}
