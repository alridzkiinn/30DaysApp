package com.example.nim234311031.a30daysapp

import androidx.annotation.DrawableRes
import androidx.annotation.StringRes

data class Deskripsi(
    @DrawableRes val imageResourceId: Int,
    @StringRes val title: Int,
    val day: Int,
    @StringRes val description: Int
)



val tips = listOf(
    Deskripsi(R.drawable.a1, R.string.desc1, 1, R.string.description1),
    Deskripsi(R.drawable.a2, R.string.desc2, 2, R.string.description2),
    Deskripsi(R.drawable.a3, R.string.desc3, 3, R.string.description3),
    Deskripsi(R.drawable.a4, R.string.desc4, 4, R.string.description4),
    Deskripsi(R.drawable.a5, R.string.desc5, 5, R.string.description5),
    Deskripsi(R.drawable.a6, R.string.desc6, 6, R.string.description6),
    Deskripsi(R.drawable.a7, R.string.desc7, 7, R.string.description7),
    Deskripsi(R.drawable.a8, R.string.desc8, 8, R.string.description8),
    Deskripsi(R.drawable.a9, R.string.desc9, 9, R.string.description9),
    Deskripsi(R.drawable.a10, R.string.desc10, 10, R.string.description10),
    )