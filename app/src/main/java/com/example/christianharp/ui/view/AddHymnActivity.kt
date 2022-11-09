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

        binding.buttonAdd.setOnClickListener(this)

    }

    override fun onClick(v: View) {
        if (v.id == R.id.button_add) {
            val title = binding.editTitle.text.toString()
            val stanza1 = binding.editStanza1.text.toString()
            val refrain = binding.editRefrain.text.toString()
            val stanza2 = binding.editStanza2.text.toString()
            val stanza3 = binding.editStanza3.text.toString()
            val stanza4 = binding.editStanza4.text.toString()
            val stanza5 = binding.editStanza5.text.toString()
            val stanza6 = binding.editStanza6.text.toString()

            val model = ChristianHarpModel().apply {
                this.id = 0
                this.title = title
                this.stanza1 = stanza1
                this.refrain = refrain
                this.stanza2 = stanza2
                this.stanza3 = stanza3
                this.stanza4 = stanza4
                this.stanza5 = stanza5
                this.stanza6 = stanza6
            }
            viewModel.save(model)
            finish()
        }
    }
}