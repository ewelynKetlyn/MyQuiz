package com.example.myquiz.domain.repository

import com.example.myquiz.data.model.MyQuizResponse
import com.example.myquiz.domain.model.MyQuiz
import kotlinx.coroutines.flow.Flow

internal interface MyQuizRepository {
    fun getMyQuiz(category:String, difficulty:String ): Flow<MyQuiz>
}