package com.example.atividadewagner300924.view

import androidx.compose.foundation.layout.Column
import androidx.compose.material3.Button
import androidx.compose.material3.Text
import androidx.compose.material3.TextField
import androidx.compose.runtime.Composable
import androidx.compose.runtime.mutableStateOf
import androidx.compose.runtime.remember
import androidx.compose.runtime.setValue
import androidx.compose.runtime.getValue
import androidx.compose.runtime.livedata.observeAsState

@Composable
fun MainGui(meuViewModel: MainGuiViewModel){

    val x: Int by meuViewModel.contador.observeAsState(0)

    var txtfieldValue by remember {
        mutableStateOf("")
    }

    Column {
        Text(text = "asdfghjkn")
        Text(text = "asdfghjkn")
        Text(text = "asdfghjkn")
        TextField(value = x.toString(), onValueChange = {
        })
        Button(onClick = {
            meuViewModel.incrementaContador()
        }) {
            Text(text = "Num Clicks = " + x.toString())
        }
    }
}