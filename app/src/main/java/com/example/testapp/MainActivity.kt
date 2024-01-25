package com.example.testapp

import android.content.Intent
import android.net.Uri
import androidx.appcompat.app.AppCompatActivity
import android.os.Bundle
import android.view.View
import android.widget.Button

class MainActivity : AppCompatActivity() {
    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        setContentView(R.layout.activity_main)

        var button1: Button = findViewById(R.id.button1)
        var button2: Button = findViewById(R.id.button2)

        // 버튼 클릭 이벤트 리스너 설정
        button1.setOnClickListener(View.OnClickListener {
            // 하이퍼링크로 이동하는 Intent 생성
            val intent = Intent(Intent.ACTION_VIEW, Uri.parse("https://www.youtube.com/watch?v=xNioPlh2cOE"))
            // Intent 실행
            startActivity(intent)
        })

        button2.setOnClickListener(View.OnClickListener {
            // 하이퍼링크로 이동하는 Intent 생성
            val intent = Intent(Intent.ACTION_VIEW, Uri.parse("https://www.youtube.com/watch?v=oyxs8cjg1cQ"))
            // Intent 실행
            startActivity(intent)
        })
    }
}