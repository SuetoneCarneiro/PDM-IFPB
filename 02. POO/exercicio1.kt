/* 
Implemente uma classe Livro com os atributos titulo, autor e anoPublicacao. 
Crie um método que imprima os dados do livro em formato de ficha bibliográfica. 	
A classe deve ter um construtor secundário. 
Lance uma exceção caso seja criado um livro com um ano de publicação inválido.
 */

 class Livro (var titulo: String, var autor: String, var anoPublicacao: Int){
  
  constructor(titulo: String, autor: String): this(titulo, autor, 2026)

  init{
    require(this.anoPublicacao > 2026,{ "Ano inválido" })
  }

  override fun toString(): String {
    return "\nAutor: $autor\nAno: $anoPublicacao\nTitulo: $titulo"
  }

 }

 fun main(){
  var livro = Livro ("Kotlin IFPB", "Edemberg")
  print(livro)
  // Testando a exceção
  var livro2 = Livro ("Kotlin IFPB 2", "Edemberg Rocha", 2027)
  print(livro2)
 }