package com.example.wishlist

import android.widget.Button
import android.widget.TextView

class ItemFetcher {
    companion object {
        var itemName = ""
        var price = ""
        var url = ""
        fun getDetails() : MutableList<Item> {

            var itemList : MutableList<Item> = ArrayList()
            val item = Item(theItemName, thePriceOfItem, theURLOfItem)
            itemList.add(item)
            return itemList
        }
    }
}