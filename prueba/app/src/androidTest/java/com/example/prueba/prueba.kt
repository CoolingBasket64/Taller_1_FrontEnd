package com.example.prueba

fun saludo (){
    println("HOLA")

}


fun suma(){
    println("Ingrese el numero 1")
    val num1 = readln().toInt()
    println("Ingrese el numero 2")
    val num2 = readln().toInt()
    var resultado: Int = num1 + num2
    println("El total es: $resultado")
}

fun sueldo(){
    println("Ingrese el sueldo del empleado:")
    val salario = readln().toDouble()
    var total: Double = 0.0
    if (salario > 1200000 && salario < 3000000) {
        total = ((salario * 0.10) / 100)
        println("Debe pagar 10 % de impuestos, $total")
    }
    else if (salario > 3000000) {
        total = ((salario * 0.20) / 100)
        println("Debe pagar el 20% impuestos: $total")
    }
    else if (salario < 1200000){
        println("Esta libre de impuestos")
    }
}

fun main(array: Array<String>){
    //saludo()
    ///suma()
    //sueldo()
}