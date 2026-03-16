/*
Implemente a classe abstrata Funcionario com os atributos nome e salarioBase.

- Crie uma subclasse Gerente com um atributo adicional bonus.
- Crie um método que calcule o salário total considerando o bônus,
sobrescrevendo se necessário.
*/
abstract class Funcionario(val nome: String, val salarioBase: Double){
    abstract fun calcularSalarioTotal(): Double
}

class Gerente(nome: String, salarioBase: Double, val bonus: Double) : Funcionario(nome, salarioBase){
    override fun calcularSalarioTotal(): Double {
        return salarioBase + bonus
    }
}

fun main(){
    val gerente = Gerente("Leticia", 11000.0, 3000.0)
    println("Salário total de ${gerente.nome}: R$ ${gerente.calcularSalarioTotal()}")
}
