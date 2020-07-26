package com.mny.viewmodel

import android.os.Bundle
import androidx.appcompat.app.AppCompatActivity
import androidx.lifecycle.ViewModelProvider
import com.mny.MyViewModel
import kotlinx.android.synthetic.main.activity_main.*

class MainActivity : AppCompatActivity() {

    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        var myViewModel = ViewModelProvider(this).get(MyViewModel::class.java)
        setContentView(R.layout.activity_main)
        tr.setText(myViewModel.number.toString())
        btn_add.setOnClickListener {
            myViewModel.number += 1
            tr.setText(myViewModel.number.toString())
        }
        btn_sub.setOnClickListener {
            myViewModel.number -= 1
            tr.setText(myViewModel.number.toString())
        }

    }
}
