package com.example.a1031646772

class Ciclos {
}

fun main() {
    var contador:Int=0
    var contadorno:Int=0
    var sumapares:Int=0
    var sumaimpares:Int=0
   /* for(i in 1..4){
        println("Digite el numero")
        var number:Int= readLine()!!.toInt()
        if (number<=0 ){
           break
        }

        else {
            var validacion:Int=number%2
            if (validacion==0){
                contador=contador+1
                sumapares=sumapares+number
            }
            else {
                contadorno=contadorno+1
                sumaimpares=sumaimpares+number
            }
        }
    }*/
    /*var confi:Int=1
    while (confi==1){
        println("Digite el numero")
        var number:Int= readLine()!!.toInt()
        if (number<=0 ){
            break
        }

        else {
            var validacion:Int=number%2
            if (validacion==0){
                contador=contador+1
                sumapares=sumapares+number
            }
            else {
                contadorno=contadorno+1
                sumaimpares=sumaimpares+number
            }
        }
        println("¿Desea ingresar otro numero 1. si 0. No?")
        confi= readLine()!!.toInt()
        }
    */
    var confi:Int=1
    do {
        println("Digite el numero")
        var number:Int= readLine()!!.toInt()
        if (number<=0 ){
            break
        }

        else {
            var validacion:Int=number%2
            if (validacion==0){
                contador=contador+1
                sumapares=sumapares+number
            }
            else {
                contadorno=contadorno+1
                sumaimpares=sumaimpares+number
            }
        }
        println("¿Desea ingresar otro numero 1. si 0. No?")
        confi= readLine()!!.toInt()
    }
    while(confi==1)

    println("Los numeros pares fueron $contador")
    println("Los numeros impares fueron $contadorno")
    println("La suma de los numeros pares fue $sumapares")
    println("La suma de los numeros impares fue $sumaimpares")
}