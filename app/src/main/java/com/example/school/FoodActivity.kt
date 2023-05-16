package com.example.school

import android.annotation.SuppressLint
import android.content.Intent
import androidx.appcompat.app.AppCompatActivity
import android.os.Bundle
import android.view.View
import android.widget.AdapterView
import android.widget.ArrayAdapter
import android.widget.ListView

class FoodActivity : AppCompatActivity() {
    private lateinit var listView: ListView

    @SuppressLint("MissingInflatedId")
    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        setContentView(R.layout.activity_food)

        listView = findViewById(R.id.foodItems_ListView)
        val foodItems = resources.getStringArray(R.array.food_items)
        val adapter = ArrayAdapter(this, android.R.layout.simple_list_item_1, foodItems)
        listView.adapter = adapter

        listView.onItemClickListener = AdapterView.OnItemClickListener { _, _, position, _ ->
            val intent = Intent(this, FoodDetailsActivity::class.java)
            intent.putExtra("position", position)
            startActivity(intent)
            finish()
        }


    }

    fun foodgoback(view: View) {
        val intent = Intent(this, FoodDetailsActivity::class.java)
        startActivity(intent)
        finish()
    }

    override fun onBackPressed() {
        val intent = Intent(this, MainActivity::class.java)
        startActivity(intent)
        finish()


    }
}