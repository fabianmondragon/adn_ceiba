package com.example.adn_ceiba.view

import androidx.appcompat.app.AppCompatActivity
import android.os.Bundle
import com.example.adn_ceiba.R
import com.example.adn_ceiba.viewmodel.ParqueaderoViewModel
import javax.inject.Inject

class MainActivity : AppCompatActivity() {

    @Inject
    lateinit var parqueaderoViewModel: ParqueaderoViewModel

    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        setContentView(R.layout.activity_main)
    }
}
