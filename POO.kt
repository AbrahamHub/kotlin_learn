fun main() {
    //Clases y Constructores
    open class Book constructor(title: String, isbn: Long) {
        var title: String
        var isbn: Long

        init {
            this.title = title
            this.isbn = isbn
        }
    }
    val Libro = Book("libro", 465)
    println(Libro.title)

    //Herencia
    class magazine(hojas: Int) : Book("title", 17){
        var hojas : Int

        init {
            this.hojas = hojas
        }
    }

    //Encapsulamiento
    class ClasePriv private constructor(){
        var priv = "Hola"
        var ada = "Adios"
    }

    //Polimorfismo
        val objetoHeredero: ClaseHeredera = ClaseHeredera()
        objetoHeredero.metodo1()
        objetoHeredero.metodo2()
}
open class ClasePadre{
    fun metodo1(){
        println("metodo 1")
    }
}
class ClaseHeredera: ClasePadre(){
    fun metodo2(){
        println("metodo 2")
    }
    }
