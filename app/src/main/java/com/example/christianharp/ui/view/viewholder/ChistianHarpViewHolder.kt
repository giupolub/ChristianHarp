package com.example.christianharp.ui.view.viewholder

import androidx.recyclerview.widget.RecyclerView
import com.example.christianharp.databinding.RowHymnBinding
import com.example.christianharp.ui.model.ChristianHarpModel
import com.example.christianharp.ui.view.listener.OnCHListener

class ChristianHarpViewHolder(
    private var bind: RowHymnBinding,
    private var listener: OnCHListener
) :
    RecyclerView.ViewHolder(bind.root) {

    fun bind(hymn: ChristianHarpModel) {

        bind.textHymn.text = hymn.title

        bind.textHymn.setOnClickListener {
            listener.onClick(hymn.id)
        }

    }
}