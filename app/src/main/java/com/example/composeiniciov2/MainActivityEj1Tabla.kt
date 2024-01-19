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
import com.example.composeiniciov2.ui.theme.ComposeInicioV2Theme

class MainActivityEj1Tabla : ComponentActivity() {
    var ej1=Ej1_TablaMultiplicar()
    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        setContent {
            ComposeInicioV2Theme {
                // A surface container using the 'background' color from the theme
                Surface(
                    modifier = Modifier.fillMaxSize(),
                    color = MaterialTheme.colorScheme.background
                ) {
                    ej1.TablaMultiplicar()
                }
            }
        }
    }
}



@Preview(showBackground = true)
@Composable
fun GreetingPreview4() {
    ComposeInicioV2Theme {
        var ej1=Ej1_TablaMultiplicar()
        ej1.TablaMultiplicar()
    }
}