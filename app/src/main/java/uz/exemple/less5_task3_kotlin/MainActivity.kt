package uz.exemple.less5_task3_kotlin

import androidx.appcompat.app.AppCompatActivity
import android.os.Bundle
import android.widget.Button
import android.widget.EditText

class MainActivity : AppCompatActivity() {
    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        setContentView(R.layout.activity_main)
        initViews()
    }
    fun initViews() {
        val remember = findViewById<Button>(R.id.btn_remember)
        remember.setOnClickListener {
            val userId = findViewById<EditText>(R.id.et_userId_third)
            val userPw = findViewById<EditText>(R.id.et_userPw_third)
            userId.setText("2004005605")
            userPw.setText("Pw38h@jF$5")
        }

    }
}