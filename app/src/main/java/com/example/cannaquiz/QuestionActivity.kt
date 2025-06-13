package com.example.cannaquiz

import android.content.Intent
import android.graphics.Color
import android.os.Bundle
import android.widget.*
import androidx.activity.enableEdgeToEdge
import androidx.appcompat.app.AppCompatActivity
import androidx.core.view.ViewCompat
import androidx.core.view.WindowInsetsCompat
import com.example.cannaquiz.model.Question
import com.example.cannaquiz.questions.GoodsQuestions
import com.example.cannaquiz.questions.HistoryQuestions
import com.example.cannaquiz.questions.StrainsQuestions
import com.example.cannaquiz.questions.TerpsQuestions
import com.example.cannaquiz.questions.GrowQuestions

class QuestionActivity : AppCompatActivity() {

    private lateinit var questions: List<Question>
    private var currentQuestionIndex = 0
    private var score = 0

    private lateinit var questionText: TextView
    private lateinit var radioGroup: RadioGroup
    private lateinit var radioBtn1: RadioButton
    private lateinit var radioBtn2: RadioButton
    private lateinit var radioBtn3: RadioButton
    private lateinit var scoreNo: TextView
    private lateinit var dispNo: TextView
    private lateinit var nextBtn: Button
    private lateinit var quitBtn: TextView

    private var answered = false

    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        enableEdgeToEdge()
        setContentView(R.layout.activity_question)

        ViewCompat.setOnApplyWindowInsetsListener(findViewById(R.id.main)) { v, insets ->
            val systemBars = insets.getInsets(WindowInsetsCompat.Type.systemBars())
            v.setPadding(systemBars.left, systemBars.top, systemBars.right, systemBars.bottom)
            insets
        }

        // Views initialisieren
        questionText = findViewById(R.id.question)
        radioGroup = findViewById(R.id.radioGroup)
        radioBtn1 = findViewById(R.id.radioBtn1)
        radioBtn2 = findViewById(R.id.radioBtn2)
        radioBtn3 = findViewById(R.id.radioBtn3)
        scoreNo = findViewById(R.id.scoreNo)
        dispNo = findViewById(R.id.dispNo)
        nextBtn = findViewById(R.id.nextBtn)
        quitBtn = findViewById(R.id.quitBtn)

        val category = intent.getStringExtra("CATEGORY") ?: "Grow"

        questions = when(category) {
            "Grow" -> GrowQuestions.questions
            "Goods" -> GoodsQuestions.questions
            "History" -> HistoryQuestions.questions
            "Strains" -> StrainsQuestions.questions
            "Terps" -> TerpsQuestions.questions
            else -> GrowQuestions.questions
        }

        showQuestion()

        nextBtn.setOnClickListener {
            if (!answered) {
                val selectedId = radioGroup.checkedRadioButtonId
                if (selectedId == -1) {
                    Toast.makeText(this, "Bitte wähle eine Antwort!", Toast.LENGTH_SHORT).show()
                    return@setOnClickListener
                }

                answered = true
                val selectedIndex = when(selectedId) {
                    R.id.radioBtn1 -> 0
                    R.id.radioBtn2 -> 1
                    R.id.radioBtn3 -> 2
                    else -> -1
                }

                val correctIndex = questions[currentQuestionIndex].correctAnswerIndex

                if (selectedIndex == correctIndex) {
                    score++
                    scoreNo.text = score.toString()
                    Toast.makeText(this, "Richtig!", Toast.LENGTH_SHORT).show()
                } else {
                    Toast.makeText(this, "Falsch!", Toast.LENGTH_SHORT).show()
                    markCorrectAnswer(correctIndex)
                }

                nextBtn.text = if (currentQuestionIndex == questions.lastIndex) "Beenden" else "Weiter"

            } else {
                currentQuestionIndex++
                if (currentQuestionIndex < questions.size) {
                    showQuestion()
                    nextBtn.text = "Antwort bestätigen"
                    answered = false
                } else {
                    Toast.makeText(this, "Quiz beendet! Dein Score: $score/${questions.size}", Toast.LENGTH_LONG).show()
                    finish()
                }
            }
        }

        quitBtn.setOnClickListener {
            startActivity(Intent(this, MainActivity::class.java))
            finish()
        }
    }

    private fun showQuestion() {
        val q = questions[currentQuestionIndex]
        questionText.text = q.question
        radioBtn1.text = q.options[0]
        radioBtn2.text = q.options[1]
        radioBtn3.text = q.options[2]
        dispNo.text = "${currentQuestionIndex + 1}/${questions.size}"

        radioGroup.clearCheck()
        resetRadioButtonsColors()
    }

    private fun resetRadioButtonsColors() {
        val defaultColor = Color.WHITE  // Hier auf Weiß geändert
        radioBtn1.setTextColor(defaultColor)
        radioBtn2.setTextColor(defaultColor)
        radioBtn3.setTextColor(defaultColor)
    }

    private fun markCorrectAnswer(correctIndex: Int) {
        resetRadioButtonsColors()
        val correctButton = when(correctIndex) {
            0 -> radioBtn1
            1 -> radioBtn2
            2 -> radioBtn3
            else -> null
        }
        correctButton?.setTextColor(Color.GREEN)
    }
}
