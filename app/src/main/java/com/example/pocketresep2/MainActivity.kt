package com.example.pocketresep2

import android.os.Bundle
import androidx.activity.ComponentActivity
import androidx.activity.compose.setContent
import androidx.compose.foundation.Image
import androidx.compose.foundation.background
import androidx.compose.foundation.layout.*
import androidx.compose.foundation.rememberScrollState
import androidx.compose.foundation.shape.RoundedCornerShape
import androidx.compose.foundation.verticalScroll
import androidx.compose.material3.*
import androidx.compose.runtime.Composable
import androidx.compose.ui.Modifier
import androidx.compose.ui.draw.clip
import androidx.compose.ui.graphics.Color
import androidx.compose.ui.layout.ContentScale
import androidx.compose.ui.res.painterResource
import androidx.compose.ui.text.font.FontWeight
import androidx.compose.ui.unit.dp

class MainActivity : ComponentActivity() {
    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        setContent {
            // Kita gunakan skema warna modern
            MaterialTheme(
                colorScheme = lightColorScheme(
                    primary = Color(0xFFE91E63), // Warna Pink/Magenta khas anak muda
                    secondary = Color(0xFF03DAC5),
                    background = Color(0xFFF5F5F5)
                )
            ) {
                Surface(modifier = Modifier.fillMaxSize()) {
                    ResepScreen()
                }
            }
        }
    }
}

@Composable
fun ResepScreen() {
    Column(
        modifier = Modifier
            .fillMaxSize()
            .background(MaterialTheme.colorScheme.background)
            .padding(16.dp)
            .verticalScroll(rememberScrollState())
    ) {
        Text(
            text = "Pocket Resep",
            style = MaterialTheme.typography.headlineMedium,
            fontWeight = FontWeight.ExtraBold,
            color = MaterialTheme.colorScheme.primary
        )
        Text(
            text = "Kreasi Masak Anak Kos",
            style = MaterialTheme.typography.bodyLarge,
            color = Color.Gray
        )
        Spacer(modifier = Modifier.height(20.dp))

        ResepSource.daftarResep.forEach { resep ->
            CardResep(resep)
            Spacer(modifier = Modifier.height(16.dp))
        }
    }
}

@Composable
fun CardResep(resep: Resep) {
    Card(
        modifier = Modifier.fillMaxWidth(),
        elevation = CardDefaults.cardElevation(defaultElevation = 8.dp),
        shape = RoundedCornerShape(20.dp),
        colors = CardDefaults.cardColors(containerColor = Color.White)
    ) {
        Column(modifier = Modifier.padding(16.dp)) {
            Image(
                painter = painterResource(id = resep.imageRes),
                contentDescription = resep.nama,
                modifier = Modifier
                    .fillMaxWidth()
                    .height(180.dp)
                    .clip(RoundedCornerShape(16.dp)),
                contentScale = ContentScale.Crop
            )
            Spacer(modifier = Modifier.height(16.dp))
            Text(
                text = resep.nama,
                style = MaterialTheme.typography.titleLarge,
                fontWeight = FontWeight.Bold,
                color = Color.Black
            )
            Text(
                text = "Bahan: ${resep.bahan}",
                style = MaterialTheme.typography.bodyMedium,
                color = Color.DarkGray
            )
            Text(
                text = "Rp ${resep.harga}",
                style = MaterialTheme.typography.titleMedium,
                fontWeight = FontWeight.ExtraBold,
                color = MaterialTheme.colorScheme.primary
            )
            Spacer(modifier = Modifier.height(12.dp))
            Button(
                onClick = { },
                modifier = Modifier.fillMaxWidth(),
                shape = RoundedCornerShape(12.dp),
                colors = ButtonDefaults.buttonColors(containerColor = MaterialTheme.colorScheme.primary)
            ) {
                Text("Lihat Resep", fontWeight = FontWeight.Bold)
            }
        }
    }
}