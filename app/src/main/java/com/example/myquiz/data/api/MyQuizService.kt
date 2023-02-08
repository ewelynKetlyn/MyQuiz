package com.example.myquiz.data.api

import com.example.myquiz.data.model.MyQuizResponse
import retrofit2.http.GET
import retrofit2.http.Query

interface MyQuizService {
    //perguntar para a Leticia se no GET pode ser /api/v1/questions ou daria algum erro
    @GET("questions")
    suspend fun getQuiz(
        @Query("category") category: String,
        @Query("difficuty") difficuty: String
    ): MyQuizResponse
}