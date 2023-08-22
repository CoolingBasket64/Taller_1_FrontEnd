package com.example.prueba

import com.example.colaboracionclases.Cliente

class Banco {


    var cant:Int = 0
    var retirar:Float=0f
    var consignar:Float=0f
    var opc:Int=0
    var pregunta:String=""

    fun ingresarC(){
        println("Cuantas personas desea registrar: ")
        cant=readln().toInt()
        val nombre= arrayOfNulls<String>(cant+1)
        val saldo:FloatArray
        saldo = FloatArray(cant+1)
        for (i in 1..cant){
            println("Nombre de la persona $i")
            nombre[i]= readln().toString()
            println("Saldo inicial de  "+nombre[i])
            saldo[i]= readln().toFloat()

        }
        for(i in 1..cant){
            println(nombre[i])
            var cliente:Cliente= Cliente(nombre = nombre.contentToString(), monto = saldo[i])
        }
        println("Ingrese el nombre de la cuenta a la que quiere hacer transacciones")
        pregunta = readln()
        for(i in 1..cant){
            if(nombre[i] == pregunta){
                println(nombre[i]+" que desea realizar \n1: Transacciones\n2: Retirar")
                opc = readln().toInt()
                if (opc == 1) {
                    println("Cuanto desea consignar: ")
                    consignar = readln().toFloat()
                    consignar+=saldo[i]
                    println("tiene un saldo actual de $consignar")
                } else if (opc == 2) {
                    println("Cuanto desea retirar: ")
                    retirar = readln().toFloat()
                    retirar-=saldo[i]
                    println("tiene un saldo actual de $retirar")
                }
            }
        }



    }


}
