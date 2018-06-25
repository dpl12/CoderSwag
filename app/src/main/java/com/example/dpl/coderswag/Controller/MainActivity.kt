package com.example.dpl.coderswag.Controller

import android.content.Intent
import android.support.v7.app.AppCompatActivity
import android.os.Bundle
import android.support.v7.widget.LinearLayoutManager
import com.example.dpl.coderswag.Adapters.CategoryRecycleAdapter
import com.example.dpl.coderswag.R
import com.example.dpl.coderswag.Services.DataService
import com.example.dpl.coderswag.Utilities.EXTRA_CATEGORY
import kotlinx.android.synthetic.main.activity_main.*

class MainActivity : AppCompatActivity() {

    //lateinit var adapter:CategoryAdapter
    lateinit var adapter:CategoryRecycleAdapter
    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        setContentView(R.layout.activity_main)

        //adapter= CategoryAdapter(this,DataService.categories)
        //categoryListView.adapter=adapter

        //列表每一条的点击事件
        adapter= CategoryRecycleAdapter(this,DataService.categories){
            category ->
            val productIntent=Intent(this,ProductActivity::class.java)
            productIntent.putExtra(EXTRA_CATEGORY,category.title)
            startActivity(productIntent)
        }
        categoryListView.adapter=adapter

        val layoutManager=LinearLayoutManager(this)
        categoryListView.layoutManager=layoutManager
        categoryListView.setHasFixedSize(true)
    }
}
