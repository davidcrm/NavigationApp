package com.example.myapplication.components

import android.service.autofill.OnClickAction
import androidx.compose.material.icons.Icons
import androidx.compose.material.icons.filled.Add
import androidx.compose.material3.Button
import androidx.compose.material3.FloatingActionButton
import androidx.compose.material3.Icon
import androidx.compose.material3.Text
import androidx.compose.runtime.Composable
import androidx.compose.ui.graphics.Color
import androidx.compose.ui.text.font.FontWeight.Companion.Bold
import androidx.compose.ui.unit.sp

@Composable
fun TitleBar(name: String) {
    Text(
        text= name,
        fontSize = 40.sp,
        fontWeight = Bold,
        color = Color.White
    )
}
@Composable
fun ActionButton(){
    FloatingActionButton(
        onClick = {/*TODO*/},
        containerColor = Color.Gray,
        contentColor = Color.White) {
    Icon(
        imageVector = Icons.Default.Add,
        contentDescription = "Agregar")

    }
}
@Composable
fun NavigationButton(){
    Button(onClick = { /*TODO*/ },

        ) {
        Text(text= "Ir a la siguiente pantalla.")
    }
}