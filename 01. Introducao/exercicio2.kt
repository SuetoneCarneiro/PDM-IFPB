/*
Implemente uma função que receba a idade de uma pessoa e use o when para
verificar e retornar à faixa etária de uma pessoa (criança, adolescente, adulto,
idoso).
 */

fun faixaEtaria(idade: Int): String =
    when(idade){
        in 0..12 -> "Criança"
        in 13..17 -> "Adolescente"
        in 18..59 -> "Adulto"
        else -> "Idoso"
    }

fun main(){
    print("Com 10 anos, a pessoa é ${faixaEtaria(10)}\n")
    print("Com 16 anos, a pessoa é ${faixaEtaria(16)}\n")
    print("Com 24 anos, a pessoa é ${faixaEtaria(24)}\n")
    print("Com 70 anos, a pessoa é ${faixaEtaria(70)}\n")
}