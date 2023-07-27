package com.example.a1031646772

class Nequi {
}
//Login
fun Login(){
    println("Ingrese el numero de celular")
    var number:Long= readLine()!!.toLong()
    var parseo=number.toString()!!
    var cantidad=parseo.length
    println("Ingrese el su clave de nequi de 4 digitos")
    var contra:Int= readLine()!!.toInt()
    var contador:Int=3
    while(contador>=0){
        if (cantidad<10 || contra<9999){
            println("La clave o el numero de celular son menores al rango requerido")
        }
        else{
            if (number==3508010097 && contra==2209){

            }
            else{
                println("¡Upps! Parece que tus datos de acceso no son correctos, Tienes tres intentos más")
                contador=contador-1
            }
        }
    }
}
fun sacar(saldo: Long):Long{
    var op:Int=1
    var saldito:Long=saldo
    while(op==1){
        println("Ingrese 1 para punto fisico, y 2 pára cajero automatico")
        var op1:Int= readLine()!!.toInt()
        if (op1==1){
            if (saldito<2000){
                println("No te alcanza")
            }
            else{
                println("Ingrese el valor a sacar")
                var sacar:Long=readLine()!!.toLong()
                if (sacar>saldito){
                    println("No puedes sacar un valor mayor a tu saldo")
                }
                else{
                  var confirmacion:Int=(1..999999).random()
                    println("Ingrese el codigo de confirmacion")
                    var confirmacion2:Int= readLine()!!.toInt()
                    if(confirmacion==confirmacion2){
                        saldito=saldo-sacar
                        println("Retiro exitoso")
                    }
                    else{
                        println("El codigo de confirmacion es incorrecto")
                    }
                }
            }
        }
        else if(op1==2){
            if (saldito<2000){
                println("No te alcanza")
            }
            else{
                println("Ingrese el valor a sacar")
                var sacar:Long=readLine()!!.toLong()
                if (sacar>saldito){
                    println("No puedes sacar un valor mayor a tu saldo")
                }
                else{
                    var confirmacion:Int=(1..999999).random()
                    println("Ingrese el codigo de confirmacion")
                    var confirmacion2:Int= readLine()!!.toInt()
                    if(confirmacion==confirmacion2){
                        saldito=saldito-sacar
                        println("Retiro exitoso")
                    }
                    else{
                        println("El codigo de confirmacion es incorrecto")
                    }
                }
            }
        }
        println("¿Desea volver a sacar dinero? 1. si 2. no")
        op=readLine()!!.toInt()
    }
    return saldito
}
fun recarga(saldo:Long):Long{
    var saldito:Long=saldo
    println("Ingrese el valor de recarga")
    var recarga:Long= readLine()!!.toLong()
    println("¿Seguro que quieres realizar la recarga, 1. si y 2. no?")
    var op:Int= readLine()!!.toInt()
    if (op==1){
        println("Recarga realizada")
        saldito=saldo+recarga
    }
    else{
        println("Recarga cancelada")
    }
    return saldito
}
fun envia(saldo: Long):Long{
    var saldito:Long=saldo
    println("Digite el numero de telefono al cual desea enviar dinero")
    var number:Long= readLine()!!.toLong()
    println("Digite el valor a enviar")
    var enviovalue:Long= readLine()!!.toLong()
    if (saldito>enviovalue){
        println("Envio realizado")
        saldito=saldito-enviovalue
    }
    else{
        println("No te alcanza para enviar ese valor")
    }
    return saldito
}
fun nequi(){
    Login()
    var p:Int=1
    while (p==1){
        println("Seleccione 1. Recarga, 2. Sacar 3. Envia y 4. Salir")
        var saldo:Long=4500
        var retorno:Long=0
        var opGlobal:Int= readLine()!!.toInt()
        if (opGlobal==1){
            retorno=recarga(saldo)
        }
        else if (opGlobal==2){
            retorno=sacar(saldo)
        }
        else if (opGlobal==3){
            retorno=envia(saldo)
        }
        else if (opGlobal==4){
            break
        }
        saldo=retorno
        println("¿Quiere seguir acciendo acciones?1. si 2. no")
        p= readLine()!!.toInt()
    }
}
fun recargaCell(){

}
fun main() {
    nequi()
}