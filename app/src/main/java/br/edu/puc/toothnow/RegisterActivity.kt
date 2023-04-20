package br.edu.puc.toothnow

import androidx.appcompat.app.AppCompatActivity
import android.os.Bundle
import android.os.StrictMode
import androidx.appcompat.widget.AppCompatButton
import androidx.appcompat.widget.AppCompatEditText
import com.google.android.gms.tasks.Task
import com.google.firebase.functions.FirebaseFunctions

class RegisterActivity : AppCompatActivity() {

    lateinit var btnCadastrar: AppCompatButton
    lateinit var etNome:  AppCompatEditText
    lateinit var etTelefone: AppCompatEditText
    lateinit var etEmail: AppCompatEditText

    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        setContentView(R.layout.activity_register)

        StrictMode.setThreadPolicy(
            StrictMode.ThreadPolicy.Builder()
                .detectAll()
                .permitDiskWrites()
                .detectDiskReads()
                .penaltyDeath()
                .build())

        btnCadastrar = findViewById(R.id.btnCadastrar)
        etNome = findViewById(R.id.etNome)
        etTelefone = findViewById(R.id.etTelefone)
        etEmail = findViewById(R.id.etEmail)

        btnCadastrar.setOnClickListener{
            adcDentista()
        }
    }

    private fun dadosProfissional(): HashMap<String, String> {
        return hashMapOf(
            "nome" to "teste",
            "telefone" to "1999999999",
            "email" to "emailteste@gmail.com"
        )
    }

    private fun adcDentista(): Task<String> {
        return FirebaseFunctions
            .getInstance("southamerica-east1")
            .getHttpsCallable("addSampleDentist")
            .call(dadosProfissional())
            .continueWith { task ->
                val result = task.result.data as String
                result
            }
    }
}