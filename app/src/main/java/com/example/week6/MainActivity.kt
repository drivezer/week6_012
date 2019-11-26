package com.example.week6_012

import android.content.Context
import androidx.appcompat.app.AppCompatActivity
import android.os.Bundle
import androidx.recyclerview.widget.GridLayoutManager
import androidx.recyclerview.widget.LinearLayoutManager
import androidx.recyclerview.widget.RecyclerView

class MainActivity : AppCompatActivity() {

    var recyclerView : RecyclerView? =  null
    var foodMenuText = arrayOf(
        "INTEL 1151 CORE I9-9900KS",
        "INTEL 1151 CORE I7-9700F",
        "INTEL 1151 CORE I5-9600KF 3.70 GHz",
        "INTEL 1151 CORE I3-9100 3.6 GHz",
        "INTEL 1151 PENTIUM GOLD G5420 3.80 GHz",
        "AMD AM4 ATHLON 3000G",
        "AMD AM4 RYZEN7 3800X 3.9 GHz",
        "AMD AM4 RYZEN5 3600X 3.8 GHz",
        "AMD AM4 RYZEN3 3200G 3.6 GHz",
        "INTEL 2066 CORE I9-9960X 3.1 GHz",
        "AMD TR4 RYZEN THREADRIPPER 2970WX 3.00 GHz",
        "INTEL 1151 CORE I9-9900 3.10 GHz",
        "AMD AM4 RYZEN7 2700X 3.7 GHz")
    var foodMenuImage = arrayOf<Int>(
        R.drawable.aa,
        R.drawable.bb,
        R.drawable.cc,
        R.drawable.dd,
        R.drawable.ee,
        R.drawable.ff,
        R.drawable.gg,
        R.drawable.hh,
        R.drawable.ii,
        R.drawable.jj,
        R.drawable.kk,
        R.drawable.ll,
        R.drawable.mm
    )
    var context : Context = this
    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        setContentView(R.layout.activity_main)

        setTitle("CPU")

        recyclerView = findViewById(R.id.recycler) as RecyclerView
        recyclerView!!.layoutManager = LinearLayoutManager(context)
        recyclerView!!.setLayoutManager(GridLayoutManager(context,2))
        var myAdapter = MyAdapter(foodMenuText,foodMenuImage,context)
        recyclerView!!.adapter = myAdapter
    }
}
