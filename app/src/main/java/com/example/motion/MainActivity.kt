package com.example.motion

import androidx.appcompat.app.AppCompatActivity
import android.os.Bundle
import androidx.databinding.DataBindingUtil
import androidx.recyclerview.widget.LinearLayoutManager
import androidx.recyclerview.widget.RecyclerView
import com.example.motion.databinding.ActivityMainBinding

class MainActivity : AppCompatActivity() {

    lateinit var binding: ActivityMainBinding
    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        binding = DataBindingUtil.setContentView(this, R.layout.activity_main)

        val list= arrayListOf(1,2,3,4,5,6,7,8,9,1,2,3,4,5,6,7,89,1,2,3,4,5,6,7,8,9,9,9,9,9,9,9,9,9,9,9,9,9,9,9,9,9,99,9,9,9,9,9,9,9,9,9,9,9,9,9,9,9,9,9,9,9,9,9)
        val adapter=SimpleAdapter(list)
        val manager=LinearLayoutManager(this,LinearLayoutManager.VERTICAL,false)
        binding.recyclerview.layoutManager=manager
        binding.recyclerview.adapter=adapter

    }
}