package com.example.viewmodelexample

import androidx.appcompat.app.AppCompatActivity
import android.os.Bundle
import androidx.lifecycle.ViewModel
import androidx.lifecycle.ViewModelProvider
import com.example.viewmodelexample.databinding.ActivityMainBinding

class MainActivity : AppCompatActivity(), OnNavigationListener {
    lateinit var binding: ActivityMainBinding
    lateinit var inputFragment: InputFragment
    lateinit var outputFragment: OutputFragment
    lateinit var viewModel: MainActivityViewModel

    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        binding = ActivityMainBinding.inflate(layoutInflater)
        setContentView(binding.root)

        inputFragment = InputFragment.newInstance(this)
        outputFragment =OutputFragment.newInstance()

        viewModel = ViewModelProvider(this).get(MainActivityViewModel::class.java)
        viewModel.helloWord?.let {
            supportFragmentManager.beginTransaction().replace(R.id.fragment_container,outputFragment).commit()
        } ?: let {
            supportFragmentManager.beginTransaction().replace(R.id.fragment_container, inputFragment).commit()
        }
    }

    override fun onHello() {
        supportFragmentManager.beginTransaction().replace(R.id.fragment_container, outputFragment).commit()
    }


}