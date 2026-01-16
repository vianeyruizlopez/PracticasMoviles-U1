package com.example.miproyecto.contador.presentacion

import androidx.compose.foundation.background
import androidx.compose.foundation.layout.Box
import androidx.compose.foundation.layout.Column
import androidx.compose.foundation.layout.fillMaxSize
import androidx.compose.foundation.layout.fillMaxWidth
import androidx.compose.foundation.layout.padding
import androidx.compose.material3.Button
import androidx.compose.material3.Text
import androidx.compose.runtime.Composable
import androidx.compose.ui.Alignment
import androidx.compose.ui.Modifier
import androidx.compose.ui.graphics.Color
import androidx.compose.ui.tooling.preview.Preview
import androidx.compose.ui.unit.dp
import androidx.compose.ui.unit.sp

@Composable///todos los composeibols empiezan con fun
fun ContadorScreen(viewModel: ContadorViewModel = viewModel()){/// tengo que pasarle
    Column(modifier = Modifier /// se avilita el modifier
        .fillMaxSize()
        .background(color = Color.Blue)) {///ESTAMOS DICIENDO QUE ESTA PANTALLA TIENE UN VALOR D 100 PORCIENTO EN VERTICAL, ENTONCES SE COLOCO HIJOS EN ESA
        Box(contentAlignment = Alignment.Center,
            modifier = Modifier ///COLUMNA  y 5f representan el 100 porciento de la pantralla
            .weight(1f) ///entonces 1f=20 porciento  en hay que darle dimenciones con la propiedad weinhg
            .background(color = Color.Red)
            .fillMaxWidth()){/// para el apantalla dividida
            Text(text = "0",
            fontSize = 20.sp,
                color = Color.Green
            )
        }
        Box(contentAlignment = Alignment.Center, /// contentAlignmen es el tipo de dato
            modifier = Modifier
            .weight(1f)
            .background(color = Color.Black)
            .fillMaxWidth()){///para tener bien distribuido los elementos
            /// para el apantalla dividida
            Button(
                modifier = Modifier
                    .fillMaxWidth()
                    .padding(horizontal = 10.dp),
                onClick = {}) {
                Text(text = "Incrementar")
            }

            }
        }


    }
@Preview(showBackground = true)
@Composable
fun ContadorScreenPreview(){
    ContadorScreen()
}