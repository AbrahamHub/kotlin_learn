fun main(){
    //Operadores Aritméticos
    var a = 10
    var b = 20
    println("($a + $b)= ${a + b}")
    println("($a - $b)= ${a - b}")
    println("($a x $b)= ${a * b}")
    println("($a / $b)= ${a / b}")
    println("($a % $b)= ${a % b}")

    //Operadores Compuestos
     a = 100
     b = 5
    a += b
    println("+= $a")
    a -= b
    println("-= $a")
    a *= b
    println("*= $a")
    a /= b
    println("/= $a")
    a %= b
    println("%= $a")

    //Operadores Logicos
     a = 17
     b = 20
    println("$a es igual a $b: ${a == b}")
    println("$a es diferente a $b: ${a != b}")
    println("$a es menor que $b: ${a < b}")
    println("$a es mayor que $b: ${a > b}")
    println("$a es menor o igual que $b: ${a <= b}")
    println("$a es mayor o igual que $b: ${a >= b}")

}
