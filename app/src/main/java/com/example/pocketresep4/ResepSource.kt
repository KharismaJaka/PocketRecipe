package com.example.pocketresep4

import com.example.pocketresep4.Resep

object ResepSource {
    val daftarResep = listOf(
        Resep(
            "Nasi Goreng Spesial",
            "Nasi, kecap, bawang, telur",
            "12.000",
            R.drawable.nasi_goreng
        ),
        Resep("Mie Instan Kreatif", "Mie, sawi, telur, cabai", "8.000", R.drawable.mie_instan),
        Resep(
            "Telur Dadar Crispy",
            "Telur, tepung, bumbu penyedap",
            "5.000",
            R.drawable.telur_dadar
        ),
        Resep("Orak-Arik Sayur", "Wortel, buncis, telur, bawang", "7.000", R.drawable.orak_arik),
        Resep(
            "Tumis Kangkung",
            "Kangkung, bawang putih, saus tiram",
            "6.000",
            R.drawable.tumis_kangkung
        )
    )
}