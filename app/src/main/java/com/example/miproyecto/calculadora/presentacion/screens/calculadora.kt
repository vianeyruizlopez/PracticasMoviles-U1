package com.example.miproyecto.calculadora.presentacion.screens

import androidx.compose.foundation.background
import androidx.compose.foundation.layout.Box
import androidx.compose.foundation.layout.Column
import androidx.compose.foundation.layout.Row
import androidx.compose.foundation.layout.fillMaxHeight
import androidx.compose.foundation.layout.fillMaxSize
import androidx.compose.foundation.layout.fillMaxWidth
import androidx.compose.foundation.layout.padding
import androidx.compose.material3.Button
import androidx.compose.material3.Text
import androidx.compose.runtime.Composable
import androidx.compose.ui.Alignment
import androidx.compose.ui.Modifier
import androidx.compose.ui.autofill.contentType
import androidx.compose.ui.graphics.Color
import androidx.compose.ui.tooling.preview.Preview
import androidx.compose.ui.unit.dp
import androidx.compose.ui.unit.sp
import com.example.miproyecto.contador.presentacion.screens.ContadorScreen

@Composable
fun Calculadora(){
    Column (modifier = Modifier
        .fillMaxSize()
        .background(color = Color.Black)){
        
        Box(contentAlignment = Alignment.BottomEnd,///ALINEADO ABAJO A LA DERECHA
            modifier = Modifier ///COLUMNA  y 5f representan el 100 porciento de la pantralla
                .weight(2f)///el weight solo  va en el padre ///entonces 1f=20 porciento  en hay que darle dimenciones con la propiedad weinhg
                .background(color = Color.Gray)
                .fillMaxWidth()) {
            Text(
                text = "0",//AQUI VA EL NUMERO QUE SE MUESTRA
                fontSize = 48.sp,///para aumentar el tamaño de letras
                color = Color.White
            )
        }

        Column (
            modifier = Modifier ///COLUMNA  y 5f representan el 100 porciento de la pantralla
                .weight(4f) ///entonces 1f=20 porciento  en hay que darle dimenciones con la propiedad weinhg
                .background(color = Color.White)
                .fillMaxWidth()
        ){
            Row(
                modifier = Modifier.weight(1f)
                    .fillMaxWidth()
                    .weight(1f)
            ) {
                Button(
                    onClick = {},
                    modifier = Modifier
                        .weight(1f)
                        .fillMaxHeight()// Esto hace que se reparta el espacio equitativamente
                        .padding(10.dp)//para dejar los espacios separados delos botones/añade espacio margen interno para que no se toque el borde del componente y otros componentes
                ) {///dp hace que el espacio se vea del mismo tamaño fisico en cualquir telefono
                    Text(text = "7", fontSize =35.sp)
                }

                Button(
                    onClick = {},
                    modifier = Modifier
                        .weight(1f)
                        .padding(10.dp)
                        .fillMaxHeight()
                ) {
                    Text(text = "8", fontSize =35.sp)
                }
                Button(
                    onClick = {},
                    modifier = Modifier
                        .weight(1f)
                        .padding(10.dp)
                        .fillMaxHeight()
                ) {
                    Text(text = "9",fontSize =35.sp)
                }
                Button(
                    onClick = {},
                    modifier = Modifier
                        .weight(1f)
                        .padding(10.dp)
                        .fillMaxHeight()
                ) {
                    Text(text = "/",fontSize =35.sp)
                }
            }

            Row(
                modifier = Modifier.weight(1f).fillMaxWidth()
            ) {
                Button(
                    onClick = {},
                    modifier = Modifier
                        .weight(1f)
                        .padding(10.dp)
                ) {
                    Text(text = "4",fontSize =35.sp)
                }
                Button(
                    onClick = {},
                    modifier = Modifier
                        .weight(1f)
                        .padding(10.dp)
                ) {
                    Text(text = "5")
                }
                Button(
                    onClick = {},
                    modifier = Modifier
                        .weight(1f)
                        .padding(10.dp)
                ) {
                    Text(text = "6")
                }
                Button(
                    onClick = {},
                    modifier = Modifier
                        .weight(1f)
                        .padding(10.dp)
                ) {
                    Text(text = "*")
                }
            }

            Row(
                modifier = Modifier.weight(1f).fillMaxWidth()
            ) {
                Button(
                    onClick = {},
                    modifier = Modifier
                        .weight(1f)
                        .padding(10.dp)
                ) {
                    Text(text = "1")
                }
                Button(
                    onClick = {},
                    modifier = Modifier
                        .weight(1f)
                        .padding(10.dp)
                ) {
                    Text(text = "2")
                }
                Button(
                    onClick = {},
                    modifier = Modifier
                        .weight(1f)
                        .padding(10.dp)
                ) {
                    Text(text = "3")
                }
                Button(
                    onClick = {},
                    modifier = Modifier
                        .weight(1f)
                        .padding(10.dp)
                ) {
                    Text(text = "-")
                }
            }

            Row(
                modifier = Modifier.weight(1f).fillMaxWidth()
            ) {
                Button(
                    onClick = {},
                    modifier = Modifier
                        .weight(1f)
                        .padding(10.dp)
                ) {
                    Text(text = "0")
                }
                Button(
                    onClick = {},
                    modifier = Modifier
                        .weight(1f)
                        .padding(10.dp)
                ) {
                    Text(text = ".")
                }
                Button(
                    onClick = {},
                    modifier = Modifier
                        .weight(1f)
                        .padding(10.dp)
                ) {
                    Text(text = "+")
                }
                Button(
                    onClick = {},
                    modifier = Modifier
                        .weight(1f)
                        .padding(10.dp)
                ) {
                    Text(text = "=")
                }
            }

        }
    }
}
@Preview(showBackground = true)
@Composable
fun CalculadoraScreenPreview(){
    Calculadora()
}