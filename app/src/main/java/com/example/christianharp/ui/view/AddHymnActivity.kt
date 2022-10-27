package com.example.christianharp.ui.view

import androidx.appcompat.app.AppCompatActivity
import android.os.Bundle
import android.view.View
import androidx.lifecycle.ViewModelProvider
import com.example.christianharp.R
import com.example.christianharp.databinding.ActivityAddHymnBinding
import com.example.christianharp.ui.viewmodel.AddHymnViewModel
import com.example.christianharp.ui.model.ChristianHarpModel

class AddHymnActivity : AppCompatActivity(), View.OnClickListener {

    private lateinit var binding: ActivityAddHymnBinding
    private lateinit var viewModel: AddHymnViewModel

    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)

        binding = ActivityAddHymnBinding.inflate(layoutInflater)
        setContentView(binding.root)

        viewModel = ViewModelProvider(this).get(AddHymnViewModel::class.java)

        binding.editTitle.setOnClickListener(this)
        binding.editStanza1.setOnClickListener(this)
        binding.editRefrain.setOnClickListener(this)
        binding.editStanza2.setOnClickListener(this)
        binding.editStanza3.setOnClickListener(this)
        binding.editStanza4.setOnClickListener(this)
        binding.editStanza5.setOnClickListener(this)
        binding.editStanza6.setOnClickListener(this)
        binding.buttonAdd.setOnClickListener(this)

    }

    override fun onClick(v: View) {
        if (v.id == R.id.button_add) {
//            val name = binding.editAddName.text.toString()
//            val hymn = binding.editAddHymn.text.toString()
//
//            val model = ChristianHarpModel().apply {
//                this.id = 0
//                this.name = name
//                this.hymn = hymn
//            }
//            viewModel.save(model)
//            finish()
        }
    }
}