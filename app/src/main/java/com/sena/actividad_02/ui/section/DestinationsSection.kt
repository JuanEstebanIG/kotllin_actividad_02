package com.sena.actividad_02.ui.section

import androidx.compose.foundation.layout.*
import androidx.compose.foundation.lazy.LazyColumn
import androidx.compose.material3.Text
import androidx.compose.runtime.Composable
import androidx.compose.ui.Alignment
import androidx.compose.ui.Modifier
import androidx.compose.ui.graphics.Color
import androidx.compose.ui.text.font.FontWeight
import androidx.compose.ui.unit.dp
import androidx.compose.ui.unit.sp
import com.sena.actividad_02.R
import com.sena.actividad_02.ui.composable.DestinationItem

@Composable
fun DestinationsSection(modifier: Modifier = Modifier) {
    Column(modifier = modifier.padding(horizontal = 20.dp)) {
        Row(
            modifier = Modifier
                .fillMaxWidth()
                .padding(vertical = 16.dp),
            horizontalArrangement = Arrangement.SpaceBetween,
            verticalAlignment = Alignment.CenterVertically
        ) {
            Text(
                text = "Destinos populares",
                fontSize = 18.sp,
                fontWeight = FontWeight.Bold
            )
            Text(
                text = "Ver todos",
                fontSize = 14.sp,
                color = Color(0xFF5E35B1),
                fontWeight = FontWeight.Medium
            )
        }

        LazyColumn(
            modifier = Modifier.fillMaxSize()
        ) {
            item {
                DestinationItem(
                    imageRes = R.drawable.lago,
                    title = "Laguna Azul",
                    category = "Naturaleza",
                    rating = "4.8",
                    description = "Un paraíso natural rodeado\nde montañas."
                )
            }
            item {
                DestinationItem(
                    imageRes = R.drawable.playa,
                    title = "Playa del Sol",
                    category = "Playa",
                    rating = "4.6",
                    description = "Aguas cristalinas y arena blanca."
                )
            }
            item {
                DestinationItem(
                    imageRes = R.drawable.catedral,
                    title = "Centro Histórico",
                    category = "Cultura",
                    rating = "4.7",
                    description = "Historia y arquitectura\nen un solo lugar."
                )
            }
        }
    }
}
