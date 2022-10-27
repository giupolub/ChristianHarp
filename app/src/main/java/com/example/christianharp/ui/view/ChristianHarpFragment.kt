package com.example.christianharp.ui.view

import android.content.Intent
import android.os.Bundle
import android.view.LayoutInflater
import android.view.View
import android.view.ViewGroup
import android.widget.TextView
import androidx.fragment.app.Fragment
import androidx.lifecycle.ViewModelProvider
import androidx.recyclerview.widget.LinearLayoutManager
import com.example.christianharp.databinding.FragmentChristianHarpBinding
import com.example.christianharp.ui.viewmodel.ChristianHarpViewModel
import com.example.christianharp.ui.view.adapter.ChristianHarpAdapter
import com.example.christianharp.ui.view.listener.OnCHListener

class ChristianHarpFragment : Fragment() {

    private var _binding: FragmentChristianHarpBinding? = null
    private val binding get() = _binding!!

    private lateinit var viewModel: ChristianHarpViewModel
    private val adapter = ChristianHarpAdapter()

    override fun onCreateView(inflater: LayoutInflater, container: ViewGroup?, b: Bundle?): View {

        viewModel = ViewModelProvider(this).get(ChristianHarpViewModel::class.java)
        _binding = FragmentChristianHarpBinding.inflate(inflater, container, false)

        //Layout da RecycleView
        binding.recyclerChristianHarp.layoutManager = LinearLayoutManager(context)

        //Adapter da RecycleView
        binding.recyclerChristianHarp.adapter = adapter

        val listener = object : OnCHListener {
            override fun onClick(id: Int) {
                val intent = Intent(context, DetailsHymnActivity::class.java)
                val bundle = Bundle()
                bundle.putInt("hymnID", id)
                intent.putExtras(bundle)

                startActivity(intent)
            }

        }

        adapter.attachListener(listener)

        observe()

        return binding.root
    }

    override fun onResume() {
        super.onResume()
        viewModel.getAll()
    }

    override fun onDestroyView() {
        super.onDestroyView()
        _binding = null
    }

    private fun observe() {
        viewModel.hymns.observe(viewLifecycleOwner) {
            adapter.updatedHymns(it)
        }
    }
}