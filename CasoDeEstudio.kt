import java.text.DecimalFormat
import kotlin.random.Random

val dprecio = Random.nextDouble(19.0, 21.0)
val df = DecimalFormat("#.##")
var cajaD = 0.00
var cajaP = 0.00
fun main(){
    println("Hoy el dolar esta a: $${df.format(dprecio)}")
    println("Corte de caja en pesos")
    cajaP = readLine()!!.toDouble()
    println("Corte de caja en dolares")
    cajaD = readLine()!!.toDouble()

    calculo()
}
fun calculo() {
    println("Cuantos dolares hay por cambiar")
    val cantD = readLine()!!.toDouble()
    cajaD += cantD
    val entre = dprecio*cantD
    cajaP -= entre
    println("""
        Entregar en pesos $: ${df.format(entre)}
        Pesos en caja $: ${df.format(cajaP)}
        Dolares en caja $: ${df.format(cajaD)}
    """.trimIndent())

    if (cajaD > 0 && cajaP > 0){
        calculo()
    }else{
        println("Dinero Insuficiente")
    }
}
