package com.example.prueba

fun main(array: Array<String>){
    //ejercicioA()
    val sueldoEmpleados = cargar()
    imprimir(sueldoEmpleados)
}

fun sueldoEmpleados(){
    val sueldos:DoubleArray
    sueldos = DoubleArray(5)
    for (i in 0 .. 4){
        println("Ingrese sueldo: ")
        sueldos[i] = readln().toDouble()
    }
    for(i in 0..4){
        println(sueldos[i])
    }
}

fun ejercicioA(){
    val alturas:FloatArray
    alturas = FloatArray(5)
    var acu = 0.0
    var conM = 0
    var conm= 0
    for (i in 0 .. 4){
        println("Ingrese la altura de la persona: $i")
        alturas[i] = readln().toFloat()
        acu += (alturas[i]) / 5
    }
    for(i in 0..4){
        if (alturas[i] > acu)
            conM++
        else if (alturas[i] < acu)
            conm++
    }
    println("El promedio es $acu, las alturas que superan al promedio fueron $conM Y las que fueron menores fueron $conm")

}
fun cargar():IntArray{
    println("cuantos sueldos quiere cargar?: ")
    val cantidad= readln().toInt()
    val sueldos= IntArray(cantidad)
    for (i in sueldos.indices){
        println("Ingrese el sueldo")
        sueldos[i] = readln().toInt()
    }
    return sueldos
}
fun imprimir(sueldos:IntArray){
    println("Lista de todos los sueldos")
    for (i in sueldos){
        println(i)
    }
}