package com.example.atividadewagner300924

import android.os.Bundle
import androidx.activity.ComponentActivity
import androidx.activity.compose.setContent
import androidx.activity.enableEdgeToEdge
import androidx.compose.foundation.layout.fillMaxSize
import androidx.compose.foundation.layout.padding
import androidx.compose.material3.Scaffold
import androidx.compose.material3.Text
import androidx.compose.runtime.Composable
import androidx.compose.ui.Modifier
import androidx.compose.ui.tooling.preview.Preview
import com.example.atividadewagner300924.ui.theme.AtividadeWagner300924Theme
import com.example.atividadewagner300924.view.MainGui
import com.example.atividadewagner300924.view.MainGuiViewModel

class MainActivity : ComponentActivity() {
    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        val meuViewModel = MainGuiViewModel()
        enableEdgeToEdge()
        setContent {
            AtividadeWagner300924Theme {
                Scaffold(modifier = Modifier.fillMaxSize()) { innerPadding ->
                    MainGui(meuViewModel)
                }
            }
        }
    }
}
