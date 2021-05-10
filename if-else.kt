fun main() {
// if-else &&

    val num1 = 10
    val num2 = 20

    if(num1 > 0 && num2 > 0){
        println("Ambos valores son mayores a 0")
    } else{
        println("Algun valor no es mayor a 0")
    }

    // if-else ||


    if(num1 > 0 || num2 > 0){
        println("Algun valor es mayor a 0")
    } else{
        println("Ambos valores no son mayores a 0")
    }

    val numeropositivo = if( num1 >= 0) println("El numero es positivo") else println("El numero es nagativo")
}
