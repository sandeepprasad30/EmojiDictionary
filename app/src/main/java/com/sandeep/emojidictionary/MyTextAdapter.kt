package com.sandeep.emojidictionary

import android.view.LayoutInflater
import android.view.View
import android.view.ViewGroup
import android.widget.Toast
import androidx.recyclerview.widget.RecyclerView
import kotlinx.android.synthetic.main.emoji_item.view.*

class MyTextAdapter: RecyclerView.Adapter<MyTextAdapter.TextHolder>() {
    override fun onCreateViewHolder(parent: ViewGroup, viewType: Int): TextHolder {
        return TextHolder(LayoutInflater.from(parent.context).inflate(R.layout.emoji_item, parent, false))
    }

    override fun getItemCount(): Int {
        return 10
    }

    override fun onBindViewHolder(holder: TextHolder, position: Int) {
        holder.bindText("Hi")
    }

    class TextHolder(v: View): RecyclerView.ViewHolder(v), View.OnClickListener {
        var view: View = v
        var text: String = ""

        init {
            v.setOnClickListener(this)
        }
        fun bindText(text: String){
            this.text = text
            view.emoji.text = text
        }
        override fun onClick(v: View?) {
            Toast.makeText(v?.context, "clicked", Toast.LENGTH_SHORT).show()
        }
    }

}