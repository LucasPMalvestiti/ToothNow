package br.edu.puc.toothnow

import android.os.Bundle
import androidx.appcompat.app.AppCompatActivity
import androidx.appcompat.widget.AppCompatButton
import androidx.appcompat.widget.AppCompatEditText

class CreateActivity : AppCompatActivity() {

    lateinit var btnCadastrar: AppCompatButton
    lateinit var etEmail : AppCompatEditText
    lateinit var etSenha : AppCompatEditText
    lateinit var etConfirmarSenha: AppCompatEditText

    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        setContentView(R.layout.activity_cadastro)

        btnCadastrar = findViewById(R.id.btnCadastrar)
        etEmail = findViewById(R.id.etemail)
        etSenha = findViewById(R.id.etSenha)
        etConfirmarSenha = findViewById(R.id.etConfirmarSenha)

    }
}