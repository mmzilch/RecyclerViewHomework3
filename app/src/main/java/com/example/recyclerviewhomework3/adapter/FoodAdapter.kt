package com.example.recyclerviewhomework3.adapter

import android.view.LayoutInflater
import android.view.View
import android.view.ViewGroup
import androidx.recyclerview.widget.RecyclerView
import com.example.recyclerviewhomework3.R
import com.example.recyclerviewhomework3.model.Food
import kotlinx.android.synthetic.main.activity_main.view.*
import kotlinx.android.synthetic.main.item_food.view.*

class FoodAdapter(var foodList:ArrayList<Food>)  :
    RecyclerView.Adapter<FoodAdapter.FoodViewHolder>() {
    inner class FoodViewHolder(itemView: View):RecyclerView.ViewHolder(itemView){

        fun bindPerson(food: Food){
            itemView.tvName.text=food.foodName
            itemView.tvKilo.text=food.kilo
            itemView.tvPrice.text=food.price
            itemView.foodImage.setImageResource(food.foodImage)
        }

    }

    override fun onCreateViewHolder(parent: ViewGroup, viewType: Int): FoodViewHolder {
        var view= LayoutInflater.from(parent.context).inflate(R.layout.item_food,parent,false)
        return FoodViewHolder(view)
    }

    override fun getItemCount(): Int {
        return foodList.size
    }

    override fun onBindViewHolder(holder: FoodViewHolder, position: Int) {
        holder.bindPerson(foodList[position])
    }

}