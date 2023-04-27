package br.edu.puc.toothnow

import android.annotation.SuppressLint
import android.content.Intent
import androidx.appcompat.app.AppCompatActivity
import android.os.Bundle
import androidx.appcompat.widget.AppCompatButton

class LogInFragment : AppCompatActivity() {

    lateinit var btnLogin: AppCompatButton
    lateinit var btnRegister: AppCompatButton

    @SuppressLint("MissingInflatedId")
    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        setContentView(R.layout.fragment_login)

        btnLogin = findViewById(R.id.btnLogin)
        btnRegister = findViewById(R.id.btnRegister)

        btnLogin.setOnClickListener{
            openRegisterActivity()
        }
        btnRegister.setOnClickListener{
            openCreateActivity()
        }
    }

    private fun openCreateActivity() {
        val intent = Intent(this, SingUpFragment::class.java)
        startActivity(intent)
    }

    private fun openRegisterActivity(){
        val intent = Intent(this, RegisterActivity::class.java)
        startActivity(intent)
    }


}