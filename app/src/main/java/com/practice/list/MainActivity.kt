package com.practice.list

import androidx.appcompat.app.AppCompatActivity
import android.os.Bundle
import android.widget.Toast
import com.practice.list.adaters.Adapter
import com.practice.list.datas.Shoes
import kotlinx.android.synthetic.main.activity_main.*

class MainActivity : AppCompatActivity() {

    val roomList = ArrayList<Shoes>()
    var mRoomAdapter:Adapter?=null

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


        mRoomAdapter = Adapter(this, R.layout.room_list_item, roomList)
        roomListView.adapter = mRoomAdapter

        roomListView.setOnItemClickListener { parent, view, position, id -> }
//        몇번줄을 눌럿는지 테스트로 출력
        Toast.makeText(this, "${position}번 줄 클릭", Toast.LENGTH_SHORT)show()


    }

    roomListView.setOnI



}
