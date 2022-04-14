fun main(){
   var currentAccount= CurrentAccount("AC289046734", "Jane Kate", 1200000.0)
   var savingsAccount= CurrentAccount("AC3678903", "Roba James", 40000.0, 200)
   )
    currentAccount.deposit(20000.0)
    currentAccount.withdraw(80000.0)
    currentAccount.details()
    savingsAccount.withdrawal()
    var product= Product("banana",12.0, 20, "grocerries")
    fruitindices()


//Question one
}
 open class CurrentAccount (var accountnumber:String, var accountname:String, var balance:Double){

    fun deposit(amount: Double){
        var moneydeposited = amount + balance
        println(moneydeposited)
    }
    fun withdraw(amount:Double){
        var moneywithdrawn = balance -amount
        println( moneywithdrawn)
    }
    fun details(){
        var x= accountnumber
        var y= balance
        var z= accountname
        println("Accountnumber  $x with balance $y is operated by $z")
    }
}

//Question two
class SavingsAccount(var withdrawals:Int): accountnumber:String, accountname:String,  balance:Double {
  fun withdrawal(){
       if(withdrawals < 4){
           println(withdrawals)
       }
       }
    }

//question 3
class Product(var name:String, var weight:Float, var price:Double, var category:String){
    when (category)
 "grocerries" -> println("grocerries")
    " hygiene" -> println(" hygiene")
    else -> println("other")
}
fun fruitIndices(x:String){
    for (Char in x)
        {
            if(index.Char%2=0 ){
                println(Char.toString())
            }
        }

}
