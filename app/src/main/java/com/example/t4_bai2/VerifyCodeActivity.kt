package com.example.t4_bai2

import android.content.Intent
import android.os.Bundle
import android.widget.Button
import android.widget.ImageButton
import android.widget.EditText
import androidx.appcompat.app.AppCompatActivity

class VerifyCodeActivity : AppCompatActivity() {
    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        setContentView(R.layout.activity_verify_code)
        val btnBack = findViewById<ImageButton>(R.id.btnBack)
        btnBack.setOnClickListener {
            onBackPressedDispatcher.onBackPressed()
        }


        val email = intent.getStringExtra("email")
        val edtCode = findViewById<EditText>(R.id.edtCode)
        val btnNext = findViewById<Button>(R.id.btnNext)

        btnNext.setOnClickListener {
            val code = edtCode.text.toString()
            if (code.isEmpty()) {
                edtCode.error = "Please enter code"
            } else {
                val intent = Intent(this, ResetPasswordActivity::class.java)
                intent.putExtra("email", email)
                intent.putExtra("code", code)
                startActivity(intent)
            }
        }
    }
}
