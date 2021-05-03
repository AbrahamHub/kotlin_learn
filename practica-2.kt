import java.text.DecimalFormat


fun main(){
    print("Ingresa tu salario en bruto $: ")
    val sal_bru = readLine()!!.toDouble()
    print("\n Ingresa el porcentaje de impuestos %: ")
    val por_imp = readLine()!!.toDouble()
    val df = DecimalFormat("#.##")
    var imp = sal_bru * (por_imp/100)
    var sal_net = sal_bru - imp
    println("""
        Salario mensual neto $: ${df.format(sal_net)}
        Impuestos a pagar por mes $: ${df.format(imp)}
        
    """.trimIndent())

    imp *= 12
    sal_net *= 12
    println("""
        Salario anual neto $: ${df.format(sal_net)}
        Impuestos a pagar por año $: ${df.format(imp)}
    """.trimIndent())
}
