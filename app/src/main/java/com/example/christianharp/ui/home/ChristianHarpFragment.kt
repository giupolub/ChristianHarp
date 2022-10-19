package com.example.christianharp.ui.home

import android.os.Bundle
import android.view.LayoutInflater
import android.view.View
import android.view.ViewGroup
import android.widget.TextView
import androidx.fragment.app.Fragment
import androidx.lifecycle.ViewModelProvider
import androidx.recyclerview.widget.LinearLayoutManager
import com.example.christianharp.databinding.FragmentChristianHarpBinding

class ChristianHarpFragment : Fragment() {

    private var _binding: FragmentChristianHarpBinding? = null
    private val binding get() = _binding!!

    private lateinit var viewModel: ChristianHarpViewModel

    override fun onCreateView(inflater: LayoutInflater, container: ViewGroup?, b: Bundle?): View {

        viewModel = ViewModelProvider(this).get(ChristianHarpViewModel::class.java)

        _binding = FragmentChristianHarpBinding.inflate(inflater, container, false)

        //Layout da RecycleView
        binding.recyclerHymns.layoutManager = LinearLayoutManager(context)

        //Adapter da RecycleView
        binding.recyclerHymns.adapter = ChristianHarpAdapter()

        return binding.root
    }

    override fun onDestroyView() {
        super.onDestroyView()
        _binding = null
    }
}