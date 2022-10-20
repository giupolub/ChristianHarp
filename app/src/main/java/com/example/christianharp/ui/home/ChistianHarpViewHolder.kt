package com.example.christianharp.ui.home

import androidx.recyclerview.widget.RecyclerView
import com.example.christianharp.databinding.RowHymnBinding

class ChristianHarpViewHolder(private var bind: RowHymnBinding) : RecyclerView.ViewHolder(bind.root) {

    fun bind (hymn: ChristianHarpModel) {

        bind.textRecycle.text = hymn.name
    }
}