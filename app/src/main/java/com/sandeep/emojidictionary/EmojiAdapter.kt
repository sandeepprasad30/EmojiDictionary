package com.sandeep.emojidictionary

import android.content.Intent
import android.view.LayoutInflater
import android.view.View
import android.view.ViewGroup
import androidx.core.content.ContextCompat.startActivity
import androidx.recyclerview.widget.RecyclerView
import kotlinx.android.synthetic.main.emoji_item.view.*

class EmojiAdapter(val emojis: ArrayList<String>): RecyclerView.Adapter<EmojiAdapter.TextHolder>() {

    override fun onCreateViewHolder(parent: ViewGroup, viewType: Int): TextHolder {
        return TextHolder(LayoutInflater.from(parent.context).inflate(R.layout.emoji_item, parent, false))
    }

    override fun getItemCount(): Int {
        return emojis.count()
    }

    override fun onBindViewHolder(holder: EmojiAdapter.TextHolder, position: Int) {
        val emoji = emojis[position]
        holder.bindEmoji(emoji)
    }

    class TextHolder(v: View): RecyclerView.ViewHolder(v), View.OnClickListener {
        var view: View = v
        var emoji: String = ""

        init {
            v.setOnClickListener(this)
        }

        fun bindEmoji(emoji: String) {
            this.emoji = emoji
            view.emoji.text = emoji
        }

        override fun onClick(v: View?) {
            val detailIntent = Intent(view.context, EmojiDetailActivity::class.java)
            detailIntent.putExtra("emoji", emoji)
            startActivity(view.context, detailIntent, null)
        }
    }

}