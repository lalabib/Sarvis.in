package com.project.lalabib.sarvisin.ui.signup

import androidx.appcompat.app.AppCompatActivity
import android.os.Bundle
import com.project.lalabib.sarvisin.databinding.ActivitySignupBinding

class SignupActivity : AppCompatActivity() {

    private lateinit var binding: ActivitySignupBinding

    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        binding = ActivitySignupBinding.inflate(layoutInflater)
        setContentView(binding.root)
    }
}