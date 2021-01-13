package com.abuzar.catastrophic.injection

import com.abuzar.catastrophic.R
import com.abuzar.catastrophic.data.CatApi
import org.koin.android.ext.koin.androidContext
import org.koin.dsl.module.module
import retrofit2.Retrofit
import retrofit2.adapter.rxjava2.RxJava2CallAdapterFactory
import retrofit2.converter.gson.GsonConverterFactory
import retrofit2.create

val viewModelModule = module {


}

val dataModule = module {

    single {

        val retrofit = Retrofit.Builder()
                .addCallAdapterFactory(RxJava2CallAdapterFactory.create())
                .addConverterFactory(GsonConverterFactory.create())
                .baseUrl(androidContext().getString(R.string.baseUrl))
                .build()

        retrofit.create(CatApi::class.java)
    }
}