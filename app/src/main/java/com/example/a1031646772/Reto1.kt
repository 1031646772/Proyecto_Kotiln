package com.example.a1031646772

class Reto1 {
}

fun main() {
    var dado1:Int=(1..6).random()
    var dado2:Int=(1..6).random()
    var total:Int=dado1+dado2
    println("Este es un juego de lanzar los dados aleatoriamenete")
    println("Se lanzan los dados")
    if(dado1==1 && dado2==1){
        println("Ganaste al sacar par de unos")
    }
    else if(total==2){
        println("Ganaste al sacar 2")
    }
    else if(total==11) {
        println("Ganaste al sacar 11")
    }
    else if (total==12){
        println("Ganaste al sacar 12")
    }
    else if (total==7){
        println("Ganaste al sacar 7")
    }
    else{
        println("Perdiste lo siento")
    }
    println("El dado1 saco $dado1")
    println("El dado2 saco $dado2")
    println("La suma de tus dados fue $total")
}
