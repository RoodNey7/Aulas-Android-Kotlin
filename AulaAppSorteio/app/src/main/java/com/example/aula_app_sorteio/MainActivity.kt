package com.example.aula_app_sorteio

import androidx.appcompat.app.AppCompatActivity
import android.os.Bundle
import android.view.View
import android.widget.TextView
import kotlin.random.Random

class MainActivity : AppCompatActivity() {
    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        setContentView(R.layout.activity_main)
    }

    fun sortear(view:View){
        val textoResultado = findViewById<TextView>(R.id.textView2)
        val numero = java.util.Random().nextInt(11) //0...10
        textoResultado.setText("O RESULTADO DO SORTEIO É $numero")

    }

}