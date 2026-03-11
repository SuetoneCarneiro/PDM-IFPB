/*
Escreva uma função que receba um número e verifique se ele é positivo, negativo
ou zero. Use o IF como expressão.
 */

 fun verificarNumero(numero: Int): String = 
    if(numero == 0) "Neutro"
    else if(numero > 0) "Positivo"
    else "Negativo"
 

 fun main(){
    print("O número 0 é ${verificarNumero(0)}\n")
    print("O número 55 é ${verificarNumero(55)}\n")
    print("O número -3 é ${verificarNumero(-3)}")
 }