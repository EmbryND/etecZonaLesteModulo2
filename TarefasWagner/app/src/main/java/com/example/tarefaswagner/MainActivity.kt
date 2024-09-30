package com.example.tarefaswagner

import android.os.Bundle
import androidx.activity.ComponentActivity
import androidx.activity.compose.setContent
import androidx.compose.foundation.layout.Box
import androidx.compose.foundation.layout.Column
import androidx.compose.foundation.layout.Row
import androidx.compose.foundation.layout.fillMaxSize
import androidx.compose.foundation.layout.padding
import androidx.compose.foundation.layout.wrapContentSize
import androidx.compose.material3.Button
import androidx.compose.material3.Text
import androidx.compose.runtime.Composable
import androidx.compose.ui.Alignment
import androidx.compose.ui.Modifier
import androidx.compose.ui.tooling.preview.Preview
import androidx.compose.ui.unit.dp
import com.example.tarefaswagner.ui.theme.TarefasWagnerTheme

class MainActivity : ComponentActivity() {
    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        setContent {
            TarefasWagnerTheme {
                // Use a Box to center horizontally and align to top
                Box(
                    modifier = Modifier
                        .fillMaxSize()
                        .padding(16.dp)
                ) {
                    Column(
                        modifier = Modifier
                            .align(Alignment.TopCenter) // Align column to top center
                            .wrapContentSize() // Wrap content size to avoid stretching
                    ) {
                        TaskItem(
                            title = "Estudar a bíblia hoje",
                            date = "Data: 10/09/2024"
                        )
                        TaskItem(
                            title = "Comer um pouco antes de ninar",
                            date = "Data: 10/09/2024"
                        )
                        TaskItem(
                            title = "Lavar os pratos antes de dormir",
                            date = "Data: 10/09/2024"
                        )
                    }
                }
            }
        }
    }
}

@Composable
fun TaskItem(title: String, date: String) {
    Column(
        modifier = Modifier
            .padding(bottom = 16.dp)
    ) {
        Text(title)
        Text(date)
        Row {
            Button(onClick = { /* TODO */ }) {
                Text(text = "Editar")
            }
            Button(onClick = { /* TODO */ }) {
                Text(text = "Finalizar")
            }
        }
    }
}

@Composable
fun Greeting(name: String, modifier: Modifier = Modifier) {
    Text(
        text = "Hello $name!",
        modifier = modifier
    )
}

@Preview(showBackground = true)
@Composable
fun GreetingPreview() {
    TarefasWagnerTheme {
        Greeting("Android")
    }
}
