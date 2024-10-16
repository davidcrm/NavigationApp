package com.example.myapplication.views

import androidx.compose.foundation.layout.Column
import androidx.compose.foundation.layout.padding
import androidx.compose.material3.Button
import androidx.compose.material3.CenterAlignedTopAppBar
import androidx.compose.material3.ExperimentalMaterial3Api
import androidx.compose.material3.Scaffold
import androidx.compose.material3.TopAppBarDefaults
import androidx.compose.runtime.Composable
import androidx.compose.ui.Modifier
import androidx.compose.ui.graphics.Color
import com.example.myapplication.components.ActionButton
import com.example.myapplication.components.NavigationButton
import com.example.myapplication.components.TitleBar
import com.example.myapplication.components.TitleView


@OptIn(ExperimentalMaterial3Api::class)
@Composable
fun HomeView() {
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
            ContentHomeView()
        }

    }
}

@Composable
fun ContentHomeView() {
    TitleView(name = "HomeView")
    Column {
        NavigationButton()
    }
}