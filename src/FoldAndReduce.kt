fun main(args: Array<String>) {

    val foldResult = listOf(1, 2, 3, 4).fold(1, {
        partProduct, element ->
        element * partProduct
    })

    println(foldResult)

    println(foldResult == 24)

    val reduceResult = listOf(1, 2, 3, 4).reduce({
        partProduct, element ->
        element * partProduct
    })

    println(reduceResult)

    println(reduceResult == 24)

}