package com.example.rizky_3tib

import android.content.Intent
import android.os.Bundle
import android.util.Log
import android.widget.Button
import android.widget.EditText
import android.widget.TextView
import android.widget.Toast
import androidx.activity.enableEdgeToEdge
import androidx.appcompat.app.AppCompatActivity
import androidx.core.view.ViewCompat
import androidx.core.view.WindowInsetsCompat
import com.example.rizky_3tib.databinding.ActivityLoginBinding
import org.w3c.dom.Text
import kotlin.math.log

class LoginActivity : AppCompatActivity() {
    private lateinit var binding : ActivityLoginBinding

    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        enableEdgeToEdge()

        binding = ActivityLoginBinding.inflate(layoutInflater)
        setContentView(binding.root)

        ViewCompat.setOnApplyWindowInsetsListener(findViewById(R.id.main)) { v, insets ->
            val systemBars = insets.getInsets(WindowInsetsCompat.Type.systemBars())
            v.setPadding(systemBars.left, systemBars.top, systemBars.right, systemBars.bottom)
            insets
        }
//        val tombolLogin : Button = findViewById(R.id.btn_login)
//        val username : EditText = findViewById(R.id.ett_username)
//        val password : EditText = findViewById(R.id.ett_password)
//        val lupaPassword : TextView = findViewById(R.id.forget_password)

//        tombolLogin.setOnClickListener{
        binding.btnLogin.setOnClickListener{
            val user = binding.ettUsername.text.toString()
            val pw = binding.ettPassword.text.toString()

            Log.e("hasil","Username $user Password $pw")
            Toast.makeText(this, "Username $user Password $pw", Toast.LENGTH_SHORT).show()

            val intent = Intent(this, MainActivity::class.java)

            intent.putExtra("username",user)
            intent.putExtra("password",pw)
            intent.putExtra("umur",20)

            startActivity(intent)
        }
    }
}