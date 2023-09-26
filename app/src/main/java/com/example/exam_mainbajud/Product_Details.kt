package com.example.exam_mainbajud

import Product
import androidx.appcompat.app.AppCompatActivity
import android.os.Bundle

import android.widget.TextView

class ProductDetailsActivity : AppCompatActivity() {

    private lateinit var productNameTextView: TextView
    private lateinit var productDescriptionTextView: TextView

    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        setContentView(R.layout.activity_product_details)

        productNameTextView = findViewById(R.id.productNameTextView)
        productDescriptionTextView = findViewById(R.id.productDescriptionTextView)

        val product = intent.getSerializableExtra("product") as? Product
        if (product != null) {
            productNameTextView.text = product.name
            productDescriptionTextView.text = product.description
        }
    }
}
