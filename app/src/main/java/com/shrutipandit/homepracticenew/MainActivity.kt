package com.shrutipandit.homepracticenew

import android.os.Bundle
import androidx.appcompat.app.AppCompatActivity

import com.shrutipandit.homepracticenew.databinding.ActivityMainBinding
class MainActivity : AppCompatActivity() {
    private lateinit var binding: ActivityMainBinding
    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        binding = ActivityMainBinding.inflate(layoutInflater)
        setContentView(binding.root)

        binding.convertButton.setOnClickListener {
            val inputNumber =binding. numberInput.text.toString().toIntOrNull()

            if (inputNumber != null) {
                val numberSpelling = convertNumberToSpelling(inputNumber)
                binding.spellingResult.text = numberSpelling
            } else {
               binding. spellingResult.text = "Invalid input"
            }
        }
    }
    private fun convertNumberToSpelling(number: Int): String {
        return when (number) {
            1 -> "One"
            2 -> "Two"
            3-> "three"
            4-> "five"
            5 -> "five"
            6 -> "six"
            7-> "seven"
            8-> "eight"
            9 -> "nine"
            10 -> "ten"
            11-> "eleven"
            12-> "twelve"
            13 -> "thirteen"
            14 -> "fourteen"
            15-> "fifteen"
            16-> "sixteen"
            17-> "seventeen"
            18 -> "eighteen"
            19-> "nineteen"
            20-> "twenty"
            // Add more cases as needed
            else -> "Number not supported"
        }
    }


    }


