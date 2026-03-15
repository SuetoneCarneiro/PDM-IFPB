/*
Crie uma lista mutável contendo vários nomes. A entrada de dados se encerrará
quando o usuário digitar a palavra ‘fim’. 

Em seguida, crie uma expressão lambda e
use-a no método forEach da lista, para filtrar e imprimir todos os nomes que
comecem com a letra ‘B’
*/
fun readWords(): List<String> {
    var wordsList: MutableList<String> = mutableListOf<String>()
    var word: String
    do {
        println("Digite um nome (ou 'fim' para encerrar):")
        word = readLine() ?: ""
        if (word.lowercase() != "fim") {
            wordsList.add(word)
        }
    } while (word.lowercase() != "fim")
    println(wordsList)
    return wordsList
}

fun filterNamesStartingWithB(words: List<String>) {
    val filteredNames = words.filter { it.startsWith("B", ignoreCase = true) }
    println("Nomes que começam com a letra 'B':")
    filteredNames.forEach { println(it) }
}

fun main() {
    var wordsList: List<String> = readWords()
    filterNamesStartingWithB(wordsList)
}

