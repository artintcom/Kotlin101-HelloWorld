package com.example.kotlin101_helloworld

import androidx.appcompat.app.AppCompatActivity
import android.os.Bundle
import android.widget.TextView

class MainActivity : AppCompatActivity() {
    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        setContentView(R.layout.activity_main)

        val messageTextView: TextView = findViewById(R.id.message_tv)

        // Değiştirilemeyen (immutable) değişken tanımı
        val name = "Toucan"

        // Değiştirilebilir (mutable) değişken tanımı
        var age = 1
        age = 5

        messageTextView.text = "Merhaba benim adım $name . Ben $age yaşındayım"

    }
}