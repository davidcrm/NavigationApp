package com.example.myapplication.views

import androidx.compose.foundation.layout.Column
import androidx.compose.foundation.layout.padding
import androidx.compose.material3.Button
import androidx.compose.material3.CenterAlignedTopAppBar
import androidx.compose.material3.ExperimentalMaterial3Api
import androidx.compose.material3.Scaffold
import androidx.compose.material3.TopAppBarDefaults
import androidx.compose.runtime.Composable
import androidx.compose.ui.Alignment
import androidx.compose.ui.Modifier
import androidx.compose.ui.graphics.Color
import androidx.navigation.NavController
import com.example.myapplication.components.ActionButton
import com.example.myapplication.components.NavigationButton
import com.example.myapplication.components.TitleBar
import com.example.myapplication.components.TitleView


@OptIn(ExperimentalMaterial3Api::class)
@Composable
fun HomeView(navController: NavController) {
    Scaffold (
        topBar = {
            CenterAlignedTopAppBar(
                title = { TitleBar(name = "HOME" )},
                colors = TopAppBarDefaults.centerAlignedTopAppBarColors(
                    containerColor = Color.Gray
                )
        )
        },
        floatingActionButton = {
            ActionButton()
        }

    ) { innerPadding ->
        Column(modifier = Modifier.padding(innerPadding)){
            ContentHomeView(navController)
        }

    }
}

@Composable
fun ContentHomeView(navController: NavController) {
    val id = 1
    TitleView(name = "HomeView")
    Column{
        NavigationButton("Ir a la siguiente pantalla",Color.Gray, Color.White){
            navController.navigate("Detail/${id}")
        }
    }
}