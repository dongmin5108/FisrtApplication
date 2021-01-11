package com.example.fisrtapplication

import androidx.appcompat.app.AppCompatActivity
import android.os.Bundle
import android.view.View
import android.widget.Button
import android.widget.LinearLayout
import android.widget.TextView

import kotlinx.android.synthetic.main.activity_main.*

class MainActivity : AppCompatActivity(){
    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)

        //xml 파일을 전개해서 메모리에 로드하고 화면에 출력하는 코드
        setContentView(R.layout.activity_main)

        //xml에 디자인한 2개의 버튼과 텍스트 뷰를 가져오기
//        val btn1 = findViewById(R.id.btn1) as Button
//        val btn2 = findViewById(R.id.btn2) as Button
//        var text = findViewById(R.id.text) as TextView

        //kotlin의 확장 기능을 이용해서 xml 파일에 설정한 id를
        //클래스로 프로퍼티로 추가했기 때문에 선언하지 않아도 됩니다.

        btn1.setOnClickListener(
            {
                text.visibility = View.VISIBLE
            })
        btn2.setOnClickListener(
            {
                text.visibility = View.INVISIBLE
            })

    }
}