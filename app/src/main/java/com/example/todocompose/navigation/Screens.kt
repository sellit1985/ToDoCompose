package com.example.todocompose.navigation

import androidx.navigation.NavHostController
import com.example.todocompose.util.Action
import com.example.todocompose.util.Constants.LIST_SCREEN
import com.example.todocompose.util.Constants.SPLASH_SCREEN

class Screens(navController: NavHostController) {
    val list: (Action) -> Unit = { action ->
        navController.navigate("list/${action.name}") {
            popUpTo(LIST_SCREEN) { inclusive = true }
        }
    }

    val task: (Int) -> Unit = { taskId ->
        navController.navigate("task/$taskId")
    }

    val splash: () -> Unit = {
        navController.navigate(route = "list/${Action.NO_ACTION.name}") {
            popUpTo(SPLASH_SCREEN) { inclusive = true }
        }
    }
}