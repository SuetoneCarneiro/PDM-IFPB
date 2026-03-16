/*
Crie uma classe base Veiculo com atributos marca e modelo e um método exibirInfo().

- Crie uma classe derivada Carro, que herda de Veiculo e adiciona o atributo
quantidadePortas.
- Sobrescreva o método exibirInfo() na classe Carro.
- Crie instancias para Veiculo e Carro e teste os seus métodos.
- Crie a função top-level exibirDados(veiculo: Veiculo) que recebe qualquer tipo
de veículo e imprime suas informações.
    i. Instancie objetos das classes Veiculo e Carro e use a função para
    testar o polimorfismo.
*/
open class Veiculo(val marca: String, val modelo: String){
    open fun exibirInfo(){
        println("Marca: $marca, Modelo: $modelo")
    }
}

class Carro(marca: String, modelo: String, val quantidadePortas: Int) : Veiculo(marca, modelo){
    override fun exibirInfo(){
        println("Marca: $marca, Modelo: $modelo, Quantidade de Portas: $quantidadePortas")
    }
}

fun exibirDados(veiculo: Veiculo){
    veiculo.exibirInfo()
}

fun main(){
    val motoBmw = Veiculo("BMW", "G310R")
    val carroToyota = Carro("Toyota", "Corolla Cross", 4)

    motoBmw.exibirInfo()
    carroToyota.exibirInfo()

    println("\nUsando a função toplevel exibirDados:")

    exibirDados(motoBmw)
    exibirDados(carroToyota)
}