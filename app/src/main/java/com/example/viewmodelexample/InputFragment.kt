package com.example.viewmodelexample

import android.os.Bundle
import androidx.fragment.app.Fragment
import android.view.LayoutInflater
import android.view.View
import android.view.ViewGroup
import androidx.lifecycle.ViewModelProvider
import com.example.viewmodelexample.databinding.FragmentInputBinding


class InputFragment(var onNavigationListener: OnNavigationListener) : Fragment() {
    lateinit var viewModel: MainActivityViewModel
    lateinit var binding: FragmentInputBinding

    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        viewModel = ViewModelProvider(requireActivity()).get(MainActivityViewModel::class.java)

    }

    override fun onCreateView(
        inflater: LayoutInflater, container: ViewGroup?,
        savedInstanceState: Bundle?
    ): View? {
        // Inflate the layout for this fragment
    binding = FragmentInputBinding.inflate(layoutInflater)
        binding.apply {
            editTextTextPersonName.setText(viewModel.helloWord)
            button2.setOnClickListener{
                println("BTN")
                val personName = editTextTextPersonName.text
            viewModel.sayHello("Hii..${personName}")
                onNavigationListener.onHello()
            }
        }
return binding.root
    }

    companion object {

        @JvmStatic
        fun newInstance(onNavigationListener: OnNavigationListener) = InputFragment(onNavigationListener)
    }
}