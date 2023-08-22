package com.example.colaboracionclases

class Cliente(var nombre: String, var monto:Float) {

    fun consignar(montoC: Float){
        this.monto+=montoC
    }

    fun retirar(montoR:Float){
        this.monto-=montoR
    }

    fun imprimir(){
        println("$nombre tiene en su cuenta la suma de: $monto ")
    }

}