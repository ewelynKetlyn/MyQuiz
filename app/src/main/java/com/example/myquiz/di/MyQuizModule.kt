package com.example.myquiz.di

import Interceptor
import com.example.myquiz.data.api.MyQuizService
import com.example.myquiz.data.datasource.MyQuizDataSource
import com.example.myquiz.data.datasource.MyQuizDataSourceImpl
import com.example.myquiz.data.mapper.MyQuizMapper
import com.example.myquiz.data.repository.MyQuizRepositoryImpl
import com.example.myquiz.domain.repository.MyQuizRepository
import com.example.myquiz.domain.usecase.GetQuizUseCase
import com.example.myquiz.presentation.MyQuizViewModel
import com.google.gson.Gson
import com.google.gson.GsonBuilder
import okhttp3.OkHttpClient
import org.koin.androidx.viewmodel.dsl.viewModel
import org.koin.dsl.module
import retrofit2.Retrofit
import retrofit2.adapter.rxjava2.RxJava2CallAdapterFactory
import retrofit2.converter.gson.GsonConverterFactory

private const val BASE_URL = "https://quizapi.io/api/v1/"

val networkModule = module {
    single<Gson> { GsonBuilder().create() }
    single {
        OkHttpClient.Builder()
            .addInterceptor(Interceptor())
            .build()
    }
    single<GsonConverterFactory> { GsonConverterFactory.create(get()) }
    single<RxJava2CallAdapterFactory> {
        RxJava2CallAdapterFactory.create()
    }
    single<Retrofit.Builder> {
        Retrofit.Builder()
            .client(get())
            .addConverterFactory(get<GsonConverterFactory>())
            .addCallAdapterFactory(get<RxJava2CallAdapterFactory>())
    }

    single<Retrofit> {
        get<Retrofit.Builder>()
            .baseUrl(BASE_URL)
            .build()
    }
    single<MyQuizService> {
        get<Retrofit>().create(MyQuizService::class.java)
    }
}
val domainModule = module {
    factory { GetQuizUseCase(get()) }
}

val dataModule = module {
    factory<MyQuizDataSource> { MyQuizDataSourceImpl(get()) }
    factory<MyQuizRepository> { MyQuizRepositoryImpl(get(), MyQuizMapper()) }
}

val presentationModule = module{
    //viewModel {
     //   MyQuizViewModel()
    //}
}