package com.example.myquiz.data.model

import com.google.gson.annotations.SerializedName

//https://quizapi.io/api/v1/questions?apiKey=wSa9ePXknzfhcjxatgdpzQfzmJsZD3AxOc9LQIKY&limit=1

data class MyQuizResponse(
    val myQuizResponse: List<QuizItemResponse>
)

data class QuizItemResponse(
    @SerializedName("answers")val answers: AnswersResponse,
    @SerializedName("category")val category: String,
    @SerializedName("correct_answers") val correctAnswers: CorrectAnswersResponse,
    @SerializedName("description")val description: String,
    @SerializedName("difficulty")val difficulty: String,
    @SerializedName("explanation")val explanation: String,
    @SerializedName("id")val id: Int,
    @SerializedName("multiple_correct_answers") val multipleCorrectAnswers: String,
    @SerializedName("question")val question: String,
    @SerializedName("tags")val tags: List<Any>,
    @SerializedName("tip")val tip: Any
)

data class AnswersResponse(
    @SerializedName("answer_a") val answerA: String,
    @SerializedName("answer_b") val answerB: String,
    @SerializedName("answer_c") val answerC: String,
    @SerializedName("answer_d") val answerD: String,
    @SerializedName("answer_e") val answerE: Any,
    @SerializedName("answer_f") val answerF: Any
)

data class CorrectAnswersResponse(
    @SerializedName("answer_a_correct") val answerACorrect: String,
    @SerializedName("answer_b_correct") val answerBCorrect: String,
    @SerializedName("answer_c_correct") val answerCCorrect: String,
    @SerializedName("answer_d_correct") val answerDCorrect: String,
    @SerializedName("answer_e_correct") val answerECorrect: String,
    @SerializedName("answer_f_correct") val answerFCorrect: String
)