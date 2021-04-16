package com.ibnu.listview

import android.R.layout.simple_list_item_1
import androidx.appcompat.app.AppCompatActivity
import android.os.Bundle
import android.widget.ArrayAdapter
import kotlinx.android.synthetic.main.activity_main.*
class MainActivity : AppCompatActivity() {
    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        setContentView(R.layout.activity_main)
        val data = listOf("a","b","c","d")
        ini_list.adapter = ArrayAdapter(this, simple_list_item_1, data)
    }
}