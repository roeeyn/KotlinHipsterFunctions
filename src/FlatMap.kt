

fun main(args: Array<String>) {

    val result = listOf("abc", "12").flatMap { it.toList()}

    println(result)


    println(result == listOf('a', 'b', 'c', '1', '2'))

}

data class Student(var name:String = "no name", var book:String = "no book")
