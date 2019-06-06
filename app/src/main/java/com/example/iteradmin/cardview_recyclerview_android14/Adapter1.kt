package com.example.iteradmin.cardview_recyclerview_android14

import android.content.Context
import android.support.v7.widget.RecyclerView
import android.view.LayoutInflater
import android.view.View
import android.view.ViewGroup
import android.widget.ImageView
import android.widget.TextView
import com.bumptech.glide.Glide

class Adapter1(conText:Context):RecyclerView.Adapter <Adapter1.MyViewHolder>() {
    private var mContext:Context
    init {
        this.mContext=conText
    }
    override fun onBindViewHolder(holder: Adapter1.MyViewHolder, p1: Int) {
        holder.thumbnail.setImageResource(R.drawable.barton)
        holder.title.text="Hawk Eye"
        holder.subtitle.text="Barton"

    }

    override fun getItemCount(): Int {
        return 10

    }

    override fun onCreateViewHolder(parent: ViewGroup, p1: Int): Adapter1.MyViewHolder {
        val rootView=LayoutInflater.from(parent.context)
                .inflate(R.layout.album_card,null,true)
        return MyViewHolder(rootView)
    }

    class MyViewHolder(view: View):RecyclerView.ViewHolder(view){
        val thumbnail:ImageView
        val title:TextView
        val subtitle:TextView

        init {
            this.thumbnail=view.findViewById(R.id.thumbnail)
            this.title=view.findViewById(R.id.title)
            this.subtitle=view.findViewById(R.id.subtitle)
        }

    }
}
