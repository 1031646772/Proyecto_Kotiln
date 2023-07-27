package com.example.a1031646772

class Arrays {
}

fun main() {
    print("holaa")
    val pest = arrayOf("dog", "cat", "canary")
    print(pest.contentToString())
    print(pest[1])
    pest[2] = "parrot";
    println(pest.contentToString())

    for (elemento in pest) {
        println("la mascota es $elemento")
    }

    for ((index, elemento) in pest.withIndex()) {
        println("la mascota en la posicion $index es $elemento ")
    }


    val instrumento = mutableListOf<String>("trumpet", "piano", "violin")
    println(instrumento)
    println(instrumento[1])
    instrumento[2] = "gitarra";

}