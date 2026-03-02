package com.example.pocketresep.model

import androidx.annotation.DrawableRes

data class Resep(
    val nama: String,
    val deskripsi: String,
    val estimasiHarga: Int,
    @DrawableRes val imageRes: Int
)