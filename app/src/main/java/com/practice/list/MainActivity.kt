package com.practice.list

import androidx.appcompat.app.AppCompatActivity
import android.os.Bundle
import com.practice.list.datas.Shoes

class MainActivity : AppCompatActivity() {

    val roomList = ArrayList<Shoes>()

    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        setContentView(R.layout.activity_main)

        roomList.add(Shoes(8000, "서울시 은평구", 3, "연립주택입니다."))
        roomList.add(Shoes(7000, "서울시 서대문구", 3, "아파트입니다."))
        roomList.add(Shoes(5000, "경기도 수원시", -1, "단독주택입니다."))
        roomList.add(Shoes(8000, "서울시 광진구", 0, "난리납입니다."))
        roomList.add(Shoes(8000, "서울시 은평구", 3, "죽여주입니다."))
        roomList.add(Shoes(8000, "서울시 은평구", -1, "사라있네입니다."))
        roomList.add(Shoes(8000, "서울시 은평구", 12, "연립주택입니다."))


    }
}
