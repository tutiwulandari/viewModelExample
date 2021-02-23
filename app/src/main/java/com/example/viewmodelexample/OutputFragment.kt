package com.example.viewmodelexample

import android.os.Bundle
import androidx.fragment.app.Fragment
import android.view.LayoutInflater
import android.view.View
import android.view.ViewGroup
import androidx.lifecycle.ViewModelProvider
import com.example.viewmodelexample.databinding.FragmentOutputBinding


class OutputFragment : Fragment() {
    lateinit var binding:FragmentOutputBinding
    lateinit var viewModel: MainActivityViewModel


    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        viewModel = ViewModelProvider(requireActivity()).get(MainActivityViewModel::class.java)

    }

    override fun onCreateView(
        inflater: LayoutInflater, container: ViewGroup?,
        savedInstanceState: Bundle?
    ): View? {
        // Inflate the layout for this fragment
       binding = FragmentOutputBinding.inflate(layoutInflater)
        binding.apply {
            textView.setText(viewModel.helloWord)
        }
        return binding.root
    }

    companion object {

        fun newInstance() =
            OutputFragment()
    }
}