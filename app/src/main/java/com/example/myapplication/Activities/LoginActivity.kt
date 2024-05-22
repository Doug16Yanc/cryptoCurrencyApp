package com.example.myapplication.Activities

import android.os.Bundle
import android.widget.EditText
import androidx.appcompat.app.AppCompatActivity
import com.example.myapplication.R

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