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
    lateinit var etSenha: AppCompatEditText
    lateinit var etEndereco: AppCompatEditText
    lateinit var etCurriculo: AppCompatEditText

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

        btnCadastrar = findViewById(R.id.btnSignIn)
        etNome = findViewById(R.id.etName)
        etTelefone = findViewById(R.id.etPhoneNumber)
        etEmail = findViewById(R.id.etEmailRegister)
        etSenha = findViewById(R.id.etPasswordRegister)
        etEndereco = findViewById(R.id.etAdr1)
        etCurriculo = findViewById(R.id.etShortResume)


        btnCadastrar.setOnClickListener{
            adcDentista()
        }
    }

    private fun dadosProfissional(): HashMap<String, String> {
        return hashMapOf(
            "nome" to etNome.text.toString(),
            "telefone" to etTelefone.text.toString(),
            "email" to etEmail.text.toString(),
            "senha" to etSenha.text.toString(),
            "endereco" to etEndereco.text.toString(),
            "curriculo" to etCurriculo.text.toString()
        )
    }

    private fun adcDentista(): Task<String> {
        return FirebaseFunctions
            .getInstance("southamerica-east1")
            .getHttpsCallable("addProf")
            .call(dadosProfissional())
            .continueWith { task ->
                val result = task.result.data as String
                result
            }
    }
}