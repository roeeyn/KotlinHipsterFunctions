fun main(args: Array<String>) {

    val numbers = listOf(1, -1, 2)
    println(numbers.filter { it > 0 } == listOf(1, 2))
    println(numbers.map { it * it } == listOf(1, 1, 4))

}