package com.example.viewmodelexample

import androidx.lifecycle.ViewModel

class MainActivityViewModel: ViewModel() {

    var helloWord :String? = null

    fun sayHello(word: String) {
        helloWord = word
    }
}