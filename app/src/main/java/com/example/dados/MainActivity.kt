package com.example.dados

import androidx.appcompat.app.AppCompatActivity
import android.os.Bundle
import com.example.dados.databinding.ActivityMainBinding
import kotlin.random.Random

class MainActivity : AppCompatActivity() {
    private lateinit var b: ActivityMainBinding
    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        b = ActivityMainBinding.inflate(layoutInflater)
        setContentView(b.root)


        val n1 = Random.nextInt(1, 7)
        val imgResource = when (n1) {
            1 -> R.drawable.dice1
            2 -> R.drawable.dice2
            3 -> R.drawable.dice3
            4 -> R.drawable.dice4
            5 -> R.drawable.dice5
            else -> R.drawable.dice6
        }

        val n2 = Random.nextInt(1, 7)
        val imgResource2 = when (n2) {
            1 -> R.drawable.dice1
            2 -> R.drawable.dice2
            3 -> R.drawable.dice3
            4 -> R.drawable.dice4
            5 -> R.drawable.dice5
            else -> R.drawable.dice6
        }
        b.imDado1.setImageResource(imgResource)
        b.imDado2.setImageResource(imgResource2)
        b.tvResultado.text = (n1 + n2).toString()
    }

}








