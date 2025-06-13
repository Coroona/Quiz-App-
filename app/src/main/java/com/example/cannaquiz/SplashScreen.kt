package com.example.cannaquiz


import android.content.Intent
import android.os.Bundle
import android.os.Handler
import android.os.Looper
import androidx.appcompat.app.AppCompatActivity

class SplashScreen : AppCompatActivity() {
    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        setContentView(R.layout.activity_splash_screen)

        // 3 Sekunden warten, dann zu MainActivity wechseln automatisch
        Handler(Looper.getMainLooper()).postDelayed({
            startActivity(Intent(this, MainActivity::class.java))
            finish() // SplashScreen schließen, damit man nicht zurück kann
        }, 3000) // 3000ms = 3 Sekunden
    }
}

