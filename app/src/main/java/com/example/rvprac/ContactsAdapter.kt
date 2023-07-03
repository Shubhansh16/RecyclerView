package com.example.rvprac

import android.annotation.SuppressLint
import android.content.Context
import android.view.LayoutInflater
import android.view.View
import android.view.ViewGroup
import android.widget.TextView
import androidx.recyclerview.widget.RecyclerView

class ContactsAdapter(val context: Context, val contacts: List<Person>): RecyclerView.Adapter<ContactsAdapter.ViewHolder>() {

    inner class ViewHolder(itemView: View) : RecyclerView.ViewHolder(itemView){
        fun bind(contact: Person) {
         tvName.text=contact.name
            tvAge.text= "Age: ${contact.age}"
        }
        val tvName= itemView.findViewById<TextView>(R.id.tvPerson)
        val tvAge= itemView.findViewById<TextView>(R.id.tvAge)

    }

    //Create a new view
    override fun onCreateViewHolder(parent: ViewGroup, viewType: Int): ViewHolder {
    val view =  LayoutInflater.from(context).inflate(R.layout.item_layout,parent,false)
    return ViewHolder(view)
    }

    //return how many items are there in the dataset
    override fun getItemCount(): Int {
        return contacts.size
    }

    //bind the data at position into the viewholder
    @SuppressLint("SuspiciousIndentation")
    override fun onBindViewHolder(holder: ViewHolder, position: Int) {
      val contact= contacts[position]
        holder.bind(contact)
    }
}