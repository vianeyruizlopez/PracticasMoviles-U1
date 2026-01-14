package com.example.miproyecto.login.presentacion.screens
import androidx.compose.foundation.Image
import androidx.compose.foundation.layout.Arrangement
import androidx.compose.foundation.layout.Box
import androidx.compose.foundation.layout.Column
import androidx.compose.foundation.layout.Row
import androidx.compose.foundation.layout.Spacer
import androidx.compose.foundation.layout.fillMaxSize
import androidx.compose.foundation.layout.fillMaxWidth
import androidx.compose.foundation.layout.height
import androidx.compose.foundation.layout.size
import androidx.compose.material3.Button
import androidx.compose.material3.Text
import androidx.compose.material3.TextField
import androidx.compose.runtime.Composable
import androidx.compose.runtime.mutableStateOf
import androidx.compose.runtime.remember
import androidx.compose.ui.Alignment
import androidx.compose.ui.Modifier
import androidx.compose.ui.res.painterResource
import androidx.compose.ui.tooling.preview.Preview
import androidx.compose.ui.unit.dp
import com.example.miproyecto.R
import androidx.compose.foundation.layout.padding

@Composable
fun LoginScreen() {

    var username= remember {  mutableStateOf(value = "")}
    var password= remember {  mutableStateOf(value = "")}


    Column(verticalArrangement = Arrangement.Center,
        horizontalAlignment = Alignment.CenterHorizontally,
        modifier = Modifier.fillMaxSize()) {

        Image(modifier = Modifier.size(150.dp) ,
            painter = painterResource(id= R.drawable.ic_launcher_background),
            contentDescription = "Logo de mi app")

        Spacer(modifier = Modifier.height(40.dp))

       TextField(modifier = Modifier.fillMaxWidth()
           .padding(horizontal =10.dp),
           value = username.value, /// recorddar la como ,
           onValueChange = {username.value = it }, ///it es
           placeholder = { Text("Usuario") }/// muestra el componente pero cunado se escribe se termina
       )
        Spacer(modifier = Modifier.height(40.dp))

        TextField(modifier = Modifier.fillMaxWidth()
            .padding(horizontal =10.dp),
            value = password.value, /// recorddar la como ,
            onValueChange = {password.value = it }, ///it es
            placeholder = { Text("password") }/// muestra el componente pero cunado se escribe se termina
        )
        Spacer(modifier = Modifier.height(40.dp))

        Button(
          modifier = Modifier.fillMaxWidth()
              .padding(horizontal =10.dp),
                  onClick = {}
      ){
          Text("Login")
      }
      ///  Text("hola mundo")/// es un hijo que esta dentro del componente padre
    }
    Row() { }
    Box() { }
}


@Preview (showBackground = true)
@Composable
fun LoginScreenPreview() {
    LoginScreen()
}

