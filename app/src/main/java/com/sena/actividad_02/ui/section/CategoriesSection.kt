package com.sena.actividad_02.ui.section

import androidx.compose.foundation.layout.PaddingValues
import androidx.compose.foundation.lazy.LazyRow
import androidx.compose.material.icons.Icons
import androidx.compose.material.icons.rounded.*
import androidx.compose.runtime.Composable
import androidx.compose.ui.graphics.Color
import androidx.compose.ui.unit.dp
import com.sena.actividad_02.ui.composable.CategoryItem

@Composable
fun CategoriesSection() {
    val categories = listOf(
        Triple(Icons.Rounded.Terrain, "Montaña", Color(0xFFEDE7F6) to Color(0xFF7E57C2)),
        Triple(Icons.Rounded.Park, "Bosque", Color(0xFFE8F5E9) to Color(0xFF4CAF50)),
        Triple(Icons.Rounded.BeachAccess, "Playa", Color(0xFFE3F2FD) to Color(0xFF2196F3)),
        Triple(Icons.Rounded.AccountBalance, "Ciudad", Color(0xFFFFF3E0) to Color(0xFFFF9800)),
        Triple(Icons.Rounded.Favorite, "Favoritos", Color(0xFFFCE4EC) to Color(0xFFE91E63))
    )

    LazyRow(
        contentPadding = PaddingValues(horizontal = 20.dp),
    ) {
        items(categories.size) { index ->
            val category = categories[index]
            CategoryItem(
                icon = category.first,
                text = category.second,
                backgroundColor = category.third.first,
                iconColor = category.third.second
            )
        }
    }
}
