package com.nilin.threekingdoms

import android.support.v7.widget.RecyclerView
import android.view.ViewGroup
import android.view.LayoutInflater
import android.view.View
import kotlinx.android.synthetic.main.item_recycler_view.view.*


/**
 * Created by liangd on 2017/7/27.
 */
class ArticleAdapter(val catalogList:ArrayList<String>) : RecyclerView.Adapter<RecyclerView.ViewHolder>() {

    var mOnItemClickListener:OnItemClickListener? = null

    override fun onCreateViewHolder(parent: ViewGroup?, viewType: Int): RecyclerView.ViewHolder {
        val holder = ViewHolder(LayoutInflater.from(parent!!.context)
                .inflate(R.layout.item_recycler_view, parent, false))
        return holder
    }

    override fun onBindViewHolder(holder: RecyclerView.ViewHolder?, position: Int) {
        var catalog = catalogList.get(position)
        val temp=position+1
        val number="第 $temp 回"
        holder!!.itemView.item_number.text = number
        holder!!.itemView.item_catalog.text = catalog

        if (mOnItemClickListener != null) {
            //为ItemView设置监听器
            holder.itemView.setOnClickListener {
                val position = holder.layoutPosition
                mOnItemClickListener!!.onItemClick(holder.itemView, position)
            }
        }
    }

    override fun getItemCount(): Int {
        return catalogList.size;
    }

    fun setOnItemClickListener(listener: OnItemClickListener) {
        mOnItemClickListener = listener
    }

    class ViewHolder(view: View) : RecyclerView.ViewHolder(view) {

    }

    interface OnItemClickListener {
        fun onItemClick(view: View, position: Int)
    }
}


