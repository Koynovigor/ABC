package com.example.abc

import androidx.compose.foundation.Image
import androidx.compose.foundation.clickable
import androidx.compose.foundation.layout.Arrangement
import androidx.compose.foundation.layout.fillMaxSize
import androidx.compose.foundation.layout.fillMaxWidth
import androidx.compose.foundation.layout.padding
import androidx.compose.foundation.layout.wrapContentHeight
import androidx.compose.foundation.lazy.grid.GridCells
import androidx.compose.foundation.lazy.grid.LazyVerticalGrid
import androidx.compose.foundation.lazy.grid.items
import androidx.compose.foundation.shape.RoundedCornerShape
import androidx.compose.runtime.Composable
import androidx.compose.ui.Modifier
import androidx.compose.ui.draw.paint
import androidx.compose.ui.draw.shadow
import androidx.compose.ui.layout.ContentScale
import androidx.compose.ui.platform.LocalConfiguration
import androidx.compose.ui.res.painterResource
import androidx.compose.ui.unit.dp


@Composable
fun MainScreen(
    item: List<Item>,
    onClick: (Item) -> Unit,
) {
    val a = LocalConfiguration.current.screenWidthDp
    val b: Int = if (a > 500) 150 else 100
    LazyVerticalGrid(
        columns = GridCells.Adaptive(b.dp),
        verticalArrangement = Arrangement.spacedBy(16.dp),
        horizontalArrangement = Arrangement.spacedBy(16.dp),
        content = {
            items(item) { photo ->
                Image(
                    painter = painterResource(id = photo.imageId),
                    contentDescription = "im",
                    modifier = Modifier
                        .fillMaxWidth()
                        .wrapContentHeight()
                        .shadow(
                            elevation = 8.dp,
                            shape = RoundedCornerShape(8.dp)
                        )
                        .clickable { onClick(photo) }
                )
            }
        },
        modifier = Modifier
            .fillMaxSize()
            .paint(
                painter = painterResource(id = R.drawable.back),
                contentScale = ContentScale.Crop
            )
            .padding(30.dp)
    )

}