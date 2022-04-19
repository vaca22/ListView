package com.vaca.listview

import android.content.Context
import android.view.LayoutInflater
import android.view.View
import android.view.ViewGroup
import android.widget.BaseAdapter

class MyAdapter(val list:ArrayList<String>,val context: Context):BaseAdapter() {
    var inflater:LayoutInflater = LayoutInflater.from(context)


    override fun getCount(): Int {
        return list.size
    }

    override fun getItem(p0: Int): String {
        return list[p0]
    }

    override fun getItemId(p0: Int): Long {
        return p0.toLong()
    }

    override fun getView(p0: Int, p1: View?, p2: ViewGroup?): View {
        if(p1==null){
            val view=inflater.inflate(R.layout.fuck,null)
            return view
        }else{
            return p1
        }

    }
}