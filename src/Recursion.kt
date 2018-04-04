fun main(args: Array<String>) {
    print(sumDigitsTail(1111111111))
}


fun sumDigits(num: Int): Int =
        if (num / 10 == 0) num
        else sumDigits(num / 10) + num % 10


//combinación de tecnicas de optimización
// Acumulator passing style - Técnica para guardar un acumulador para regresarlo al final del stack
// tail -> Técnica para que  nuestra función ocupe un espacio constante independiente de la entrada
tailrec fun sumDigitsTail(num: Int, accumulator: Int = 0): Int =
        if (num / 10 == 0) accumulator + num
        else sumDigitsTail(num / 10, accumulator + num % 10)