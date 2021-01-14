package com.abuzar.catastrophic.data

import com.abuzar.catastrophic.data.model.CatModel
import io.reactivex.Observable
import retrofit2.http.GET
import retrofit2.http.Query

interface CatApi {

    @GET("v1/images/search")
    fun fetchCatApi(@Query("limit") limit: Int,@Query("page") page : Int, @Query("mime_types") type : String, @Query("order")order : String): Observable<CatModel>

}