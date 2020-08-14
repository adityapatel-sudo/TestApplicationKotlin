package com.example.testapplication

import android.view.LayoutInflater
import android.view.ViewGroup
import android.widget.LinearLayout
import android.widget.TextView
import androidx.cardview.widget.CardView
import androidx.constraintlayout.widget.ConstraintLayout
import androidx.recyclerview.widget.RecyclerView

class MyRecyclerViewAdapter(val array: Array<String>, val arraySmall: Array<Int>) :
    RecyclerView.Adapter<MyRecyclerViewAdapter.MyViewHolder>() {

    class MyViewHolder(val cardView: CardView) : RecyclerView.ViewHolder(cardView)

    override fun onCreateViewHolder(parent: ViewGroup, viewType: Int): MyViewHolder {
        // create a new view
        val cardView = LayoutInflater.from(parent.context)
            .inflate(R.layout.card_view_test,parent,false) as CardView
        return MyViewHolder(cardView)

    }

    override fun getItemCount(): Int {
         return array.size
    }

    override fun onBindViewHolder(holder: MyViewHolder, position: Int) {
        // - get element from your dataset at this position
        // - replace the contents of the view with that element
        holder.run {
            cardView.findViewById<TextView>(R.id.textViewTop).apply {
                text = array[position]
            }
            cardView.findViewById<TextView>(R.id.textViewBottom).apply {
                text = arraySmall[position].toString()
            }
        }
    }


}