package com.example.christianharp.ui.view

import android.content.Intent
import androidx.appcompat.app.AppCompatActivity
import android.os.Bundle
import android.text.Spannable
import android.text.SpannableString
import android.text.SpannableStringBuilder
import android.text.Spanned
import android.text.style.RelativeSizeSpan
import android.util.TypedValue
import android.view.View
import androidx.core.text.scale
import androidx.lifecycle.ViewModelProvider
import com.example.christianharp.R
import com.example.christianharp.databinding.ActivityAddHymnBinding
import com.example.christianharp.databinding.ActivityDetailsHymnBinding
import com.example.christianharp.ui.viewmodel.DetailsHymnViewModel

class DetailsHymnActivity : AppCompatActivity(), View.OnClickListener {

    private lateinit var binding: ActivityDetailsHymnBinding
    private lateinit var viewModel: DetailsHymnViewModel
    private var hymnId = 0
    private var fontSize = 18f

    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)

        binding = ActivityDetailsHymnBinding.inflate(layoutInflater)
        setContentView(binding.root)

        viewModel = ViewModelProvider(this).get(DetailsHymnViewModel::class.java)

        binding.imagePrevious.setOnClickListener(this)
        binding.imageZoomIn.setOnClickListener(this)
        binding.imageZoomOut.setOnClickListener(this)
        binding.imagePlay.setOnClickListener(this)
        binding.imageEdit.setOnClickListener(this)
        binding.imageDelete.setOnClickListener(this)
        binding.imageNext.setOnClickListener(this)

        observe()

        loadData()
    }

    override fun onClick(v: View) {
        when (v.id) {
            R.id.image_delete -> {
                viewModel.delete(hymnId)
                finish()
            }
            R.id.image_zoom_in -> {
                zoomIn()
            }
            R.id.image_zoom_out -> {
                zoomOut()
            }
            R.id.image_previous -> {
                previousHymn()
            }
            R.id.image_next -> {
                nextHymn()
            }
        }
    }

    private fun observe() {
        viewModel.hymn.observe(this) {
            binding.textTitle.text = it.title
            binding.textStanza1.text = it.stanza1
            binding.textRefrain.text = it.refrain
            binding.textStanza2.text = it.stanza2
            binding.textStanza3.text = it.stanza3
            binding.textStanza4.text = it.stanza4
            binding.textStanza5.text = it.stanza5
            binding.textStanza6.text = it.stanza6
        }
    }

    private fun loadData() {
        val bundle = intent.extras
        if (bundle != null) {
            hymnId = bundle.getInt("hymnID")
            viewModel.get(hymnId)
        }
    }

    private fun zoomIn() {
        if (fontSize < 40f) {
            fontSize += 2f
            binding.textTitle.setTextSize(TypedValue.COMPLEX_UNIT_SP, fontSize)
            binding.textStanza1.setTextSize(TypedValue.COMPLEX_UNIT_SP, fontSize)
            binding.textRefrain.setTextSize(TypedValue.COMPLEX_UNIT_SP, fontSize)
            binding.textStanza2.setTextSize(TypedValue.COMPLEX_UNIT_SP, fontSize)
            binding.textStanza3.setTextSize(TypedValue.COMPLEX_UNIT_SP, fontSize)
            binding.textStanza4.setTextSize(TypedValue.COMPLEX_UNIT_SP, fontSize)
            binding.textStanza5.setTextSize(TypedValue.COMPLEX_UNIT_SP, fontSize)
            binding.textStanza6.setTextSize(TypedValue.COMPLEX_UNIT_SP, fontSize)
        }
    }

    private fun zoomOut() {
        if (fontSize > 13f) {
            fontSize -= 2f
            binding.textTitle.setTextSize(TypedValue.COMPLEX_UNIT_SP, fontSize)
            binding.textStanza1.setTextSize(TypedValue.COMPLEX_UNIT_SP, fontSize)
            binding.textRefrain.setTextSize(TypedValue.COMPLEX_UNIT_SP, fontSize)
            binding.textStanza2.setTextSize(TypedValue.COMPLEX_UNIT_SP, fontSize)
            binding.textStanza3.setTextSize(TypedValue.COMPLEX_UNIT_SP, fontSize)
            binding.textStanza4.setTextSize(TypedValue.COMPLEX_UNIT_SP, fontSize)
            binding.textStanza5.setTextSize(TypedValue.COMPLEX_UNIT_SP, fontSize)
            binding.textStanza6.setTextSize(TypedValue.COMPLEX_UNIT_SP, fontSize)
        }
    }

    private fun previousHymn() {
        recreate()
    }

    private fun nextHymn() {
        TODO()
    }
}
