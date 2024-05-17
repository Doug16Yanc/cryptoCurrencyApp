package com.example.myapplication

import android.os.Bundle
import android.widget.EditText
import androidx.appcompat.app.AppCompatActivity

class LoginActivity : AppCompatActivity() {
    lateinit var userEdt : EditText
    lateinit var passEdt : EditText

    @Override
    fun onCreate(savedInstanceState : Bundle){
        super.onCreate(savedInstanceState)
        setContentView(R.layout.activity_login)

        initView()
    }
    fun initView(){
        userEdt = findViewById(R.id.editTextTextPersonName)
        passEdt = findViewById(R.id.editTextTextPassword)
    }
}