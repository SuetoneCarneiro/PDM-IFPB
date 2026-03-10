/*
Crie uma classe ContaBancaria com atributos numero, titular e saldo.

 - Implemente métodos depositar(valor: Double) e sacar(valor: Double). Esses métodos deverão lançar uma exceção, caso os valores dos seus parâmetros forem inválidos ou quando o saldo for insuficiente para o saque.
 - Adicione um atributo de classe (companion object) para contar quantas contas foram criadas.
 - Implemente um método de classe que mostre o número total de contas criadas até o momento. 
 - Crie duas contas e testes dos métodos das instâncias e da classe.

 */

open class WithdrawalException(message: String) : Exception(message)
class InsufficientFundsException(message: String) : WithdrawalException(message)

fun processWithdrawal(amount: Double, availableFunds: Double) {
    if (amount > availableFunds) {
        throw InsufficientFundsException("Insufficient funds for the withdrawal.")
    }
    if (amount < 1 || amount % 1 != 0.0) {
        throw WithdrawalException("Invalid withdrawal amount.")
    }
    //println("Withdrawal processed")
}
// Exceção já implementada. Fonte: https://kotlinlang.org/docs/exceptions.html#handle-exceptions-using-try-catch-blocks
// Usei apenas por curiosidade

 class ContaBancaria(val numero: String, val titular: String, var saldo: Double){
  
  companion object {
    private var countContas: Int = 0

    fun getTotalContas(): Int {
      return countContas
    }
  }

  init {
    countContas++
  }

  fun depositar(valor: Double){
    require(valor > 0, {"Valor Inválido!"})
    this.saldo += valor
  }

  fun sacar(valor: Double){
    processWithdrawal(valor, saldo)
    this.saldo -= valor
  }

 }

 fun main(){
  var conta1 = ContaBancaria("1443", "Suetone", 100000.0)
  var conta2 = ContaBancaria("1444", "Pedro", 30000.0)

  print("Saldo atual da conta de ${conta1.titular}: ${conta1.saldo}\n")
  print("Saldo atual da conta de ${conta2.titular}: ${conta2.saldo}\n")

  conta1.sacar(11000.0)
  conta2.depositar(8000.0)

  print("Saldo atual da conta de ${conta1.titular}: ${conta1.saldo}\n")
  print("Saldo atual da conta de ${conta2.titular}: ${conta2.saldo}\n")

  print("\nTotal de contas criadas: ${ContaBancaria.getTotalContas()}")

  //conta1.depositar(-100.0)
  conta2.sacar(59000.0)
 }