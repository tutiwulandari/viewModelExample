package com.example.viewmodelexample

import androidx.appcompat.app.AppCompatActivity
import android.os.Bundle
import androidx.lifecycle.ViewModelProvider
import com.example.viewmodelexample.databinding.ActivityMainBinding

class MainActivity : AppCompatActivity() {
    lateinit var binding: ActivityMainBinding
    lateinit var viewModel: MainActivityViewModel


    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        binding = ActivityMainBinding.inflate(layoutInflater)
        setContentView(binding.root)

//        binding.headerTitle.text = "123"

        initViewModel()
        binding.apply {
            headerTitle.text ="234"
            button.setOnClickListener {
                button.text ="Helllooooooooo"
            }
        }
    }

//    private fun initViewModel() {
//       viewModel = ViewModelProvider(this).get(MainActivityViewModel::class.java)
//    }

    private fun initViewModel() {
        viewModel = ViewModelProvider(this).get(MainActivityViewModel::class.java)
    }

    }