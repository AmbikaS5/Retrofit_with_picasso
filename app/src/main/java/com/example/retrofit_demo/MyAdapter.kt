package com.example.retrofit_demo

import android.content.Context
import android.view.LayoutInflater
import android.view.View
import android.view.ViewGroup
import android.widget.ImageView
import android.widget.TextView
import androidx.core.content.ContextCompat.startActivity
import androidx.recyclerview.widget.RecyclerView
import com.squareup.picasso.Picasso
import kotlinx.android.synthetic.main.row_items.view.*



class MyAdapter(val context: Context, val albumList: List<MyDataItem> ): RecyclerView.Adapter<MyAdapter.ViewHolder<Any?>>() {

    class ViewHolder<imageView>(itemView: View) : RecyclerView.ViewHolder(itemView) {
        var alubumId: TextView
        var title: TextView

        var thumbnailUrl: ImageView

        init {
            alubumId = itemView.albumId
            title = itemView.title
            thumbnailUrl = itemView.imageView
        }

    }



    override fun onCreateViewHolder(parent: ViewGroup, viewType: Int): MyAdapter.ViewHolder<Any?> {
        var itemView = LayoutInflater.from(context).inflate(R.layout.row_items, parent, false)
        return ViewHolder(itemView)
    }

    override fun onBindViewHolder(holder: MyAdapter.ViewHolder<Any?>, position: Int) {
        holder.alubumId.text = albumList[position].albumId.toString()
        holder.title.text= albumList[position].title

        Picasso.get().load(albumList[position].thumbnailUrl).into(holder.thumbnailUrl)


    }

    override fun getItemCount(): Int {
        return albumList.size
    }
}