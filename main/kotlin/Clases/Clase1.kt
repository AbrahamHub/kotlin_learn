package Clases

const val PI = 3.14159

fun main(){
//Variables

    var Variable="Puede variar"
    println(Variable)
    val num=1
    println(num)
//Tipos de datos

    val boolean = true
    val entero = 123
    val numeroLargo = 1000000000000000L
    val numeroCorto : Short = 4
    val pequeño : Byte = 1
    val caracter : Char = 'A'
    val cadena = "Hola"
    val double : Double  = 2.1557
    val float  = 1.1F

    leer()
}

fun leer(){
    println("Ingresa tu nombre")
    val nombre = readLine()
    println("Ingresa tu edad")
    val edad = readLine()

    println("Hola $nombre tu edad es $edad")
}