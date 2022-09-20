package com.example.wishlist

import androidx.appcompat.app.AppCompatActivity
import android.os.Bundle
import android.widget.Button
import android.widget.TextView
import androidx.recyclerview.widget.LinearLayoutManager
import androidx.recyclerview.widget.RecyclerView

lateinit var items: List<Item>
var theItemName : String = ""
var thePriceOfItem : String = ""
var theURLOfItem : String = ""
var counter  = 0

class MainActivity : AppCompatActivity() {
    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        setContentView(R.layout.activity_main)
        val item = findViewById<TextView>(R.id.item)
        val price = findViewById<TextView>(R.id.price)
        val url = findViewById<TextView>(R.id.URL)
        val addButton = findViewById<Button>(R.id.add)
        val wishListRV = findViewById<RecyclerView>(R.id.wishListRV)
        items = ItemFetcher.getDetails()
        val adapter = WishListItemAdapter(items)
        wishListRV.adapter = adapter
        wishListRV.layoutManager = LinearLayoutManager(this)

        addButton.setOnClickListener {
            if(item != null && price != null && url != null)
            {
                counter++
                var newItem = Item(item.text.toString(), price.text.toString(),url.text.toString())
                theItemName = item.text.toString()
                thePriceOfItem = price.text.toString()
                theURLOfItem = url.text.toString()
                ItemFetcher.itemName = item.text.toString()
                ItemFetcher.price = price.text.toString()
                ItemFetcher.url = url.text.toString()
                items = ItemFetcher.getDetails()
            }
        }
        }
    }