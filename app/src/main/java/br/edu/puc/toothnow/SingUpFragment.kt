package br.edu.puc.toothnow

import android.nfc.Tag
import android.os.Bundle
import androidx.appcompat.app.AppCompatActivity
import androidx.appcompat.widget.AppCompatButton
import androidx.appcompat.widget.AppCompatEditText
import androidx.fragment.app.Fragment
import com.google.firebase.auth.FirebaseAuth
import com.google.firebase.functions.FirebaseFunctions

class SingUpFragment : Fragment() {

    private val TAG = "SingUpFragment"
    private lateinit var auth: FirebaseAuth
    private lateinit var functions: FirebaseFunctions
}