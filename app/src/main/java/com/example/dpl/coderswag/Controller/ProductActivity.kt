package com.example.dpl.coderswag.Controller

import android.support.v7.app.AppCompatActivity
import android.os.Bundle
import android.support.v7.widget.GridLayoutManager
import android.widget.Toast
import com.example.dpl.coderswag.Adapters.ProductAdapter
import com.example.dpl.coderswag.R
import com.example.dpl.coderswag.Services.DataService
import com.example.dpl.coderswag.Utilities.EXTRA_CATEGORY
import kotlinx.android.synthetic.main.activity_product.*

class ProductActivity : AppCompatActivity() {
    lateinit var adater:ProductAdapter
    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        setContentView(R.layout.activity_product)

        val categroyType=intent.getStringExtra(EXTRA_CATEGORY)//传递值
        Toast.makeText(this,"$categroyType",Toast.LENGTH_LONG).show()
        adater=ProductAdapter(this,DataService.getProduct(categroyType))

        var spanCount=2
        val screenSize=resources.configuration.screenWidthDp
        if(screenSize >720){   //适应大的屏幕
            spanCount=3
        }

        val layoutManager=GridLayoutManager(this,2) //每行两列的网格布局
        productsListView.layoutManager=layoutManager
        productsListView.adapter=adater
    }
}
