package com.abuzar.catastrophic.interactors

import com.abuzar.catastrophic.data.CatApi
import com.abuzar.catastrophic.data.model.CatModel
import io.reactivex.Observable

class CatUseCase(private val catApi: CatApi) : BaseUseCase<CatModel>() {


    override fun buildUseCaseObservable(): Observable<CatModel> {
        return catApi.fetchCatApi(20,1,"png","Desc")
    }

}