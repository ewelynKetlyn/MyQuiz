package com.example.myquiz.data.mapper

import com.example.myquiz.data.model.AnswersResponse
import com.example.myquiz.data.model.CorrectAnswersResponse
import com.example.myquiz.data.model.MyQuizResponse
import com.example.myquiz.data.model.QuizItemResponse
import com.example.myquiz.domain.model.Answers
import com.example.myquiz.domain.model.CorrectAnswers
import com.example.myquiz.domain.model.MyQuiz
import com.example.myquiz.domain.model.QuizItem

internal class MyQuizMapper {
    fun map(response: MyQuizResponse) = MyQuiz(
        myQuiz = response.myQuizResponse.map {
            mapQuizItem(it)
        }
    )

    private fun mapQuizItem(quizItemResponse: QuizItemResponse) = QuizItem(
        answers = mapAnswer(quizItemResponse.answers),
        category = quizItemResponse.category,
        correctAnswers = mapCorrectAnswer(quizItemResponse.correctAnswers),
        description = quizItemResponse.description,
        difficulty = quizItemResponse.difficulty,
        explanation = quizItemResponse.explanation,
        id = quizItemResponse.id,
        multipleCorrectAnswers = quizItemResponse.multipleCorrectAnswers,
        question = quizItemResponse.question,
        tags = quizItemResponse.tags,
        tip = quizItemResponse.tip
    )

    private fun mapAnswer(answerResponse: AnswersResponse) = Answers(
        answerA = answerResponse.answerA,
        answerB = answerResponse.answerB,
        answerC = answerResponse.answerC,
        answerD = answerResponse.answerD,
        answerE = answerResponse.answerE,
        answerF = answerResponse.answerF
    )

    private fun mapCorrectAnswer (correctAnswerResponse: CorrectAnswersResponse) = CorrectAnswers(
        answerACorrect = correctAnswerResponse.answerACorrect,
        answerBCorrect = correctAnswerResponse.answerBCorrect,
        answerCCorrect = correctAnswerResponse.answerCCorrect,
        answerDCorrect = correctAnswerResponse.answerDCorrect,
        answerECorrect = correctAnswerResponse.answerECorrect,
        answerFCorrect = correctAnswerResponse.answerFCorrect
    )
}