package br.edu.puc.toothnow

import android.os.Bundle
import androidx.appcompat.app.AppCompatActivity
import androidx.appcompat.widget.AppCompatButton

class CreateActivity : AppCompatActivity() {

    lateinit var btnCadastrar: AppCompatButton

    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        setContentView(R.layout.activity_cadastro)

        btnCadastrar = findViewById(R.id.btnCadastrar)

    }
}