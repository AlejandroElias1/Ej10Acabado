package com.example.ej9mul

import androidx.appcompat.app.AppCompatActivity
import android.os.Bundle
import com.example.ej9mul.databinding.ActivityObjBinding

class Activity_Obj : AppCompatActivity() {
    lateinit var binding: ActivityObjBinding
    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        setContentView(R.layout.activity_obj)
        binding= ActivityObjBinding.inflate(layoutInflater)
        setContentView(binding.root)

        binding.recoger.setOnClickListener {
            val intent = android.content.Intent(this, Activity_Obj2::class.java)
            startActivity(intent)
        }
        binding.continuar1.setOnClickListener {
            val intent = android.content.Intent(this, Activity_4::class.java)
            startActivity(intent)
        }
    }

}

