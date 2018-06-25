package com.example.dpl.coderswag.Adapters

import android.content.Context
import android.support.v7.widget.RecyclerView
import android.view.LayoutInflater
import android.view.View
import android.view.ViewGroup
import android.widget.ImageView
import android.widget.TextView
import com.example.dpl.coderswag.Model.Category
import com.example.dpl.coderswag.R
/**
 * Created by dpl on 2018/6/24.
 */
class CategoryRecycleAdapter(val context:Context,val categories:List<Category>,val itemClick:(Category) ->Unit) :RecyclerView.Adapter<CategoryRecycleAdapter.Holder>() {

    //onCreateViewHolder():是用来配合写好的ViewHolder来返回一个ViewHolder对象。这里也涉及到了条目布局的加载。
    //viewType则表示需要给当前position生成的是哪一种ViewHolder，这个参数也说明了RecyclerView对多类型ItemView的支持。
    override fun onCreateViewHolder(parent: ViewGroup?, viewType: Int): Holder {
        val view=LayoutInflater.from(context).inflate(R.layout.category_list_item,parent,false)
        return Holder(view,itemClick)
    }

    override fun getItemCount(): Int {
        return categories.count()
    }

    //专门用来绑定ViewHolder里的控件和数据源中position位置的数据。
    override fun onBindViewHolder(holder: Holder?, position: Int) {
        holder?.bindCategory(categories[position],context)
    }

     //定义内部类Holder
    inner class Holder(itemView:View?,val itemClick:(Category) ->Unit): RecyclerView.ViewHolder(itemView){

        val categoryImage=itemView?.findViewById<ImageView>(R.id.categoryImage)
        val categoryName=itemView?.findViewById<TextView>(R.id.categoryName)

        fun bindCategory(category: Category,context: Context){
            val resourceId=context.resources.getIdentifier(category.image,"drawable",context.packageName)
            categoryImage?.setImageResource(resourceId)
            categoryName?.text=category.title
            itemView.setOnClickListener { itemClick(category) }
        }
    }
}