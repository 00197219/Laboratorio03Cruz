package com.gonzalez.labo03cruz

import androidx.appcompat.app.AppCompatActivity
import android.os.Bundle
import android.view.View
import android.widget.ImageView
import android.widget.TextView

class MainActivity : AppCompatActivity() {
    private lateinit var fiveCentsImageView: ImageView
    private lateinit var tenCentsImageView: ImageView
    private lateinit var quaterCentsImageView: ImageView
    private lateinit var oneDollarImageView: ImageView
    private lateinit var cashTextView: TextView
    private var cash = 0.0

    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        setContentView(R.layout.activity_main)

        fiveCentsImageView = findViewById(R.id.five_cents_image_view)
        tenCentsImageView = findViewById(R.id.ten_cents_image_view)
        quaterCentsImageView = findViewById(R.id.quater_cents_image_view)
        oneDollarImageView = findViewById(R.id.one_dollar_image_view)
        cashTextView = findViewById(R.id.cash_text_view)


        fiveCentsImageView.setOnClickListener {
            cash += 0.05
            cash = String.format("%.2f", cash).toDouble()
            cashTextView.text = "$${cash}"
        }

        tenCentsImageView.setOnClickListener {
            cash += 0.10
            cash = String.format("%.2f", cash).toDouble()
            cashTextView.text = "$${cash}"
        }

        quaterCentsImageView.setOnClickListener {
            cash += 0.25
            cash = String.format("%.2f", cash).toDouble()
            cashTextView.text = "$${cash}"
        }
        oneDollarImageView.setOnClickListener {
            cash += 1.00
            cash = String.format("%.2f", cash).toDouble()
            cashTextView.text = "$${cash}"
        }
    }
}