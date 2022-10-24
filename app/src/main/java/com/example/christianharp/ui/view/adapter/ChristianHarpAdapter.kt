package com.example.christianharp.ui.view.adapter

import android.view.LayoutInflater
import android.view.ViewGroup
import androidx.recyclerview.widget.RecyclerView
import com.example.christianharp.databinding.RowHymnBinding
import com.example.christianharp.ui.model.ChristianHarpModel
import com.example.christianharp.ui.view.viewholder.ChristianHarpViewHolder

class ChristianHarpAdapter(): RecyclerView.Adapter<ChristianHarpViewHolder>() {

    private var hymnList: List<ChristianHarpModel> = listOf()

    override fun onCreateViewHolder(parent: ViewGroup, viewType: Int): ChristianHarpViewHolder {
        val item = RowHymnBinding.inflate(LayoutInflater.from(parent.context),parent, false)

        return ChristianHarpViewHolder(item)
    }

    override fun onBindViewHolder(holder: ChristianHarpViewHolder, position: Int) {
        holder.bind(hymnList[position])
    }

    override fun getItemCount(): Int {
        return hymnList.count()
    }

    fun updatedHymns(list: List<ChristianHarpModel>) {
        hymnList = list
        notifyDataSetChanged()
    }
}