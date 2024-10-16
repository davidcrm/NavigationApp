package com.example.myapplication.views

import androidx.compose.foundation.layout.Column
import androidx.compose.foundation.layout.padding
import androidx.compose.material.icons.Icons
import androidx.compose.material.icons.filled.ArrowBack
import androidx.compose.material3.CenterAlignedTopAppBar
import androidx.compose.material3.ExperimentalMaterial3Api
import androidx.compose.material3.Scaffold
import androidx.compose.material3.Text
import androidx.compose.material3.TopAppBarDefaults
import androidx.compose.runtime.Composable
import androidx.compose.ui.Modifier
import androidx.compose.ui.graphics.Color
import androidx.navigation.NavController
import com.example.myapplication.components.ActionButton
import com.example.myapplication.components.MainIconButton
import com.example.myapplication.components.NavigationButton
import com.example.myapplication.components.TitleBar
import com.example.myapplication.components.TitleView


@OptIn(ExperimentalMaterial3Api::class)
@Composable
fun DetailView(navController: NavController, id:Int, opcional: String) {
    Scaffold (
        topBar = {
            CenterAlignedTopAppBar(
                title = { TitleBar(name = "DETAIL")},
                colors = TopAppBarDefaults.centerAlignedTopAppBarColors(
                    containerColor = Color.LightGray
                ),
                navigationIcon = {
                    MainIconButton(icon = Icons.Default.ArrowBack) {
                        navController.popBackStack()
                    }
                }
            )
        },
        floatingActionButton = {
            ActionButton()
        }

    ) { innerPadding ->
        Column(modifier = Modifier.padding(innerPadding)){
            DetailHomeView(navController, id, opcional)
        }
    }
}

@Composable
fun DetailHomeView(navController: NavController, id: Int, opcional: String) {

    TitleView(name = "DetailView")
    TitleView(name = id.toString())
    TitleView(name = opcional)
    Column{
        NavigationButton("Ir a Home",Color.LightGray, Color.Black){
            navController.navigate("Home")
        }
    }
}