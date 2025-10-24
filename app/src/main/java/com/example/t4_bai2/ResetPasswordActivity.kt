package com.example.t4_bai2



import android.content.Intent
import android.os.Bundle
import android.widget.ImageButton
import android.widget.Button
import android.widget.EditText
import androidx.appcompat.app.AppCompatActivity

class ResetPasswordActivity : AppCompatActivity() {
    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        setContentView(R.layout.activity_reset_password)
        val btnBack = findViewById<ImageButton>(R.id.btnBack)
        btnBack.setOnClickListener {
            onBackPressedDispatcher.onBackPressed()
        }


        val email = intent.getStringExtra("email")
        val code = intent.getStringExtra("code")

        val edtPass = findViewById<EditText>(R.id.edtPassword)
        val edtConfirm = findViewById<EditText>(R.id.edtConfirm)
        val btnNext = findViewById<Button>(R.id.btnNext)

        btnNext.setOnClickListener {
            val pass = edtPass.text.toString()
            val confirm = edtConfirm.text.toString()

            if (pass.isEmpty() || confirm.isEmpty()) {
                edtPass.error = "Please enter both fields"
            } else if (pass != confirm) {
                edtConfirm.error = "Passwords do not match"
            } else {
                val intent = Intent(this, ConfirmActivity::class.java)
                intent.putExtra("email", email)
                intent.putExtra("code", code)
                intent.putExtra("password", pass)
                startActivity(intent)
            }
        }
    }
}
