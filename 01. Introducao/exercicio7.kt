/*
Crie uma função que receba, via parâmetro, um nome (que pode ser nulo) e imprima
uma saudação personalizada, apenas se o nome não for nulo
*/
fun personalizedGreeting(name: String?){
    name?.let {
        println("Seja bem-vindo, $it!")
    }
}

fun main() {
    personalizedGreeting("Suetone")
    personalizedGreeting(null)
}
