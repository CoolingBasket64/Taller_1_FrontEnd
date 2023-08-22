package com.example.prueba

fun condicion (){
    println("Ingrese el valor numero 1")
    val valor1= readln().toInt()
    println("Ingrese el valor numero 2")
    val valor2= readln().toInt()
    var mayor = if (valor1>valor2) valor1 else valor2
    println("el mayor entre $valor1 y $valor2 es: $mayor")
}

fun cuboCuadrado(){
    println("Ingrese un numero")
    val num1 = readln().toInt()
    val resultado = if (num1 % 2 == 0){
        println("Cuadrado")
        num1 * num1
    }
    else{
        println("Cubo")
        num1 * num1 * num1
    }
    println(resultado)
}
fun ejercicio1(){
    println("Digite un numero del 1 al 99")
    val numero = readln().toInt()
    val resultado = if (numero > 9 && numero < 100){
        println("El numero tiene 2 digitos")
    }
    else if (numero > 0 && numero < 10){
        println("El numero tiene 1 Digito")
    }
    else{
        println("Ingrese un numero valido")
    }
}

fun generadorNumeros(){
    var numero1 = 1
    while(numero1 <= 100){
        println(numero1)
        numero1 = numero1 + 1
    }
}

fun doMientras(){
    do{
    println("Digite un numero del 1 al 99")
    val numero = readln().toInt()
    var cantidad = if(numero < 10) 1 else 2
    println("El numero tiene $cantidad digitos")

    }while (numero != 0)
        println("gracias")
}

fun ejercicio2(){
    var partes = 0
    var mayor = 0
    var menor = 0
    var acumulador = 0
    do{
        println("Ingrese el peso de una parte del vehiculo (presione 0 para finalizar)")
        val valor = readln().toDouble()
        acumulador= acumulador + 1
        var resultado2 = if (valor > 9.8 && valor < 10.2){
            partes = partes + 1
        }else if(valor > 10.2){
            mayor = mayor + 1
        }else if (valor < 9.8){
            menor = menor + 1
        }else{}
    }while(valor != 0.0)

    println("hay: $partes con un peso entre 9.8 y 10.2")
    println("hay: $mayor con un peso mayor a 10.2")
    println("hay: $menor con un peso menor a 9.8")
    println("digito $acumulador veces")
}

fun promedio(){
    var suma=0
    println("Cuantas notas desea registrar: ")
    val notas = readln().toInt()
    for (i in 1..notas step 2){
        println("Ingrese un valor para la nota $i: ")
        val valor = readln().toInt()
        suma +=valor
    }
    println("La suma de los valores ingresados es: $suma")
    val promedio = suma/notas
    println("El promedio es: $promedio")
}

fun propiedadesFor(){
    for (i in 1..10){
        println(i)
    }
}

fun notas(){
    println("Ingrese primer nota: ")
    val nota1 = readln().toInt()
    println("Ingrese segunda nota: ")
    val nota2 = readln().toInt()
    println("Ingrese tercer nota: ")
    val nota3 = readln().toInt()
    var promedio = (nota1+nota2+nota3)/3

    when{
        promedio >= 7 -> println("Aprobó")
        promedio >= 4 -> println("Reprobó")
        else -> println("Repita el proceso, algo salio mal")
    }
}

fun ejercicio3(){
    println("Ingrese 1.Cubo o Cuadrado 2.Generador 3.Contador 4.Promedio 5.Notas")
    val opcion = readln().toInt()
    when (opcion){
        1 -> cuboCuadrado()
        2 -> generadorNumeros()
        3 -> ejercicio2()
        4 -> promedio()
        5 -> notas()
        else -> println("Repita el proceso, algo salio mal")
    }
}

fun Digitos(){
    println("Ingrese un numero entre 1 y 99.999")
    val numero5 = readln().toInt()
    when(numero5){
        in 1..9 -> println("tiene un digito")
        in 10..99 -> println("tiene dos digitos")
        in 100..999 -> println("tiene tres digitos")
        in 1000..9999 -> println("tiene cuatro digitos")
        in 10000..99999 -> println("tiene cinco digitos")
        else -> println("$numero5 No se encuentra en el rango")
    }
}

fun main(array: Array<String>){
    //condicion()
    //cuboCuadrado()
    //ejercicio1()
    //generadorNumeros()
    //doMientras()
    //ejercicio2()
    //promedio()
    //propiedadesFor()
    //notas()
    //ejercicio3()
    Digitos()
}