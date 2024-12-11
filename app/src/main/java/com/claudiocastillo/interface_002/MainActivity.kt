package com.claudiocastillo.interface_002

import android.os.Bundle
import androidx.activity.enableEdgeToEdge
import androidx.appcompat.app.AppCompatActivity
import androidx.core.view.ViewCompat
import androidx.core.view.WindowInsetsCompat
import com.claudiocastillo.interface_002.databinding.ActivityMainBinding

class MainActivity : AppCompatActivity() {

    private lateinit var binding: ActivityMainBinding

    val guitarra = Guitarra().Cuerdas()
    val violin = Violin().Cuerdas()
    val bajoQuinto = BajoQuinto().Cuerdas()
    val bajoSexto = BajoSexto().Cuerdas()
    val chelo = Chelo().Cuerdas()

    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        binding = ActivityMainBinding.inflate(layoutInflater)
        setContentView(binding.root)



        binding.tvMensaje1.text = guitarra.toString()
        binding.tvMensaje2.text = violin.toString()
        binding.tvMensaje3.text = bajoQuinto.toString()
        binding.tvMensaje4.text = bajoSexto.toString()
        binding.tvMensaje5.text = chelo.toString()

        }
    }