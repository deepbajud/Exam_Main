package com.example.exam_mainbajud

import Product
import androidx.appcompat.app.AppCompatActivity
import android.os.Bundle

import android.content.Intent
import android.widget.AdapterView
import android.widget.ArrayAdapter
import android.widget.ListView

class MainActivity : AppCompatActivity() {

    private lateinit var productListView: ListView
    private val products = listOf(
        Product(1, "Product 1", "Description for Product 1"),
        Product(2, "Product 2", "Description for Product 2"),
        Product(3, "Product 3", "Description for Product 3")
    )

    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        setContentView(R.layout.activity_main)

        productListView = findViewById(R.id.productListView)
        val adapter = ArrayAdapter(this, android.R.layout.simple_list_item_1, products.map { it.name })
        productListView.adapter = adapter

        productListView.setOnItemClickListener { _, _, position, _ ->
            val selectedProduct = products[position]
            val intent = Intent(this, ProductDetailsActivity::class.java)
            intent.putExtra("product", selectedProduct)
            startActivity(intent)
        }
    }
}

private fun Intent.putExtra(s: String, selectedProduct: Product) {
    TODO("Not yet implemented")
}
