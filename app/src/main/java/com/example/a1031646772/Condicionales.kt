package com.example.a1031646772

class Condicionales {
}

fun main() {
   /* println("Digite el primer numero")
    var number1:Int= readLine()!!.toInt()
    println("Digite el segundo numero")
    var number2:Int= readLine()!!.toInt()
    if(number1>number2){
        println("El numero $number1 es mayor que $number2")
    }
    else if (number1==number2){
        println("Los numeros son iguales")
    }
    else{
        println("El numero $number2 es mayor que $number1")
    }
    /
    */
   /* println("Ingrese un numero")
    var number:Int= readLine()!!.toInt()
    if (number in 1..20){
        println("El numero esta en el rango")
    }
    else{
        println("Te dije un numero del 1 al 20")
    }
    */
    var number:Int= (0..50).random()
    when (number){
        0 -> println("No hay coincidencias")
        in 1..10 -> println("hay 10 coincidencias")
        in 20..50-> println("Hay muchas coincidencias")
    }
    println(number)
}