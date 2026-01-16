package com.example.miproyecto.login.presentacion.screens

import androidx.compose.foundation.Image
import androidx.compose.foundation.layout.*
import androidx.compose.material3.*
import androidx.compose.runtime.*
import androidx.compose.ui.Alignment
import androidx.compose.ui.Modifier
import androidx.compose.ui.res.painterResource
import androidx.compose.ui.tooling.preview.Preview
import androidx.compose.ui.unit.dp
import com.example.miproyecto.R

@Composable
fun LoginScreen() {
    // Variables en español
    val nombreUsuario = remember { mutableStateOf("") }
    val contrasena = remember { mutableStateOf("") }

    Column(
        verticalArrangement = Arrangement.Center,
        horizontalAlignment = Alignment.CenterHorizontally,
        modifier = Modifier.fillMaxSize()
    ) {
        Image(
            modifier = Modifier.size(150.dp),
            painter = painterResource(id = R.drawable.ic_launcher_background),
            contentDescription = "Logo de mi app"
        )

        Spacer(modifier = Modifier.height(40.dp))

        TextField(
            modifier = Modifier
                .fillMaxWidth()
                .padding(horizontal = 10.dp),
            value = nombreUsuario.value,
            onValueChange = { nombreUsuario.value = it },
            placeholder = { Text("Usuario") }
        )

        Spacer(modifier = Modifier.height(10.dp))

        TextField(
            modifier = Modifier
                .fillMaxWidth()
                .padding(horizontal = 10.dp),
            value = contrasena.value,
            onValueChange = { contrasena.value = it },
            placeholder = { Text("Contraseña") }
        )

        Spacer(modifier = Modifier.height(20.dp))

        Button(
            modifier = Modifier
                .fillMaxWidth()
                .padding(horizontal = 10.dp),
            onClick = { /* Acción al entrar */ }
        ) {
            Text("Iniciar sesión")
        }
    }
}

@Preview(showBackground = true)
@Composable
fun LoginScreenPreview() {
    LoginScreen()
}
