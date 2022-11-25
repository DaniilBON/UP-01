package com.example.practice

import android.content.Intent
import android.content.IntentSender
import androidx.appcompat.app.AppCompatActivity
import android.os.Bundle
import android.view.View
import android.widget.TextView
import android.widget.Toast

class LoginActivity : AppCompatActivity() {
    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        setContentView(R.layout.activity_login)
    }

    fun Login(view: View) {
        val loginText: TextView = findViewById(R.id.editTextLogin)
        val passwordText: TextView = findViewById(R.id.editTextPassword)
        val signText: TextView = findViewById(R.id.textSign)
        val login = loginText.text.toString()
        val password = passwordText.text.toString().toInt()
        val intent: Intent = Intent(this@LoginActivity, ProfileActivity::class.java)
        if (login.toString().equals("admin") && (password.toString().toInt().equals(123456))) {
            signText.setText("Вы успешно авторизировались!")
            intent.putExtra("Login", login)
            intent.putExtra("Password", password)
            startActivity(intent)
        } else {
            signText.setText("Логин или пароль неверны!")
        }
        if (login.toString().trim().length == 0) {
            signText.setText("Заполните поля!")
        }
    }
    fun BackMenu (view: View){
        val intent: Intent = Intent(this@LoginActivity, MainActivity::class.java)
        startActivity(intent)
    }
}