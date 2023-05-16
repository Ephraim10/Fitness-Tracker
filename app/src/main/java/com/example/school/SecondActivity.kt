package com.example.school

import android.content.Intent
import androidx.appcompat.app.AppCompatActivity
import android.os.Bundle
import android.util.Log
import android.view.Menu
import android.view.View

class SecondActivity : AppCompatActivity() {
    private var newArray: IntArray = intArrayOf()
    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        setContentView(R.layout.activity_second)

        newArray = intArrayOf(
            R.id.bow_pose, R.id.bridge_pose, R.id.chair_pose, R.id.child_pose, R.id.cobbler_pose,
            R.id.cow_pose, R.id.playji_pose, R.id.pauseji_pose, R.id.plank_pose, R.id.crunches_pose,
            R.id.situp_pose, R.id.rotation_pose, R.id.twist_pose, R.id.windmill_pose, R.id.legup_pose
        )
        fun imageButtonClicked(view: View) {
            for (i in newArray.indices) {
                if (view.id == newArray[i]) {
                    val value = i + 1
                    Log.i("FIRST", value.toString())
                    val intent = Intent(this@SecondActivity, ThirdActivity::class.java)
                    intent.putExtra("value", value.toString())
                    startActivity(intent)
                    return
                }
            }
        }

    }
    override fun onCreateOptionsMenu(menu: Menu): Boolean {
        menuInflater.inflate(R.menu.main, menu)
        return true
    }

}