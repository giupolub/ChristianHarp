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
        val view = LayoutInflater.from(parent.context).inflate(R.layout.row_hymn, parent, false)

        return ChristianHarpViewHolder(view)
    }

    override fun onBindViewHolder(holder: ChristianHarpViewHolder, position: Int) {
        holder.bind(hymnList[position])
    }

    override fun getItemCount(): Int {
        return hymnList.count()
    }
}