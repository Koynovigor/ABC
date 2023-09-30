package com.example.abc

import android.media.MediaPlayer
import androidx.compose.foundation.Image
import androidx.compose.foundation.clickable
import androidx.compose.foundation.layout.fillMaxSize
import androidx.compose.runtime.Composable
import androidx.compose.ui.Modifier
import androidx.compose.ui.res.painterResource
import 	android.speech.tts.TextToSpeech
import androidx.compose.ui.platform.LocalContext

@Composable
fun TitleScreen(
    item: Item
){
    val mContext = LocalContext.current
    val mMediaPlayer = MediaPlayer.create(mContext, R.raw.vl1)
    Image(
        painter = painterResource(id = item.imageId),
        contentDescription = "im",
        modifier = Modifier
            .fillMaxSize()
            .clickable {
                mMediaPlayer.start()
            }


    )
}