package com.example.wishlist

import android.view.LayoutInflater
import android.view.View
import android.view.ViewGroup
import android.widget.TextView
import androidx.recyclerview.widget.RecyclerView

class WishListItemAdapter(private val items: List<Item>) : RecyclerView.Adapter<WishListItemAdapter.ViewHolder>(){
    // Provide a direct reference to each of the views within a data item
// Used to cache the views within the item layout for fast access
    class ViewHolder(itemView: View) : RecyclerView.ViewHolder(itemView) {

        // Your holder should contain a member variable for any view that will be set as you render
        // a row
        val itemName: TextView
        val itemURL: TextView
        val itemPrice: TextView

        // We also create a constructor that accepts the entire item row
        // and does the view lookups to find each sub-view
        init {
            // Stores the itemView in a public final member variable that can be used
            // to access the context from any ViewHolder instance.
            itemName = itemView.findViewById(R.id.itemName)
            itemURL = itemView.findViewById(R.id.itemURL)
            itemPrice = itemView.findViewById(R.id.itemPrice)
        }
    }

    override fun onCreateViewHolder(parent: ViewGroup, viewType: Int): ViewHolder {
        val context = parent.context
        val inflater = LayoutInflater.from(context)
        // Inflate the custom layout
        val contactView = inflater.inflate(R.layout.wishlist_item, parent, false)
        // Return a new holder instance
        return ViewHolder(contactView)
    }

    override fun onBindViewHolder(holder: ViewHolder, position: Int) {
        // Get the data model based on position
        //val item = emails.get(position)
        // Set item views based on views and data model
        holder.itemName.text = theItemName
        holder.itemURL.text = theURLOfItem
        holder.itemPrice.text = thePriceOfItem
    }

    override fun getItemCount(): Int {
        return counter
    }
}