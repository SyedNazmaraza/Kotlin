
fun main(args: Array<String>) {
    /*                   Variables, Strings, Numbers & Operators, Conditional Statement               */
    var age = 21; //Integer Mutable
    var name = "Abcd" //String Mutable
    var salary = 25000.00 //Double Mutable
    val email = "syed.n@gmail.com"  //String Immutable that means we can not modify it later bcz of val Keyword
    var eligible = if (age > 20) true else false;  //Boolean with conditional logic
    var salaryIncrement = if (eligible) salary + 10000 else salary
    println(salaryIncrement)
   when (age) {
        in 20..50 -> "eligible"
        else -> "Not Eligible"
    }

    /*                    Arrays,List,Loops,Conditional logic                                  */

    var array =
        Array<Int>(2) { 0 }; //it's an array by size of 2 and all elements as 0 and its mutable and fixed size
    array[0] = 1 //changing the 0 index value to 1
    array[1] = 2 //changing the 1 index value to 2
    var array1 = arrayOf(1, 2, 3) //it's an array
    array1[1] = 54;

    var list = listOf<Int>(1, 2, 3); //it's a List and immutable we cannot change the value we only read the value
    var list1 = ArrayList<Int>(); //it's a list and mutable
    list1.add(1);
    list1.add(2);
    printing(list1); //
    var updatedList = multiply(list1);

    /*                           Nullability                                                      */

    var address: String? = null;
    // 1. Safe Call (?.)
    // it firstly check's whether the left side of "?" mark means address is null or not if it is null it doesn't execute right side of "?" mark //
    println("The Length of address is ${address?.length}")
    // 2. Safe Call With let (?.let)
    // it check the address is null or not if it is null the let block will not execute
    address?.let { println("The Length of address is ${address.length}") }
    // 3. Elviz-operator (?:)
    // it prints addresslength if the address is not null else -1 , it same like ternary operator in java ?:
    var length = address?.length ?: -1
    print("address length $length")
    // 4. Non-null assertion operator (!!)
    // if your confident that the address is not null then we use non-null
    println(address!!.length)
}

fun printing(x: ArrayList<Int>): Unit {  //Printing fun parameters as ArrayList and it doesn't return so used Unit
    for (i in x) { //for-each loop
        println(i)
    }
    for (i in x.indices) { //for loop with range
        println(x[i])
    }
    var i = 0;
    while (i < x.size) {  //While loop
        println(x[i])
        i++
    }

}

fun multiply(x: ArrayList<Int>): ArrayList<Int> =
    x.map { it * 2 }.toCollection(ArrayList<Int>()) //Function Expression




