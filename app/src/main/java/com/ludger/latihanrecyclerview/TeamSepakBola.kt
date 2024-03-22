package com.ludger.latihanrecyclerview

import android.os.Parcelable
import kotlinx.parcelize.Parcelize

@Parcelize
data class TeamSepakBola(
    var nama : String,
    var description : String,
    var logo : Int
)   : Parcelable
