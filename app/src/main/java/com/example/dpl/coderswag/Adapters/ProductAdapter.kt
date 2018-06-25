package com.example.dpl.coderswag.Adapters

import android.content.Context
import android.support.v7.widget.RecyclerView
import android.view.LayoutInflater
import android.view.View
import android.view.ViewGroup
import android.widget.ImageView
import android.widget.TextView
import com.example.dpl.coderswag.Model.Product
import com.example.dpl.coderswag.R

/**
 * Created by dpl on 2018/6/25.
 */
class ProductAdapter(val context: Context,val products:List<Product>):RecyclerView.Adapter<ProductAdapter.ProductHolder>() {
    override fun onCreateViewHolder(parent: ViewGroup?, viewType: Int): ProductHolder {
        val view=LayoutInflater.from(context).inflate(R.layout.product_list_item,parent,false)
        return ProductHolder(view)
    }

    override fun getItemCount(): Int {
        return products.count()
    }

    override fun onBindViewHolder(holder: ProductHolder?, position: Int) {
        holder?.bindProduct(products[position],context)
    }


    inner class ProductHolder(itemView:View?):RecyclerView.ViewHolder(itemView){

        val productImage=itemView?.findViewById<ImageView>(R.id.productImage)
        val productName=itemView?.findViewById<TextView>(R.id.categoryName)
        val productPrice=itemView?.findViewById<TextView>(R.id.productPrice)

        fun bindProduct(products: Product,context: Context){
            val resourcesProductId=context.resources.getIdentifier(products.image,"drawable",context.packageName)
            productImage?.setImageResource(resourcesProductId)
            productName?.text=products.title
            productPrice?.text=products.price
        }
    }
}