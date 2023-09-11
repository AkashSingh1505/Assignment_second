package com.akash.assignment_second.ui.activities

import android.content.Intent
import androidx.appcompat.app.AppCompatActivity
import android.os.Bundle
import android.os.Handler
import com.akash.assignment_second.R
import com.akash.assignment_second.ui.MainActivity

class Splash : AppCompatActivity() {

    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        setContentView(R.layout.activity_splash)
        val intent = Intent(this,MainActivity::class.java)
        Handler().postDelayed(
            {startActivity(intent)},1000
        )
    }
}