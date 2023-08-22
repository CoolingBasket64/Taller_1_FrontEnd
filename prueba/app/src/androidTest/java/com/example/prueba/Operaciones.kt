package com.example.prueba

class Operaciones {
    var num1: Int = 0
    var num2: Int = 0
    var total:Int = 0

    fun pedirDatos(){
        println("Ingrese el primer numero")
        num1 = readln().toInt()
        println("Ingrese el segundo numero")
        num2 = readln().toInt()
    }

    fun sumar(){
        total = num1 + num2
        println("la suma de $num1 y $num2 es: $total")
    }
    fun restar(){
        total = num1 - num2
        println("la resta de $num1 y $num2 es: $total")
    }
    fun multiplicar(){
        total = num1 * num2
        println("la multiplicacion de $num1 y $num2 es: $total")
    }
    fun dividir(){
        total = num1 / num2
        println("la division de $num1 y $num2 es: $total")
    }
    fun modular(){
        total = num1 % num2
        println("la modulacion de $num1 y $num2 es: $total")
    }
}