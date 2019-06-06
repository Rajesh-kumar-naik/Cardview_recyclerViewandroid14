package com.example.iteradmin.cardview_recyclerview_android14

import android.support.v7.app.AppCompatActivity
import android.os.Bundle
import android.support.v7.widget.GridLayoutManager
import android.support.v7.widget.LinearLayoutManager
import android.support.v7.widget.RecyclerView
import kotlinx.android.synthetic.main.activity_main.*


class MainActivity : AppCompatActivity() {

    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        setContentView(R.layout.activity_main)
        val recycle=findViewById<RecyclerView>(R.id.recycle1)
        val lm:RecyclerView.LayoutManager=GridLayoutManager(this,4)
        recycle1.layoutManager=lm
        val c1=Card("https://s19453.pcdn.co/wp-content/uploads/2014/04/417_Modi_Peace_Merabharosa.jpg",
                "PM Modi",
                "Chai Wala")
        val c2=Card("https://www.hindustantimes.com/rf/image_size_960x540/HT/p2/2019/06/04/Pictures/cricket-wc-2019-ind-training_e2920994-86df-11e9-ab40-33c30d629efb.jpg",
                "Virat Kholi",
                "chiku")

        recycle1.adapter=Adapter1(this)

    }
}
