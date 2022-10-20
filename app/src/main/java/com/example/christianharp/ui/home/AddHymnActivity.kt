package com.example.christianharp.ui.home

import android.content.Intent
import androidx.appcompat.app.AppCompatActivity
import android.os.Bundle
import android.view.LayoutInflater
import android.view.View
import com.example.christianharp.MainActivity
import com.example.christianharp.R
import com.example.christianharp.databinding.ActivityAddHymnBinding

class AddHymnActivity : AppCompatActivity(), View.OnClickListener {

    private lateinit var binding: ActivityAddHymnBinding
    private lateinit var viewModel: AddHymnViewModel

    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)

        binding = ActivityAddHymnBinding.inflate(layoutInflater)
        setContentView(binding.root)

        binding.editAddName.setOnClickListener(this)
        binding.editAddHymn.setOnClickListener(this)
        binding.buttonAdd.setOnClickListener(this)

    }

    override fun onClick(v: View) {
        if (v.id == R.id.button_add) {
            val name = binding.editAddName.text.toString()
            val hymn = binding.editAddHymn.text.toString()

            val model = ChristianHarpModel().apply {
                this.id = 0
                this.name = name
                this.hymn = hymn
            }

            viewModel.save(model)
            startActivity(Intent(this, MainActivity::class.java))
        }
    }
}