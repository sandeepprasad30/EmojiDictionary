package com.sandeep.emojidictionary

import androidx.appcompat.app.AppCompatActivity
import android.os.Bundle
import kotlinx.android.synthetic.main.activity_emoji_detail.*

class EmojiDetailActivity : AppCompatActivity() {

    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        setContentView(R.layout.activity_emoji_detail)
    }

    override fun onStart() {
        super.onStart()

        val emoji = intent.extras?.getString("emoji")
        emojiDetail.text = emoji
    }
}
