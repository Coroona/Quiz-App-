
package com.example.cannaquiz.model
//Klasse zur Eingliederung der Kategorien
data class Question(
    val question: String,
    val options: List<String>,
    val correctAnswerIndex: Int
)
