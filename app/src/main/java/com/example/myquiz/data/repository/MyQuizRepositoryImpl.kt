package com.example.myquiz.data.repository

import com.example.myquiz.data.datasource.MyQuizDataSource
import com.example.myquiz.data.mapper.MyQuizMapper
import com.example.myquiz.data.model.MyQuizResponse
import com.example.myquiz.domain.model.MyQuiz
import com.example.myquiz.domain.repository.MyQuizRepository
import kotlinx.coroutines.flow.Flow
import kotlinx.coroutines.flow.map

internal class MyQuizRepositoryImpl(
    private val myQuizDataSource: MyQuizDataSource,
    private val myQuizMapper: MyQuizMapper,
    ) : MyQuizRepository {
    override fun getMyQuiz(category: String, difficulty: String): Flow<MyQuiz> =
        myQuizDataSource.getMyQuiz(category, difficulty).map { myQuizMapper.map(it) }
}