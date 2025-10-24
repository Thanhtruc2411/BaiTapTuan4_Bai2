package com.example.t4_bai2

import android.os.Bundle
import android.widget.EditText
import android.widget.ImageButton
import androidx.appcompat.app.AppCompatActivity

class ConfirmActivity : AppCompatActivity() {
    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        setContentView(R.layout.activity_confirm)

        // Nút Back
        val btnBack = findViewById<ImageButton?>(R.id.btnBack)
        btnBack?.setOnClickListener {
            onBackPressedDispatcher.onBackPressed()
        }

        // Lấy dữ liệu từ Intent
        val email = intent.getStringExtra("email") ?: ""
        val code = intent.getStringExtra("code") ?: ""
        val password = intent.getStringExtra("password") ?: ""

        // Gán dữ liệu vào các EditText tương ứng
        val edtEmail = findViewById<EditText>(R.id.edtEmail)
        val edtCode = findViewById<EditText>(R.id.edtCode)
        val edtPassword = findViewById<EditText>(R.id.edtPassword)

        edtEmail.setText(email)
        edtCode.setText(code)
        edtPassword.setText(password)
    }
}

