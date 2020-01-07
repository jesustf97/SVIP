package com.calleja.jesus.svip.activities

import android.content.Intent
import android.os.Bundle
import android.support.v7.app.AppCompatActivity
import com.calleja.jesus.svip.R
import kotlinx.android.synthetic.main.activity_question.*

class QuestionActivity : AppCompatActivity() {

    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        setContentView(R.layout.activity_question)
        image.setImageDrawable(getDrawable(R.mipmap.ic_sfo))
        button.setOnClickListener {
            startActivity(Intent(this, MainActivity::class.java))
        }
    }
}
