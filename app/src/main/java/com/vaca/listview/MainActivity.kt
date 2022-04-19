package com.vaca.listview

import androidx.appcompat.app.AppCompatActivity
import android.os.Bundle
import android.view.View
import android.widget.AdapterView
import android.widget.ListView

class MainActivity : AppCompatActivity() {
    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        setContentView(R.layout.activity_main)
        val listview=findViewById<ListView>(R.id.fuck)
        listview.adapter=MyAdapter(arrayListOf("fuck1","fuck2"),this)
        listview.onItemClickListener=object: AdapterView.OnItemClickListener{
            override fun onItemClick(p0: AdapterView<*>?, p1: View?, p2: Int, p3: Long) {

            }

        }
        listview.setSelector(R.color.black)
//        Thread{
//            Thread.sleep(1000)
//            runOnUiThread {
//                listview.setSelection(0)
//            }
//
//        }.start()


    }
}