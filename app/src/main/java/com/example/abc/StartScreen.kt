package com.example.abc

import androidx.compose.foundation.background
import androidx.compose.foundation.clickable
import androidx.compose.foundation.layout.Arrangement
import androidx.compose.foundation.layout.Column
import androidx.compose.foundation.layout.fillMaxSize
import androidx.compose.foundation.layout.fillMaxWidth
import androidx.compose.foundation.layout.padding
import androidx.compose.foundation.layout.size
import androidx.compose.material3.Scaffold
import androidx.compose.material3.Text
import androidx.compose.runtime.Composable
import androidx.compose.ui.Alignment
import androidx.compose.ui.Modifier
import androidx.compose.ui.draw.alpha
import androidx.compose.ui.draw.paint
import androidx.compose.ui.graphics.Color
import androidx.compose.ui.layout.ContentScale
import androidx.compose.ui.res.painterResource
import androidx.compose.ui.text.style.TextAlign
import androidx.compose.ui.unit.dp
import androidx.compose.ui.unit.sp
import androidx.navigation.NavHostController
import com.bumptech.glide.integration.compose.ExperimentalGlideComposeApi
import com.bumptech.glide.integration.compose.GlideImage
import com.example.tasksmaster.objects.Routes

@OptIn(ExperimentalGlideComposeApi::class)
@Composable
fun StartScreen(
    navController: NavHostController
) {
    Scaffold(
        modifier = Modifier
            .paint(
                painter = painterResource(id = R.drawable.back),
                contentScale = ContentScale.Crop
            )
            .fillMaxSize(),
        containerColor = Color.Transparent,
        topBar = {},
        bottomBar = {
            Text(
                text = "by L3on1kL\n" +
                        "beta v 0.1.0",
                modifier = Modifier
                    .fillMaxWidth()
                    .padding(bottom = 5.dp)
                    .alpha(0.4f),
                fontSize = 12.sp,
                textAlign = TextAlign.Center,
                color = Color.Gray
            )
        }
    ) {
        Column(
            modifier = Modifier
                .fillMaxSize()
                .background(Color.Transparent)
                .padding(it),
            horizontalAlignment = Alignment.CenterHorizontally,
            verticalArrangement = Arrangement.Center,
        ) {
            GlideImage(
                model = R.drawable.start,
                contentDescription = "start",
                modifier = Modifier
                    .clickable {
                        navController.navigate(Routes.MAIN_SCREEN)
                    }
                    .size(150.dp)
                    .background(Color.Transparent)
            )
        }

    }
}