package com.example.school

import android.content.Intent
import androidx.appcompat.app.AppCompatActivity
import android.os.Bundle
import android.os.Handler
import android.view.animation.Animation
import android.view.animation.AnimationUtils
import android.widget.ImageView
import android.widget.TextView

class SplashscreenActivity : AppCompatActivity() {

    private lateinit var up: Animation
    private lateinit var down: Animation
    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        setContentView(R.layout.activity_splashscreen)

        val imageView = findViewById<ImageView>(R.id.appsplash)
        up = AnimationUtils.loadAnimation(applicationContext, R.anim.up)
        imageView.animation = up

        val textView = findViewById<TextView>(R.id.appname)
        down = AnimationUtils.loadAnimation(applicationContext, R.anim.down)
        textView.animation = down

        Handler().postDelayed({
            startActivity(Intent(applicationContext, MainActivity::class.java))
            finish()
        }, 3500)
    }
}