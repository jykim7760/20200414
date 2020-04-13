package com.practice.list.adaters

import android.content.Context
import android.view.LayoutInflater
import android.widget.ArrayAdapter
import com.practice.list.R
import com.practice.list.datas.Shoes
import kotlin.coroutines.coroutineContext

class Adapter(context:Context, resId:Int, list:ArrayList<Shoes>) : ArrayAdapter<Shoes> (context, resId, list)

val mContext = context
val mList = list
val inf = LayoutInflater.from(mContext)


    var tempRow = convertView
    if (tempRow == null){
    tempRow = inf.inflate(R.layout.room_list_item, null)
}

val row = tempRow!!

//row 데이터 가공 _각 줄에 맞게

//  XML에 잇는 뷰들을 변수로 담기 findViewById
val pricetxt = row.findViewById<TextView>(R.id.priceTxt)
val pricetxt = row.findViewById<TextView>(R.id.floorTxt)
val pricetxt = row.findViewById<TextView>(R.id.subTxt)

// 근거 데이터 변수 추출 -> 각위치에 맞는 데이터를 mList 에서 가져오기
val data = mList.get(position)

// 가격이 1만이상이면 ?억, 그이하면 그냥 "?"
if (data.price >= 10000){
    pricetxt.text = "${data.price / 10000}억 $(String.format("%,d",data.price % 10000))"
}
else {
    pricetxt.text = "String.format("%,d",data.price)

}
//    주소와 층수 " 주소, 층수(상황마다다른값)
var floorStr = ""

if (data.floor == 0){
    floorStr = "반지하"
}
else if (data.floor >0){
    floorStr = "${data.floor}층"
}
else{
    floorStr = "지하${-data.floor}층"

    AddressAndFloorTxt.text = "${data.address}, {data.floor}"

//    설명은 있는 그대로
    subtxt.text = data.subtxt


    return row
}}


