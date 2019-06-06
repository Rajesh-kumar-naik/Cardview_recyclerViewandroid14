package com.example.iteradmin.cardview_recyclerview_android14

import android.provider.MediaStore
import android.support.v7.widget.DialogTitle

class Card (thumbnail:String,title:String,subtitle:String){
    private val thumnail:String
    private val title:String
    private val subtitle:String

    init {
        this.thumnail=thumbnail
        this.title=title
        this.subtitle=subtitle
    }
    fun getThumbnail():String{
        return this.thumnail
    }
    fun getTitle():String{
        return this.title
    }
    fun subTitle():String{
        return this.subtitle
    }
}