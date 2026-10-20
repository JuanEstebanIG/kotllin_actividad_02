package com.sena.actividad_02.ui.screen

import androidx.compose.foundation.background
import androidx.compose.foundation.layout.*
import androidx.compose.runtime.Composable
import androidx.compose.ui.Modifier
import androidx.compose.ui.graphics.Color
import androidx.compose.ui.unit.dp
import com.sena.actividad_02.ui.section.CategoriesSection
import com.sena.actividad_02.ui.section.DestinationsSection
import com.sena.actividad_02.ui.section.HeaderSection
import com.sena.actividad_02.ui.section.HeroSection

@Composable
fun HomeScreen() {
    Column(
        modifier = Modifier
            .fillMaxSize()
            .background(Color.White)
    ) {
        HeaderSection()

        Column(
            modifier = Modifier
                .fillMaxWidth()
                .weight(1f)
        ) {
            Spacer(modifier = Modifier.height(16.dp))

            HeroSection()

            Spacer(modifier = Modifier.height(16.dp))

            CategoriesSection()

            Spacer(modifier = Modifier.height(8.dp))

            DestinationsSection(modifier = Modifier.weight(1f))
        }
    }
}
