/* 
Crie uma interface chamada FormaGeometrica com um método calcularArea().

- Crie as classes Retangulo e Circulo, ambas implementando a interface FormaGeométrica.
- Crie uma lista com objetos dessas formas e exiba suas áreas
*/

interface FormaGeometrica {
    fun calcularArea(): Double
}

class Retangulo(val base: Double, val altura: Double) : FormaGeometrica {
    override fun calcularArea(): Double {
        return base * altura
    }
}

class Circulo(val raio: Double) : FormaGeometrica {
    override fun calcularArea(): Double {
        return Math.PI * Math.pow(raio, 2.0)
    }
}

fun main(){
    val circulo = Circulo(5.9)
    val retangulo = Retangulo(7.0, 4.0)

    println("Área do círculo de raio ${circulo.raio} = ${circulo.calcularArea()}")
    println("Área do retângulo de base ${retangulo.base} e altura ${retangulo.altura} = ${retangulo.calcularArea()}")
}