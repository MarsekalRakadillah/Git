package com.marsekal.git

import androidx.appcompat.app.AppCompatActivity
import android.os.Bundle

class MainActivity : AppCompatActivity() {
    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        setContentView(R.layout.activity_main)

        println("this is contained in my second commit")
        println("local changes")
        println("change 2")
        println("hello from the other laptop")
        println("tes push commit")
    }
}