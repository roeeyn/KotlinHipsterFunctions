data class Mariachi(var nombre:String = "SIN NOMBRE", var edad:Int = 0, var comidaFav:String = "SIN COMIDA") {

    override fun toString(): String = "Mariachi(nombre='$nombre', edad=$edad, comidaFav='$comidaFav')"

    fun comer() = println("Comiendo...")
    fun dormir() = println("Durmiendo...")
    fun programar() = println("Programando...")

}

fun main(args: Array<String>) {


    /*
    *
    * Usualmente se usa 'let' para cambiar de tipo de variable,
    * o para ejecutar un pedazo de codigo si el objeto no es nulo
    *
    * Usa el objeto como 'it'
    * Regresa el tipo de variable de la lambda
    *
    * */

    println("Ejemplo de let:")
    val respuestaDelUniverso = "vacio".let {
        42
    }

    println(respuestaDelUniverso)

    val nullString:String? = null

    nullString?.let {
        println(nullString)
    }

    val notNullString = "Hola Mariachi!"

    notNullString.let {
        println(notNullString)

    }

    println()

    /*
    *
    * Usualmente se usa el 'apply' para modificar las propiedades de un objeto,
    * se recibe como 'this' el objeto, y se regresa el objeto mismo
    *
    * */

    println("Ejemplo de apply:")

    val mariachi = Mariachi()

    println(mariachi)

    mariachi.apply {
        nombre = "Ken"
        edad = 10
        comidaFav = "Chilaquiles"
    }

    println(mariachi)
    println()


    /*
    *
    * Usualmente se usa el 'run', muy similar al 'let', sólo cambia el tipo de retorno
    *
    * */

    println("Ejemplo de run:")

    mariachi.run {

        dormir()
        comer()
        programar()

    }

    println()

    /*
    *
    * Usualmente 'also' se aplica en los flujos de datos, para procesar la información
    *
    * */

    println("Ejemplo de also:")

    val original = "abc"

    original.also {
        println("The original String is $it") // "abc"
    }.also {
        println("The reverse String is ${it.reversed()}") // "cba"
    }.also {
        println("The length of the String is ${it.length}") // 3
    }

    println()

    /*
    *
    * Usualemnte se usa 'with' para evitar repetir la referencia a una instancia
    *
    * */

    println("Ejemplo de with:")

    with(mariachi){

        dormir()
        comer()
        programar()

    }

    println()

}