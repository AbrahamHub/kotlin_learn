fun main(){
//Operaciones con variables

    val max = maxLength("Carro", "Manzana", "Bosque", "Avión")
    print("La palabra más larga tiene $max caracteres")

    val words = arrayOf("Carro", "Manzana", "Bosque", "Avión")
    print("La palabra más larga tiene ${maxLength(*words)} caracteres")

    println(round(3.14159265359 * 100) / 100 == 3.14)
    //Double.round(decimals: Int = 2): Double = "%.${decimals}f".format(this).toDouble()
}
