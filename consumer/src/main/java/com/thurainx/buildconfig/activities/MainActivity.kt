package com.thurainx.buildconfig.activities

import androidx.appcompat.app.AppCompatActivity
import android.os.Bundle
import com.thurainx.buildconfig.R
import com.thurainx.shared.showSnackBar

class MainActivity : AppCompatActivity() {
    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        setContentView(R.layout.activity_main)

        showSnackBar("consumer app")
    }
}