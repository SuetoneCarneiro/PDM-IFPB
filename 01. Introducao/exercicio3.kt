/*
    Crie uma função que receba um valor e uma lista de valores (de tamanho indefinido
    e com valores de diferentes tipos de dados). A função deverá retornar quantas
    ocorrências do valor aparecem na lista.
*/

fun checkOccurrences(value: Int, list: Any): Int {
    var count = 0
    for (item in list as List<*>){
        if (item == value) count++
    }
    return count
}

fun main(){
    val list = listOf(1, "dois", 3, 1, "dois", 1, 4, "sete")
    print("O número 1 aparece ${checkOccurrences(1, list)} vezes na lista")
}