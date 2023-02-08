package com.example.myquiz.data.datasource

import com.example.myquiz.data.model.MyQuizResponse
import kotlinx.coroutines.flow.Flow

internal interface MyQuizDataSource {
    fun getMyQuiz(category: String, difficulty: String): Flow<MyQuizResponse>
}