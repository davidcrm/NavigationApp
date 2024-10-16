package com.example.myapplication.navigation

import androidx.compose.runtime.Composable
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
            }
        )){
            DetailView(navController, id)
        }
    }
}