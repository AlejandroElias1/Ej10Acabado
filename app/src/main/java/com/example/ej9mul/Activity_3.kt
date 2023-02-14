package com.example.ej9mul

import android.annotation.SuppressLint
import android.os.Bundle
import android.widget.Button
import androidx.appcompat.app.AppCompatActivity
import com.example.ej9mul.databinding.Activity3Binding



class Activity_3 : AppCompatActivity() {
    lateinit var binding: Activity3Binding
    @SuppressLint("SetTextI18n")
    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        setContentView(R.layout.activity_main)
        binding= Activity3Binding.inflate(layoutInflater)
        setContentView(binding.root)

        when(intent.getStringExtra("raza")){
            "elfo" -> {
                binding.im2.setImageResource(R.drawable.elfo)
                binding.textView.text = "Elfo"
            }
            "humano" -> {
                binding.im2.setImageResource(R.drawable.humano)
                binding.textView.text = "Humano"
            }
            "enano" -> {
                binding.im2.setImageResource(R.drawable.enano)
                binding.textView.text = "Enano"
            }
            "goblin" -> {
                binding.im2.setImageResource(R.drawable.goblin)
                binding.textView.text = "goblin"
            }
        }


        when(intent.getStringExtra("clase")){
            "guerrero" -> {
                binding.im1.setImageResource(R.drawable.guerrero)
                binding.textView2.text = "Guerrero"
            }
            "mago" -> {
                binding.im1.setImageResource(R.drawable.mago)
                binding.textView2.text = "Mago"
            }
            "clerigo" -> {
                binding.im1.setImageResource(R.drawable.clerigo)
                binding.textView2.text = "Clerigo"
            }
            "ladron" -> {
                binding.im1.setImageResource(R.drawable.ladron)
                binding.textView2.text = "Ladron"
            }
        }

        binding.variables.text = "Fuerza: ${(1..10).random()}\n" +
                                 "Defensa: ${(1..5).random()}\n" +
                                 "TamMoch: 100\n" +
                                 "Vida: 200\n" +
                                 "Monedero: - "


        binding.continuar1.setOnClickListener {
            val intent = android.content.Intent(this, Activity_4::class.java)
            startActivity(intent)
        }

        binding.volver.setOnClickListener {
            val intent = android.content.Intent(this, MainActivity::class.java)
            startActivity(intent)
        }
    }

}
