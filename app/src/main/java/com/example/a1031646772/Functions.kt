package com.example.a1031646772

class Functions {
}
//funciones personalizadas
//funcion por expresion
/* val temperature=20
 val isHot=if(temperature>40)true else false
 println("isHot")
 println("Ingrese su edad")
 val edad:Int= readLine()!!.toInt()
 val discoteca=if (edad>18)true else false
 println("Puedes entrar,compra tu tragito")*/
//funcion basica
/*fun saludo() {
    println("helllo world")
}
    saludo()*/
//funcion perimetro circulo
fun perimetro(){
    println("Ingresa el diametro del circulo")
    var perimetro:Float= readLine()!!.toFloat()
    println("El perimetro del circulo es:"+perimetro*3.14)
}
fun area()
{
    println("Ingrese el radio del circulo")
    var radio:Float=readLine()!!.toFloat()
    println("El area del cirulo es:"+3.14*(radio*radio))
}
fun elegir(){
    var op1:Int=1
    while (op1==1) {
        println("Este es un sistema que permite calcular area o perimetro")
        println("Digite 1 para area del circulo, 2 para perimetro 3 para area del triangulo, 4 para perimetro del triangulo,\n5 para el perimetro de un cuadrado, 6 para el area del cuadrado, 7 para el perimetro de un rectangulo y 8 para el area de un rectangulo")
        var op: Int = readLine()!!.toInt()
        if (op == 1) {
            area()
        }
        else if (op == 2) {
            perimetro()
        }
        else if (op==3){
            println("Digite la base")
            var base: Float = readLine()!!.toFloat()
            println("Digite la altura")
            var altura: Float = readLine()!!.toFloat()
            areaTriangulo(base,altura)
        }
        else if(op==4) {
            println("Digite el primer lado")
            var lado1: Float = readLine()!!.toFloat()
            println("Digite el segundo lado")
            var lado2: Float = readLine()!!.toFloat()
            println("Digite el tercer lado")
            var lado3: Float = readLine()!!.toFloat()
            perimetroTriangulo(lado1, lado2, lado3)
        }
        else if (op==5){
            println("Ingrese el tamaño de un lado de su cuadrado")
            var lado:Float= readLine()!!.toFloat()
            perimetroCuadrado(lado)
        }
        else if (op==6){
            println("Ingrese el tamaño del primer lado del cuadrado")
            var lado1:Float= readLine()!!.toFloat()
            areaCuadrado(lado1)
        }
        else if (op==7){
            println("Ingrese el tamaño de la altura del rectangulo")
            var lado1:Float= readLine()!!.toFloat()
            println("Ingrese el tamaño de la base del rectangulo")
            var lado2:Float= readLine()!!.toFloat()
            perimetrorecta(lado1,lado2)
        }
        else if (op==8){
            println("Ingrese el tamaño de la altura del rectangulo")
            var lado1:Float= readLine()!!.toFloat()
            println("Ingrese el tamaño de la base del rectangulo")
            var lado2:Float= readLine()!!.toFloat()
            arearecta(lado1,lado2)
        }
        else {
            println("No elegiste ninguna de las dos opciones posibles, reintenta")
        }
        println("Quieres seguir calculando, elige 1 para si y 2 para no")
        op1=readLine()!!.toInt()
    }
}
fun perimetroTriangulo(lado1:Float,lado2:Float,lado3:Float){
    if(lado1==lado2 || lado2==lado3 || lado3==lado1){
        println("El triangulo es isoseles")
        println("El perimetro del triangulo es:"+(lado1+lado2+lado3))
    }
    else if (lado1==lado2 && lado1==lado3){
       println("El triangulo es equilatero")
        println("El perimetro del triangulo es:"+(lado1+lado2+lado3))
    }
    else{
        println("El triangulo es escaleno")
        println("El perimetro del triangulo es:"+(lado1+lado2+lado3))
    }
}
fun perimetroCuadrado(lado:Float){
    return println("El perimetro del cuadrado es:"+(lado+lado+lado+lado))
}
fun areaCuadrado(lado: Float){
    return println("El perimetro del cuadrado es:"+(lado*lado))
}
fun areaTriangulo(base:Float,altura:Float){
    println("El area del triangulo es:"+(base*altura)/2)
}
fun perimetrorecta(lado1: Float,lado2: Float){
    return println("El perimetro del rectangulo es:"+((lado1*2)*(lado2*2)))
}
fun arearecta(base:Float,altura:Float){
    println("El area del rectangulo es:"+(base*altura))
}

fun main() {
elegir()
}