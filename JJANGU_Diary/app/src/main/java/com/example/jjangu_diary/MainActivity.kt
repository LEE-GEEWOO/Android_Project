package com.example.jjangu_diary

import android.content.Intent
import android.os.Bundle
import android.widget.Toast
import androidx.appcompat.app.AppCompatActivity
import com.example.jjangu_diary.databinding.ActivityMainBinding

class MainActivity : AppCompatActivity() {

    private lateinit var binding: ActivityMainBinding

    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        binding = ActivityMainBinding.inflate(layoutInflater)
        setContentView(binding.root)

//        // 일기 쓰기 카드
//        binding.writeCard.setOnClickListener {
//            Toast.makeText(this, "일기 쓰기 이동", Toast.LENGTH_SHORT).show()
//            val intent = Intent(this, WriteActivity::class.java)
//            startActivity(intent)
//        }
//
//        // 날씨 카드
//        binding.weatherCard.setOnClickListener {
//            Toast.makeText(this, "날씨 페이지 이동", Toast.LENGTH_SHORT).show()
//            val intent = Intent(this, WeatherActivity::class.java)
//            startActivity(intent)
//        }
//
//        // 일기 목록 카드
//        binding.listCard.setOnClickListener {
//            Toast.makeText(this, "일기 목록 이동", Toast.LENGTH_SHORT).show()
//            val intent = Intent(this, ListActivity::class.java)
//            startActivity(intent)
//        }
    }
}