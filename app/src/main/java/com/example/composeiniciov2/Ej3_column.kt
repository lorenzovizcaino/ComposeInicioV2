package com.example.composeiniciov2


import androidx.compose.foundation.background
import androidx.compose.foundation.layout.Arrangement
import androidx.compose.foundation.layout.Column
import androidx.compose.foundation.layout.fillMaxHeight
import androidx.compose.foundation.layout.fillMaxSize
import androidx.compose.material3.Text
import androidx.compose.runtime.Composable
import androidx.compose.ui.Alignment
import androidx.compose.ui.Modifier
import androidx.compose.ui.graphics.Color
import androidx.compose.ui.tooling.preview.Preview

class Ej3_column {
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
    fun ColumnPreview(){
        Column(
            modifier=Modifier.fillMaxSize(),//lo que ocupa
            //Definición posición vertical
            //En vez de verticalArrangement se podrían aplicar pesos weight en este caso en los Greeting()

            //verticalArrangement = Arrangement.SpaceAround,//cómo se colocan de forma vertical los eltos
            verticalArrangement = Arrangement.SpaceEvenly,//->en función del espacio que tienen(dejando encima y debajo)
            //verticalArrangement = Arrangement.SpaceBetween,//->mismo espacio entre cada uno los huecos(sin espacio encima 1erElto ni debajo últimoElto)
            //verticalArrangement = Arrangement.SpaceAround,//->como Evenly pero dejando mismo espacio encima primero y debajo último (siendo la mitad que el q existe entre eltos)
            //Definición posición horizontal
            horizontalAlignment = Alignment.CenterHorizontally
        )
        {
            Greeting(
                name = "Texto1",
                modifier =Modifier
                    .background(Color.Red)
                    .weight(1f)
            )
            Greeting(
                name = "Texto2",
                modifier =Modifier
                    .fillMaxSize()
                    .background(Color.Yellow)
                    .weight(1f)

            )
            Greeting(
                name = "Texto3",
                modifier =Modifier
                    .background(Color.Green)
                    .weight(2f)
            )
        }
    }
}