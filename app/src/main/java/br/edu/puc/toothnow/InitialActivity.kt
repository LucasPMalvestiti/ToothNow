package br.edu.puc.toothnow

import android.annotation.SuppressLint
import android.content.Intent
import androidx.appcompat.app.AppCompatActivity
import android.os.Bundle
import androidx.appcompat.widget.AppCompatButton

class InitialActivity : AppCompatActivity() {

    lateinit var btnLogin: AppCompatButton
    lateinit var btnRegistrar: AppCompatButton

    @SuppressLint("MissingInflatedId")
    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        setContentView(R.layout.activity_initial)

        btnLogin = findViewById(R.id.btnLogin)
        btnRegistrar = findViewById(R.id.btnRegistrar)

        btnLogin.setOnClickListener{
            openRegisterActivity()
        }
        btnRegistrar.setOnClickListener{
            openRegisterActivity()
        }
    }
    private fun openRegisterActivity(){
        val intent = Intent(this, RegisterActivity::class.java)
        startActivity(intent)
    }
}