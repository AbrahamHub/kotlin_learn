fun main() {
    println("Dime un numero de mes")
    val month = readLine()?.toInt()
    when (month) {
        1 -> print("Enero")
        2 -> print("Febrero")
        3 -> print("Marzo")
        4 -> print("Abril")
        5 -> print("Mayo")
        6 -> print("Junio")
        7 -> print("Julio")
        8 -> print("Agosto")
        9 -> print("Septiembre")
        10 -> print("Octubre")
        11 -> print("Noviembre")
        12 -> print("Diciembre")
        else -> {
            print("No corresponde a ningún mes del año")
        }
    }
    println("")


    when (month) {
        in 1..6 -> println("Primer semestre")
        in 7..12 -> println("segundo semestre")
        !in 1..12 -> println("no es un mes válido")
    }

    println("Dame algun dato para saber de que tipo es")
    result(readLine()!!)
}
fun result(value: Any){
    when (value){
        is Int -> print(value + 1)
        is String -> print("El texto es $value")
        is Boolean -> if (value) print("es verdadero") else print("es falso")
    }
}
