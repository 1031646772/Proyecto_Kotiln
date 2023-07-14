package com.example.a1031646772

class Introduccion {
}
fun main() {
   /* var name: String = "Juli"
    var old: Short = 12
    val tax: Long = 480000
    var character: Char = '@'
    val numberDocument: Int = 1031646772
    var confirmation: Boolean = true
    val qualification: Float = 2.2F
    var dec: Double = 2.4
    var number: Byte = 12
    print(name+old+tax+character+numberDocument+confirmation+qualification+dec+number)*/
    println("Digite su nombre")
    var name:String= readLine()!!
    print("Ingrese su apellido \n")
    var lastName:String= readLine()!!
    print("Digite su edad \n")
    var age:Int= readLine()!!.toInt()
    println("Su nombre es: $name su apellido es: $lastName y su edad es $age")
}