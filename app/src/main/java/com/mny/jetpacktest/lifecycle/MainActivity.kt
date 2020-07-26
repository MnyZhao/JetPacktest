package com.mny.jetpacktest.lifecycle

import androidx.appcompat.app.AppCompatActivity
import android.os.Bundle
import com.mny.jetpacktest.R

class MainActivity : AppCompatActivity() {
    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        setContentView(R.layout.activity_main)
        MyLifecycle(this)
//        lifecycle.addObserver(MyLifecycle(lifecycle))
    }
}