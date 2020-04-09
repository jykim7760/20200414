package com.practice.list.adaters

import android.content.Context
import android.view.LayoutInflater
import android.widget.ArrayAdapter
import com.practice.list.R
import com.practice.list.datas.Shoes
import kotlin.coroutines.coroutineContext

class Adapter(context:Context, resId:Int, list:ArrayList<Shoes>) : ArrayAdapter<Shoes> (context, resId, list)


val mContext = Context
val mList = List
val inf = LayoutInflater.from(mContext)


getview =

    var temRow = converView
    if(temRow == null){
    temRow = inf.inflate(R.layout.room_list_item)
}

val row = tempRow!!
return row

}