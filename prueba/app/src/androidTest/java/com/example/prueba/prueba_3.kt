package com.example.prueba

fun mostrarMayor(numero1:Int,numero2:Int,numero3:Int){
    println("El numero mayor es: ")
    if (numero1 > numero2 && numero1 > numero3){
        println(numero1)
    }
    else if (numero2 > numero3){
        println(numero2)
    }
    else{
        println(numero3)
    }
}

fun datos(){
    println("Ingrese numero 1")
    val num1 = readln().toInt()

    println("Ingrese numero 2")
    val num2 = readln().toInt()

    println("Ingrese numero 3")
    val num3 = readln().toInt()
    mostrarMayor(num1,num2,num3)
}

fun main(array: Array<String>){
    datos()
}