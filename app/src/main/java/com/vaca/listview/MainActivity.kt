package com.vaca.listview

import androidx.appcompat.app.AppCompatActivity
import android.os.Bundle
import android.widget.ListView

class MainActivity : AppCompatActivity() {
    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        setContentView(R.layout.activity_main)
        val listview=findViewById<ListView>(R.id.fuck)
        listview.adapter=MyAdapter(arrayListOf("fuck1","fuck2"),this)
    }
}