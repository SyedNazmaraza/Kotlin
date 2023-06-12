


fun main() {
    var c = BankingAccount.SavingAccount(1,2);
    c.depositing()

}
sealed class BankingAccount(var limit:Int){
    abstract fun depositing(amount:Int);
    abstract fun withdrawing(amount:Int);
    class SavingAccount(var accountNumber: Int , var balance: Int): BankingAccount(10000) {
        override fun depositing(amount:Int) {
            println("Doing deposit in saving_account")
        }
        override fun withdrawing(amount:Int) {
            if(amount<= limit){
                println("Doing withdraw in SavingAccount ")
            }
            else{
                println("your withdraw limit is $limit")
            }
        }

    }
    class CurrentAccount(var accountNumber:Int,var balance:Int):BankingAccount(15000){
        override fun depositing(amount:Int) {
            println("Doing deposit in CurrentAccount")
        }
        override fun withdrawing(amount:Int) {
            if(amount<= limit){
                println("Doing withdraw in CurrentAccount ")
            }
            else{
                println("your withdraw limit is $limit")
            }
        }
    }
    class FixedDepositAccount(var accountNumber:Int,var balance:Int):BankingAccount(20000){
        override fun depositing(amount:Int) {
            println("Doing deposit in FixedDepositAccount")
        }
        override fun withdrawing(amount:Int) {
            if(amount<= limit){
                println("Doing withdraw in FixedDepositAccount ")
            }
            else{
                println("your withdraw limit is $limit")
            }

        }
    }
}
