package com.example.dpl.coderswag.Adapters

import android.content.Context
import android.view.LayoutInflater
import android.view.View
import android.view.ViewGroup
import android.widget.BaseAdapter
import android.widget.ImageView
import android.widget.TextView
import com.example.dpl.coderswag.Model.Category
import com.example.dpl.coderswag.R

/**
 * Created by dpl on 2018/6/23.
 */
class CategoryAdapter(val context: Context, val categories: List<Category>): BaseAdapter() {

    override fun getView(position: Int, convertView: View?, parent: ViewGroup?): View {
        val categoryView:View
        val holder:ViewHolder

        if(convertView==null) {
            //获取布局文件   显示布局变成默认包裹内容
            categoryView = LayoutInflater.from(context).inflate(R.layout.category_list_item, null)
            holder= ViewHolder()
            holder.categoryImage = categoryView.findViewById(R.id.categoryImage)//获取id
            holder.categoryName= categoryView.findViewById(R.id.categoryName)
            categoryView.tag=holder     //tag:存储一些view的数据
        }else{
            //当convertView不为空的时候直接重新使用convertView从而减少了很多不必要的View的创建，然后加载数据
            holder=convertView.tag as ViewHolder   //as:强制转换类型
            categoryView=convertView
        }
        val category=categories[position]   //获取类别的位置
        //获取资源文件中指定的图片    getIdentifier()方法可以方便的获各应用包下的指定资源ID
        val resourceId=context.resources.getIdentifier(category.image,"drawable",context.packageName)
        holder.categoryImage?.setImageResource(resourceId)

        holder.categoryName?.text=category.title    //获取标题
        return categoryView
    }

    override fun getItem(position: Int): Any {
        return categories[position]
    }

    override fun getItemId(position: Int): Long {
        return 0
    }

    override fun getCount(): Int {
        return categories.count()
    }
    private class ViewHolder{
        //不必每次加载都到布局文件中去拿View，提高了效率
        var categoryImage:ImageView?=null
        var categoryName:TextView?=null
    }
}