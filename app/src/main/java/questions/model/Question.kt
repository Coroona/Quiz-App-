
package com.example.cannaquiz.model

data class Question(
    val question: String,
    val options: List<String>,
    val correctAnswerIndex: Int
)
