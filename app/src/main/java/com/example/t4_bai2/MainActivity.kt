package com.example.t4_bai2

import android.content.Intent
import androidx.appcompat.app.AppCompatActivity
import android.os.Bundle

class MainActivity : AppCompatActivity() {
    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)

        // Không cần setContentView vì ta không dùng layout của MainActivity
        // setContentView(R.layout.activity_main)

        // Chạy sang màn hình Forget Password
        val intent = Intent(this, ForgetPasswordActivity::class.java)
        startActivity(intent)

        // Kết thúc MainActivity để không quay lại fragment mặc định
        finish()
    }
}
