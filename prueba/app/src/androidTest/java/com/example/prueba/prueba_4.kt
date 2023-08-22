package com.example.prueba

fun main(array: Array<String>){
    //pedirDatos()
    //pedir()
    //salario("Dylan", 50.000, 5)
    //salario(valorHora = 50.000, cantidadHoras = 5, nombre = "Julian")
    multiplos()
}

fun mayor(num1:Int, num2:Int):Int{
    if (num1 > num2)
        return num1
    else
        return num2
}

fun mayorUnicaExpre(num1:Int, num2: Int) = if (num1 > num2)num1 else num2

fun pedirDatos(){


    println("Ingrese valor 1: ")
    val num1 = readln().toInt()
    println("ingrese valor 2: ")
    val num2 = readln().toInt()

    println("El mayor entre $num1 y $num2 es: ${mayor(num1, num2)}")

    println("La superficie de $num1 = ${superficie(num1)}")
}

fun superficie(lado:Int)= lado * lado

/*fun ejercicio(numero:Int)= if (numero == 1){
    println("Uno")
}
else if (numero == 2){
    println("Dos")
}
else if (numero == 3){
    println("Tres")
}
else if (numero == 4){
    println("Cuatro")
}
else if (numero == 5){
    println("Cinco")
}
else
    println("Error")*/

fun ejercicio1(numero:Int) = when (numero){
    1 -> println("uno")
    2 -> println("dos")
    3 -> println("tres")
    4 -> println("cuatro")
    5 -> println("cinco")
    else -> println("error")
}

fun pedir(){
    println("Digite un numero del 1 al 5: ")
    val numero = readln().toInt()
    println("${ejercicio1(numero)}")
}

fun salario(nombre:String, valorHora: Double, cantidadHoras:Int){
    var sueldo = valorHora * cantidadHoras
    println("$nombre laboro $cantidadHoras horas, su sueldo es: $sueldo ")
}

fun multiplos(){

    fun calcularMultiplos(valor:Int, multiplo:Int)= valor % 2 == 0
        var multiplos2 = 0
        var multilplos5 = 0
        for (i in 1..5){
            println("Ingrese el valor $i: ")
            val valor = readln().toInt()
            if (calcularMultiplos(valor,2))
                multiplos2++
            if (calcularMultiplos(valor,5))
                multilplos5++
        }
    println("Cantidad de multiplos de 2: $multiplos2")
    println("Cantidad de multiplos de 5: $multilplos5")
    }

