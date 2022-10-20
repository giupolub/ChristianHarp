package com.example.christianharp.ui.home

import android.view.LayoutInflater
import android.view.View
import android.view.ViewGroup
import androidx.recyclerview.widget.RecyclerView
import com.example.christianharp.R
import com.example.christianharp.databinding.RowHymnBinding

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
}