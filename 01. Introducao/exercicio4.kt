/*
Escreva uma função que receba uma matriz e retorne qual o seu maior valor
*/
fun matrixMaxValue(matrix: List<List<Int>>): Int {
    return matrix.flatMap { it.toList() }.max()
}

fun main() {
    val matrix = listOf(
        listOf(1, 74, 33),
        listOf(12, 93, 21),
        listOf(29, 8, 0)
    )
    print("O maior valor da matriz é ${matrixMaxValue(matrix)}")
}