package com.example.myquiz.domain.usecase

import com.example.myquiz.domain.model.MyQuiz
import com.example.myquiz.domain.repository.MyQuizRepository
import kotlinx.coroutines.flow.Flow

internal class GetQuizUseCase(
    private val myQuizRepository: MyQuizRepository
) {
    operator fun invoke(category: String, difficulty: String): Flow<MyQuiz> {
        return myQuizRepository.getMyQuiz(category, difficulty)
    }
}