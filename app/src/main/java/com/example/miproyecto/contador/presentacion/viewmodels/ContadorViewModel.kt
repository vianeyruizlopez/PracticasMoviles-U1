package com.example.miproyecto.contador.presentacion.viewmodels

import androidx.lifecycle.ViewModel
import kotlinx.coroutines.flow.MutableStateFlow
import kotlinx.coroutines.flow.StateFlow

class ContadorViewModel : ViewModel(){
    private val _count = MutableStateFlow(0); //creacion de variable creada privada, siempre comienxa con un valor
    val count : StateFlow<Int> = _count
    fun incremente (){
        _count.value++ ///i+++ si incremento la variable pueblica
    }
//cuando usamos var es mutable que la variable ppuede cambiar su valor, para val se no se puede cambiar el valor es inmutable
///la misma variable uno con _cout y cout ( sin
    ///la variable publica es una referencia de la variable privada
}