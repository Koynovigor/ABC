package com.example.abc

import android.os.Bundle
import androidx.activity.ComponentActivity
import androidx.activity.compose.setContent
import androidx.navigation.compose.NavHost
import androidx.navigation.compose.composable
import androidx.navigation.compose.rememberNavController
import com.example.abc.ui.theme.ABCTheme
import com.example.tasksmaster.objects.Routes

class MainActivity : ComponentActivity() {

    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        setContent {
            ABCTheme {
                // A surface container using the 'background' color from the theme
                val navController = rememberNavController()
                var item = Item("", 0, 0, 0)
                
                NavHost(
                    navController = navController,
                    startDestination = Routes.START_SCREEN
                ){
                    composable(Routes.START_SCREEN){
                        StartScreen(navController = navController)
                    }

                    composable(Routes.MAIN_SCREEN) {
                        MainScreen(
                            abcImage,
                            onClick = { itemCur ->
                                item = itemCur
                                navController.navigate(Routes.TITLE_SCREEN)
                            },
                        )

                    }

                    composable(Routes.TITLE_SCREEN) {
                        TitleScreen(
                            item = item,
                            navController
                        )
                    }
                }



            }
        }
    }

}

