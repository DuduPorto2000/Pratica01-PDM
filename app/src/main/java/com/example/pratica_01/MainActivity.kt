package com.example.pratica_01

import androidx.appcompat.app.AppCompatActivity
import android.os.Bundle
import android.view.View
import android.widget.Button
import android.widget.TextView

class MainActivity : AppCompatActivity() {

    private lateinit var telaMensagem: TextView
    private lateinit var botaotTrocador: Button
    private lateinit var tela: View


    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        setContentView(R.layout.activity_main)

        this.telaMensagem = findViewById (R.id.mensagem)

        this.botaotTrocador = findViewById(R.id.botaoDeTroca)
        this.tela = findViewById(R.id.view)

        this.botaotTrocador.setOnClickListener{
            this.telaMensagem.text = RGB().toString()

            this.tela.setBackgroundColor(RGB().toString().replace("[","").replace("]","").toInt())

        }





    }



}