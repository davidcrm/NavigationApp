package com.example.myapplication.navigation

import androidx.compose.runtime.Composable
import androidx.compose.runtime.mutableStateMapOf
import androidx.compose.runtime.mutableStateOf
import androidx.compose.runtime.remember
import androidx.navigation.NavType
import androidx.navigation.compose.NavHost
import androidx.navigation.compose.composable
import androidx.navigation.compose.rememberNavController
import androidx.navigation.navArgument
import com.example.myapplication.views.DetailView
import com.example.myapplication.views.HomeView

@Composable
fun NavManager(){
    val navController = rememberNavController()
    NavHost(navController = navController, startDestination = "Home") {
        composable("Home"){
            HomeView(navController)
        }
        // Ruta que acepta un id de tipo entero
        composable("Detail/{id}", arguments = listOf(
            //Se declara con NavArgument
            navArgument(name = "id"){
                type = NavType.IntType
            },
            navArgument("opcional"){
                type = NavType.StringType
            }
        )){
            val id = it.arguments?.getInt("id")?: 0
            var opcional = it.arguments?.getString("opcional")?: ""
            DetailView(navController, id, opcional)
        }
    }
}