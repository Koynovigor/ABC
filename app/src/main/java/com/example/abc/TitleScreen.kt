package com.example.abc

import android.media.MediaPlayer
import androidx.compose.foundation.clickable
import androidx.compose.foundation.layout.Arrangement
import androidx.compose.foundation.layout.fillMaxSize
import androidx.compose.runtime.Composable
import androidx.compose.ui.Modifier
import androidx.compose.ui.res.painterResource
import androidx.compose.foundation.layout.Column
import androidx.compose.foundation.layout.Row
import androidx.compose.foundation.layout.fillMaxWidth
import androidx.compose.foundation.layout.offset
import androidx.compose.foundation.layout.padding
import androidx.compose.foundation.layout.size
import androidx.compose.foundation.shape.RoundedCornerShape
import androidx.compose.material.icons.Icons
import androidx.compose.material.icons.filled.KeyboardArrowLeft
import androidx.compose.material.icons.filled.KeyboardArrowRight
import androidx.compose.material3.Card
import androidx.compose.material3.CardDefaults
import androidx.compose.material3.CenterAlignedTopAppBar
import androidx.compose.material3.ExperimentalMaterial3Api
import androidx.compose.material3.Icon
import androidx.compose.material3.Scaffold
import androidx.compose.material3.TopAppBarDefaults
import androidx.compose.runtime.getValue
import androidx.compose.runtime.mutableStateOf
import androidx.compose.runtime.remember
import androidx.compose.runtime.setValue
import androidx.compose.ui.Alignment
import androidx.compose.ui.draw.paint
import androidx.compose.ui.graphics.Color
import androidx.compose.ui.layout.ContentScale
import androidx.compose.ui.platform.LocalContext
import androidx.compose.ui.unit.dp
import androidx.navigation.NavHostController

import com.bumptech.glide.integration.compose.ExperimentalGlideComposeApi
import com.bumptech.glide.integration.compose.GlideImage

@OptIn(ExperimentalMaterial3Api::class, ExperimentalGlideComposeApi::class)
@Composable
fun TitleScreen(
    item: Item,
    navController: NavHostController
){
    var stateItem by remember {
        mutableStateOf(item)
    }
    val mContext = LocalContext.current
    val mMediaPlayer = MediaPlayer.create(mContext, stateItem.voiceId)
    Scaffold(
        topBar = {
            CenterAlignedTopAppBar(
                title = {
                    GlideImage(
                        model = R.drawable.home,
                        contentDescription = "home",
                        modifier = Modifier
                            .size(60.dp)
                            .clickable {
                                navController.navigateUp()
                            },
                    )
                },
                colors = TopAppBarDefaults.topAppBarColors(
                    containerColor = Color.Transparent,
                    scrolledContainerColor = Color.Transparent,
                    navigationIconContentColor = Color.White,
                    titleContentColor = Color.White,
                    actionIconContentColor= Color.Black
                )
            )
        },
        containerColor = Color.Transparent,
        modifier = Modifier.paint(
            painter = painterResource(id = R.drawable.back),
            contentScale = ContentScale.Crop
        )
    ) {
        Column(
            horizontalAlignment = Alignment.CenterHorizontally,
            modifier = Modifier
                .fillMaxSize()
                .padding(it)
        ) {
            Card(
                shape = RoundedCornerShape(8.dp),
                elevation = CardDefaults.elevatedCardElevation(8.dp),
                modifier = Modifier
                    .padding(
                        top = 0.dp,
                        bottom = 8.dp,
                        start = 8.dp,
                        end = 8.dp
                    )
            )  {
                Row(
                    horizontalArrangement = Arrangement.SpaceBetween,
                    verticalAlignment = Alignment.CenterVertically,
                    modifier = Modifier
                        .fillMaxWidth()
                        .paint(
                            painter = painterResource(id = stateItem.imageId)
                        )
                ) {
                    Icon(
                        imageVector = Icons.Default.KeyboardArrowLeft,
                        contentDescription = "left",
                        modifier = Modifier
                            .size(50.dp)
                            .clickable {
                                stateItem = prevItem(stateItem)
                            }
                    )
                    Icon(
                        imageVector = Icons.Default.KeyboardArrowRight,
                        contentDescription = "right",
                        modifier = Modifier
                            .size(50.dp)
                            .clickable {
                                stateItem = nextItem(stateItem)
                            }
                    )
                }
            }
            Icon(
                painter = painterResource(id = R.drawable.outline_volume_up_24),
                contentDescription = "vol",
                modifier = Modifier
                    .clickable {
                        mMediaPlayer.start()
                    }
                    .size(150.dp)
            )
        }
    }
}