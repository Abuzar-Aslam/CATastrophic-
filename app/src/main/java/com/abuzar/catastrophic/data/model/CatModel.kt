package com.abuzar.catastrophic.data.model

import android.os.Parcelable
import kotlinx.android.parcel.Parcelize

@Parcelize
data class CatModel(val id: String, val url: StringBuffer, val width: Int, val height: Int) :
    Parcelable