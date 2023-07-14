package com.example.a1031646772

class Reto2 {
}

fun main() {
    println("Buenas tardes, digite el valor de su compra")
    println("Si tu compra es mayor a 50000, Se hara un juego de bolitas de colores que te puedes ganar algo")
    var bolita:Int=(1..4).random()
    var value:Long= readLine()!!.toLong()
    if (value>50000){
      if (bolita==1){
          var desc:Long=(value*10)/100
          var total:Long=value-desc
          println("El valor de tu compra al ganar la bolita roja es $total")
      }
        if (bolita==2){
            var desc:Long=(value*30)/100
            var total:Long=value-desc
            println("El valor de tu compra al ganar la bolita azul es $total")
        }
        if (bolita==3){
            var desc:Long=(value*50)/100
            var total:Long=value-desc
            println("El valor de tu compra al ganar la bolita amarilla es $total")
        }
        else if (bolita==4){
            println("Tu compra salio gratis")
        }
    }
    else{
        println("Tu compra fue menor a 50000")
    }
}