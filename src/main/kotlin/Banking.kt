


fun main() {
    var c = BankingAccount.SavingAccount(1,2);
    c.depositing()

}
sealed class BankingAccount(var limit:Int){
    abstract fun depositing();
    abstract fun withdrawing();
    class SavingAccount(var accountNumber: Int , var balance: Int): BankingAccount(10000) {
        override fun depositing() {
            println("Doing deposit in saving_account")
        }
        override fun withdrawing() {
            println("Doing withdraw in saving_account with limit $limit")
        }

    }
    class CurrentAccount(var accountNumber:Int,var balance:Int):BankingAccount(15000){
        override fun depositing() {
            println("Doing deposit in CurrentAccount")
        }
        override fun withdrawing() {
            println("Doing withdraw in CurrentAccount with limit $limit")
        }
    }
    class FixedDepositAccount(var accountNumber:Int,var balance:Int):BankingAccount(20000){
        override fun depositing() {
            println("Doing deposit in FixedDepositAccount")
        }
        override fun withdrawing() {
            println("Doing withdraw in FixedDepositAccount with limit $limit")
        }
    }
}
