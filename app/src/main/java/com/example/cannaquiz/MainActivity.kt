package com.example.cannaquiz

import android.content.Intent
import android.os.Bundle
import android.view.View
import androidx.activity.enableEdgeToEdge
import androidx.appcompat.app.AppCompatActivity
import androidx.core.view.ViewCompat
import androidx.core.view.WindowInsetsCompat

class MainActivity : AppCompatActivity() {
    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        enableEdgeToEdge()
        setContentView(R.layout.activity_main)
        ViewCompat.setOnApplyWindowInsetsListener(findViewById(R.id.main)) { v, insets ->
            val systemBars = insets.getInsets(WindowInsetsCompat.Type.systemBars())
            v.setPadding(systemBars.left, systemBars.top, systemBars.right, systemBars.bottom)
            insets
        }
    }
    //Unterteilung der Kategorien
    fun grow(view: View) {
        startQuestionActivity("Grow")
    }

    fun health(view: View) {
        startQuestionActivity("Health")
    }

    fun terps(view: View) {
        startQuestionActivity("Terps")
    }

    fun history(view: View) {
        startQuestionActivity("History")
    }

    fun strains(view: View) {
        startQuestionActivity("Strains")
    }

    fun goods(view: View) {
        startQuestionActivity("Goods")
    }

    private fun startQuestionActivity(category: String) {
        val intent = Intent(this, QuestionActivity::class.java)
        intent.putExtra("CATEGORY", category)
        startActivity(intent)

    }
}

