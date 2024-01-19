package com.example.composeiniciov2

import android.os.Bundle
import androidx.activity.ComponentActivity
import androidx.activity.compose.setContent
import androidx.compose.foundation.layout.fillMaxSize
import androidx.compose.material3.MaterialTheme
import androidx.compose.material3.Surface
import androidx.compose.material3.Text
import androidx.compose.runtime.Composable
import androidx.compose.ui.Modifier
import androidx.compose.ui.tooling.preview.Preview
import com.example.composeinicio.Ej6_Mix
import com.example.composeiniciov2.ui.theme.ComposeInicioV2Theme

class MainActivityEj6Mix : ComponentActivity() {
    override fun onCreate(savedInstanceState: Bundle?) {
        var ej6=Ej6_Mix()
        super.onCreate(savedInstanceState)
        setContent {
            ComposeInicioV2Theme {
                // A surface container using the 'background' color from the theme
                Surface(
                    modifier = Modifier.fillMaxSize(),
                    color = MaterialTheme.colorScheme.background
                ) {
                    ej6.Ejercicio6()
                }
            }
        }
    }
}



@Preview(showBackground = true)
@Composable
fun GreetingPreview6() {
    ComposeInicioV2Theme {
        var ej6=Ej6_Mix()
        ej6.Ejercicio6()
    }
}