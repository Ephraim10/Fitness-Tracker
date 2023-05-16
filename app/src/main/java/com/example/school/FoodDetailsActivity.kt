package com.example.school

import android.content.Intent
import androidx.appcompat.app.AppCompatActivity
import android.os.Bundle
import android.view.View
import android.widget.TextView

class FoodDetailsActivity : AppCompatActivity() {
    private lateinit var textView: TextView
    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        setContentView(R.layout.activity_food_details)
        textView = findViewById(R.id.txt)
        val story = intent.getStringExtra("story")
        textView.text = story
    }
    fun goBack(view: View) {
        val intent = Intent(this, FoodActivity::class.java)
        // add flags to clear the back stack and make the FoodActivity the topmost activity
        intent.addFlags(Intent.FLAG_ACTIVITY_CLEAR_TOP)
        startActivity(intent)
        finish()
        fun onBackPressed() {
            val intent = Intent(this, FoodActivity::class.java)
            // add flags to clear the back stack and make the FoodActivity the topmost activity
            intent.addFlags(Intent.FLAG_ACTIVITY_CLEAR_TOP)
            startActivity(intent)

            // show the interstitial ad if it's loaded, otherwise log an error message


            finish()
        }
    }
}