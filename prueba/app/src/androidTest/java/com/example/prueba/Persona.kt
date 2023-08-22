package com.example.prueba

class Persona {
    var nombre:String=""
    var edad:Int=0

    fun inicializar(nombre:String, edad:Int){
        this.nombre=nombre
        this.edad=edad
    }
    fun imprimir(){
        println("Nombre: $nombre y tiene una edad de $edad")
    }
    fun calcularMayoriaEdad(){
        if (edad >= 18)
            println("$nombre Es mayor de edad")
        else
            println("$nombre Es menor de edad")
    }
    fun ingresardatos(){
        println("Cuantas personas desea ingresar? ")
        var cantidad= readln().toInt()
        for (i in 1..cantidad){
            println("Ingrese el nombre de la persona $i: ")
            nombre= readln()
            println("Ingrese la edad de $nombre: ")
            edad= readln().toInt()
        }
    }

}