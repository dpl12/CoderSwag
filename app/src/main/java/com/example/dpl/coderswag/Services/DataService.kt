package com.example.dpl.coderswag.Services

import com.example.dpl.coderswag.Model.Category
import com.example.dpl.coderswag.Model.Product

/**
 * Created by dpl on 2018/6/21.
 */
object DataService {
    val categories= listOf(
            Category("衬衫","shirtimage"),
            Category("卫衣","hoodieimage"),
            Category("帽子","hatimage"),
            Category("数码产品","digitalgoodsimage"),
            Category("衬衫","shirtimage"),
            Category("卫衣","hoodieimage"),
            Category("帽子","hatimage"),
            Category("数码产品","digitalgoodsimage"),
            Category("衬衫","shirtimage"),
            Category("卫衣","hoodieimage"),
            Category("帽子","hatimage"),
            Category("数码产品","digitalgoodsimage")
    )

    val hats= listOf(
            Product("Devslopes Graphic Beanie","$18","hat1"),
            Product("Devslopes Hat Black","$20","hat2"),
            Product("Devslopes Hat White","$18","hat3"),
            Product("Devslopes Hat Snapback","$22","hat4"),
            Product("Devslopes Graphic Beanie","$18","hat1"),
            Product("Devslopes Hat Black","$20","hat2"),
            Product("Devslopes Hat White","$18","hat3"),
            Product("Devslopes Hat Snapback","$22","hat4"),
            Product("Devslopes Graphic Beanie","$18","hat1"),
            Product("Devslopes Hat Black","$20","hat2"),
            Product("Devslopes Hat White","$18","hat3"),
            Product("Devslopes Hat Snapback","$22","hat4"),
            Product("Devslopes Graphic Beanie","$18","hat1"),
            Product("Devslopes Hat Black","$20","hat2"),
            Product("Devslopes Hat White","$18","hat3"),
            Product("Devslopes Hat Snapback","$22","hat4")
    )

    val hoodies= listOf(
            Product("Devslopes Hoodie Gray","$28","hoodie1"),
            Product("Devslopes Hoodie Red","$32","hoodie2"),
            Product("Devslopes Gray Hoodie","$28","hoodie3"),
            Product("Devslopes Black Hoodie","$32","hoodie4"),
            Product("Devslopes Hoodie Gray","$28","hoodie1"),
            Product("Devslopes Hoodie Red","$32","hoodie2"),
            Product("Devslopes Gray Hoodie","$28","hoodie3"),
            Product("Devslopes Black Hoodie","$32","hoodie4"),
            Product("Devslopes Hoodie Gray","$28","hoodie1"),
            Product("Devslopes Hoodie Red","$32","hoodie2"),
            Product("Devslopes Gray Hoodie","$28","hoodie3"),
            Product("Devslopes Black Hoodie","$32","hoodie4"),
            Product("Devslopes Hoodie Gray","$28","hoodie1"),
            Product("Devslopes Hoodie Red","$32","hoodie2"),
            Product("Devslopes Gray Hoodie","$28","hoodie3"),
            Product("Devslopes Black Hoodie","$32","hoodie4"),
            Product("Devslopes Hoodie Gray","$28","hoodie1"),
            Product("Devslopes Hoodie Red","$32","hoodie2"),
            Product("Devslopes Gray Hoodie","$28","hoodie3"),
            Product("Devslopes Black Hoodie","$32","hoodie4"),
            Product("Devslopes Hoodie Gray","$28","hoodie1"),
            Product("Devslopes Hoodie Red","$32","hoodie2"),
            Product("Devslopes Gray Hoodie","$28","hoodie3"),
            Product("Devslopes Black Hoodie","$32","hoodie4")
    )

    val shirts= listOf(
            Product("Devslopes Shirt Black","$18","shirt1"),
            Product("Devslopes Badge Light Gray","$20","shirt2"),
            Product("Devslopes Logo Shirt Red","$22","shirt3"),
            Product("Devslopes Hustle","$22","shirt4"),
            Product("Kickflip","$18","shirt5"),
            Product("Devslopes Shirt Black","$18","shirt1"),
            Product("Devslopes Badge Light Gray","$20","shirt2"),
            Product("Devslopes Logo Shirt Red","$22","shirt3"),
            Product("Devslopes Hustle","$22","shirt4"),
            Product("Kickflip","$18","shirt5"),
            Product("Devslopes Shirt Black","$18","shirt1"),
            Product("Devslopes Badge Light Gray","$20","shirt2"),
            Product("Devslopes Logo Shirt Red","$22","shirt3"),
            Product("Devslopes Hustle","$22","shirt4"),
            Product("Kickflip","$18","shirt5"),
            Product("Devslopes Shirt Black","$18","shirt1"),
            Product("Devslopes Badge Light Gray","$20","shirt2"),
            Product("Devslopes Logo Shirt Red","$22","shirt3"),
            Product("Devslopes Hustle","$22","shirt4"),
            Product("Kickflip","$18","shirt5")
    )

    val digitalGood= listOf<Product>()   //空的数码产品
    fun getProduct(category:String):List<Product>{       //根据类型获取商品
        return when(category){
            "衬衫"-> shirts
            "帽子"-> hats
            "卫衣"-> hoodies
            else -> digitalGood
        }
    }
}