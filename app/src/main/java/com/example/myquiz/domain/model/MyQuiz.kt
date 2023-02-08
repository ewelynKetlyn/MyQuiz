package com.example.myquiz.domain.model

data class MyQuiz(
    val myQuiz: List<QuizItem>
)

data class QuizItem(
    val answers: Answers,
    val category: String,
    val correctAnswers: CorrectAnswers,
    val description: String,
    val difficulty: String,
    val explanation: String,
    val id: Int,
    val multipleCorrectAnswers: String,
    val question: String,
    val tags: List<Any>,
    val tip: Any
)

data class Answers(
    val answerA: String,
    val answerB: String,
    val answerC: String,
    val answerD: String,
    val answerE: Any,
    val answerF: Any
)

data class CorrectAnswers(
    val answerACorrect: String,
    val answerBCorrect: String,
    val answerCCorrect: String,
    val answerDCorrect: String,
    val answerECorrect: String,
    val answerFCorrect: String
)