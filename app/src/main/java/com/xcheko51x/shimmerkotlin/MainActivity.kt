package com.xcheko51x.shimmerkotlin

import androidx.appcompat.app.AppCompatActivity
import android.os.Bundle
import android.os.Handler
import android.os.Looper
import android.view.View
import android.widget.LinearLayout
import androidx.core.view.isVisible

class MainActivity : AppCompatActivity() {

    lateinit var llContenedor: LinearLayout
    lateinit var llCargando: LinearLayout

    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        setContentView(R.layout.activity_main)

        llContenedor = findViewById(R.id.llContenedor)
        llCargando = findViewById(R.id.llCargando)

        Handler(Looper.getMainLooper()).postDelayed({
            llCargando.isVisible = false
            llContenedor.isVisible = true
        }, 5000)
    }
}