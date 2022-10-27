package com.example.pr_15

import android.content.Intent
import androidx.appcompat.app.AppCompatActivity
import android.os.Bundle
import android.os.Parcel
import android.os.Parcelable
import android.view.View
import android.widget.TextView

class MainActivity : AppCompatActivity() {
    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        setContentView(R.layout.activity_main)
    }

    fun buttonSendClick(view: View) {
        val breedText: TextView = findViewById(R.id.editTextTextBreed)
        val yearOfBirthText: TextView = findViewById(R.id.editTextTextYearOfBirth)
        val monthOfBirthText: TextView = findViewById(R.id.editTextTextMonthOfBirth)
        val breed = breedText.text.toString()
        val year = yearOfBirthText.text.toString()
        val month = monthOfBirthText.text.toString()
        val user: SecondActivity.User = SecondActivity.User(breed, year, month)
        val intent: Intent = Intent(
            this@MainActivity,
            SecondActivity::class.java
        )
        intent.putExtra(user.javaClass.simpleName, user)
    }

    fun onClick(view: View) {
        val intent: Intent = Intent(this@MainActivity, SecondActivity::class.java)
        when (view.id) {
            R.id.buttonSave -> startActivity(intent)
        }
    }
}

