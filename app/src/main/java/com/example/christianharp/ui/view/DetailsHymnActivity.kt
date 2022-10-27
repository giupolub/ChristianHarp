package com.example.christianharp.ui.view

import androidx.appcompat.app.AppCompatActivity
import android.os.Bundle
import android.view.View
import androidx.lifecycle.ViewModelProvider
import com.example.christianharp.R
import com.example.christianharp.databinding.ActivityAddHymnBinding
import com.example.christianharp.databinding.ActivityDetailsHymnBinding
import com.example.christianharp.ui.viewmodel.DetailsHymnViewModel

class DetailsHymnActivity : AppCompatActivity(), View.OnClickListener {

    private lateinit var binding: ActivityDetailsHymnBinding
    private lateinit var viewModel: DetailsHymnViewModel
    private var hymnId = 0

    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)

        binding = ActivityDetailsHymnBinding.inflate(layoutInflater)
        setContentView(binding.root)

        viewModel = ViewModelProvider(this).get(DetailsHymnViewModel::class.java)

        binding.textTitle.text
        binding.buttonDelete.setOnClickListener(this)

        observe()

        loadData()
    }

    override fun onClick(v: View) {
        if (v.id == R.id.button_delete) {
            viewModel.delete(hymnId)
            finish()
        }
    }

    private fun observe() {
        viewModel.hymn.observe(this) {
            binding.textTitle.setText(it.name)
            binding.textLyrics.setText(it.hymn)
        }

    }

    private fun loadData() {
        val bundle = intent.extras
        if (bundle != null) {
            hymnId = bundle.getInt("hymnID")
            viewModel.get(hymnId)
        }
    }




}