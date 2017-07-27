package com.nilin.threekingdoms


import android.support.v7.widget.RecyclerView
import android.view.ViewGroup
import android.view.LayoutInflater
import android.view.View
import android.widget.TextView


/**
 * Created by liangd on 2017/7/27.
 */
class ArticleAdapter : RecyclerView.Adapter<RecyclerView.ViewHolder>() {


    fun  MyViewHolder(inflate: View?): RecyclerView.ViewHolder {
        var item_tv:TextView
    }


    override fun onCreateViewHolder(parent: ViewGroup?, viewType: Int): RecyclerView.ViewHolder {
        val holder = MyViewHolder(LayoutInflater.from(parent!!.context)
                .inflate(R.layout.item_recycler_view, parent, false))
        return holder
        TODO("not implemented") //To change body of created functions use File | Settings | File Templates.
    }




    override fun onBindViewHolder(holder: RecyclerView.ViewHolder?, position: Int) {
        holder.item_tv.setText(mDatas.get(position));
        TODO("not implemented") //To change body of created functions use File | Settings | File Templates.
    }


    override fun getItemCount(): Int {
        return mDatas.size();
        TODO("not implemented") //To change body of created functions use File | Settings | File Templates.
    }


}