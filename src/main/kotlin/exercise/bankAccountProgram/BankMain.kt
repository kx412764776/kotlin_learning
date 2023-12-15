package exercise.bankAccountProgram

fun main() {

    val myBankAccount = BankAccount("Connor", 1388.89)
    myBankAccount.deposit(200.0)
    myBankAccount.withdraw(1200.0)
    myBankAccount.deposit(3000.0)
    myBankAccount.deposit(2000.0)
    myBankAccount.withdraw(3333.15)

    myBankAccount.displayTransactionHistory()
    println("${myBankAccount.accountHolder}'s balance is ${myBankAccount.accBalance()}")
}