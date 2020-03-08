package com.example.recyclerviewhomework3

import androidx.appcompat.app.AppCompatActivity
import android.os.Bundle
import androidx.recyclerview.widget.LinearLayoutManager
import com.example.recyclerviewhomework3.adapter.FoodAdapter
import com.example.recyclerviewhomework3.model.Food
import kotlinx.android.synthetic.main.activity_main.*

class MainActivity : AppCompatActivity() {

    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        setContentView(R.layout.activity_main)

        var foodArray=ArrayList<Food>()
        foodArray.add(Food("Fine Grain Sugar",R.drawable.sugar,"$20.00","1"))
        foodArray.add(Food("Peanuts",R.drawable.peanuts,"$20.00","3"))
        foodArray.add(Food("Dawat Rice",R.drawable.rice,"$80.00","2"))
        foodArray.add(Food("Fine Grain Sugar",R.drawable.sugar,"$20.00","1"))
        foodArray.add(Food("Peanuts",R.drawable.peanuts,"$20.00","3"))
        foodArray.add(Food("Dawat Rice",R.drawable.rice,"$80.00","2"))


        var foodAdapter=FoodAdapter(foodArray)
        recyclerView.layoutManager= LinearLayoutManager(this)
        recyclerView.adapter=foodAdapter
    }
}
