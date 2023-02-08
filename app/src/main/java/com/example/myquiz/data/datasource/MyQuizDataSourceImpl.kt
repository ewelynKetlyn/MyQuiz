package com.example.myquiz.data.datasource

import com.example.myquiz.data.api.MyQuizService
import com.example.myquiz.data.model.MyQuizResponse
import kotlinx.coroutines.flow.Flow
import kotlinx.coroutines.flow.flow

class MyQuizDataSourceImpl(private val myQuizService: MyQuizService) : MyQuizDataSource {
    override fun getMyQuiz(category: String, difficulty: String): Flow<MyQuizResponse> = flow {
        emit(myQuizService.getQuiz(category, difficulty))
    }
}