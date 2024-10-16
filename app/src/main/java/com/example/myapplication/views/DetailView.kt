package com.example.myapplication.views

import androidx.compose.foundation.layout.Column
import androidx.compose.foundation.layout.padding
import androidx.compose.material3.CenterAlignedTopAppBar
import androidx.compose.material3.ExperimentalMaterial3Api
import androidx.compose.material3.Scaffold
import androidx.compose.material3.TopAppBarDefaults
import androidx.compose.runtime.Composable
import androidx.compose.ui.Modifier
import androidx.compose.ui.graphics.Color
import androidx.navigation.NavController
import com.example.myapplication.components.ActionButton
import com.example.myapplication.components.NavigationButton
import com.example.myapplication.components.TitleBar
import com.example.myapplication.components.TitleView


@OptIn(ExperimentalMaterial3Api::class)
@Composable
fun DetailView(navController: NavController, id:Int) {
    Scaffold (
        topBar = {
            CenterAlignedTopAppBar(
                title = { TitleBar(name = "DETAIL" )},
                colors = TopAppBarDefaults.centerAlignedTopAppBarColors(
                    containerColor = Color.LightGray
                )
            )
        },
        floatingActionButton = {
            ActionButton()
        }

    ) { innerPadding ->
        Column(modifier = Modifier.padding(innerPadding)){
            DetailHomeView(navController, id)
        }
    }
}

@Composable
fun DetailHomeView(navController: NavController, id: Int) {
    TitleView(name = "DetailView")
    TitleView(name = id.toString())
    Column{
        NavigationButton("Ir a Home",Color.LightGray, Color.Black){
            navController.navigate("Home")
        }
    }
}