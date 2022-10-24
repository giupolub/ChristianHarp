package com.example.christianharp.ui.view.viewholder

import androidx.recyclerview.widget.RecyclerView
import com.example.christianharp.databinding.RowHymnBinding
import com.example.christianharp.ui.model.ChristianHarpModel

class ChristianHarpViewHolder(private var bind: RowHymnBinding) :
    RecyclerView.ViewHolder(bind.root) {

    fun bind(hymn: ChristianHarpModel) {

        bind.textHymn.text = hymn.name
    }
}