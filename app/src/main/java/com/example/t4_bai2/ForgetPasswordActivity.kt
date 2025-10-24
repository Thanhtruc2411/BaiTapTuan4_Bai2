package com.example.t4_bai2


import android.content.Intent
import android.os.Bundle
import android.widget.Button
import android.widget.EditText
import androidx.appcompat.app.AppCompatActivity

class ForgetPasswordActivity : AppCompatActivity() {
    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        setContentView(R.layout.activity_forget_password)

        val edtEmail = findViewById<EditText>(R.id.edtEmail)
        val btnNext = findViewById<Button>(R.id.btnNext)

        btnNext.setOnClickListener {
            val email = edtEmail.text.toString()
            if (email.isEmpty()) {
                edtEmail.error = "Please enter your email"
            } else {
                // Gửi dữ liệu sang màn VerifyCode
                val intent = Intent(this, VerifyCodeActivity::class.java)
                intent.putExtra("email", email)
                startActivity(intent)
            }
        }
    }
}
