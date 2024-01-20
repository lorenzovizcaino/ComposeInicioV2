package com.example.composeinicio

import androidx.compose.foundation.background
import androidx.compose.foundation.layout.Box
import androidx.compose.foundation.layout.Column

import androidx.compose.foundation.layout.Row
import androidx.compose.foundation.layout.fillMaxWidth
import androidx.compose.foundation.layout.padding
import androidx.compose.material3.Text
import androidx.compose.runtime.Composable
import androidx.compose.ui.Alignment
import androidx.compose.ui.Modifier
import androidx.compose.ui.graphics.Color
import androidx.compose.ui.res.stringResource
import androidx.compose.ui.text.style.TextAlign
import androidx.compose.ui.tooling.preview.Preview
import androidx.compose.ui.unit.dp
import com.example.composeiniciov2.R

class Ej6_Mix {
    private @Composable
    fun Greeting(name: String, modifier: Modifier = Modifier) {
        Text(text = "$name", modifier = modifier)
    }

    @Preview(
        showSystemUi = true,
        name="MRN ExComposeApp_Column",
//        widthDp= 400,
//        heightDp = 200
    )


    @Composable
    fun Ejercicio6() {
        Box (modifier= Modifier
            .background(Color.Blue)
            .padding(40.dp)){
            Column(modifier = Modifier
                .fillMaxWidth()
                .background(Color.Cyan)){
                Text(modifier=Modifier.align(Alignment.CenterHorizontally),text = stringResource(R.string.hola))
                Text(modifier=Modifier.align(Alignment.CenterHorizontally),text = stringResource(R.string.teis))
                for(i in 0..2){
                    Row(){
                        Text(text = stringResource(id = R.string.hola))
                        Text(modifier=Modifier.fillMaxWidth(),text = stringResource(R.string.teis),textAlign = TextAlign.End)

                    }
                }


            }
        }
    }
}