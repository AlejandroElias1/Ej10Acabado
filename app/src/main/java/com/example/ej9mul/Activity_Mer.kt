package com.example.ej9mul

import androidx.appcompat.app.AppCompatActivity
import android.os.Bundle
import com.example.ej9mul.databinding.ActivityMerBinding

class Activity_Mer : AppCompatActivity() {
    lateinit var binding: ActivityMerBinding
    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        setContentView(R.layout.activity_mer)
        binding= ActivityMerBinding.inflate(layoutInflater)
        setContentView(binding.root)

        binding.comerciar.setOnClickListener {
            val intent = android.content.Intent(this, Activity_Mer2::class.java)
            startActivity(intent)
        }
        binding.continuar1.setOnClickListener {
            val intent = android.content.Intent(this, Activity_4::class.java)
            startActivity(intent)
        }
    }
}