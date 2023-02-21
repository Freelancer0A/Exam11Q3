package com.example.exam11e3

import android.content.Context
import android.util.AttributeSet
import android.view.LayoutInflater
import android.widget.ImageView
import android.widget.LinearLayout
import android.widget.TextView

class MyCustomView(context:Context ):LinearLayout(context) {
    lateinit var text : TextView
    lateinit var iv : ImageView

    init {
        val inflater = context.getSystemService(Context.LAYOUT_INFLATER_SERVICE) as LayoutInflater
        val view = inflater.inflate(R.layout.my_custom_layout,this,false)
        text = view.findViewById(R.id.customTV)
        iv = findViewById(R.id.customIV)
    }
}