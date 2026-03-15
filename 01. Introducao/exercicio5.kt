/*
Escreva uma função que receba um valor e uma matriz. O programa deverá imprimir
em quais posições estão o valor parametrizado. 

Em seguida, faça um programa que gere uma matriz, identifique qual o seu maior e onde estão na matriz. 
Reuse a função da questão 4.
*/

fun matrixMaxValue(matrix: List<List<Int>>): Int {
    return matrix.flatMap { it.toList() }.max()
}

fun checkValuePositions(value: Int, matrix: List<List<Int>>): List<Pair<Int, Int>> {
    val positions = mutableListOf<Pair<Int, Int>>()
    for (i in matrix.indices) {
        for (j in matrix[i].indices) {
            if (matrix[i][j] == value) {
                positions.add(Pair(i, j))
            }
        }
    }
    return positions
}

fun generateMatrix(rows: Int, cols: Int): List<List<Int>> {
    return List(rows) { List(cols) { (0..100).random() } }
}

fun main() {
    val matrix = generateMatrix(3, 3)
    println("Matriz gerada:")
    for (row in matrix) {
        println(row)
    }
    
    val maxValue = matrixMaxValue(matrix)
    println("O maior valor da matriz é: $maxValue")

    val positions = checkValuePositions(maxValue, matrix)
    println("O valor $maxValue está nas seguintes posições:")
    for (position in positions) {
        println("Linha: ${position.first}, Coluna: ${position.second}")
    }
    
}


