

//                           Collections ,Visibility modifier,Exception handling ,type conversions
fun main() {

//                            Collections
//         Arrays
    var array =
        Array<Int>(2) { 0 }; //it's an array by size of 2 and all elements as 0 and its mutable and fixed size
    array[0] = 1 //changing the 0 index value to 1
    array[1] = 2 //changing the 1 index value to 2
    var array1 = arrayOf(1, 2, 3) //it's an array
    array1[1] = 54;

//                 List

    var list = listOf<Int>(1, 2, 3); //it's a List and immutable we cannot change the value we only read the value
    var list1 = ArrayList<Int>(); //it's a list and mutable
    list1.add(1);
    list1.add(2);
    printing(list1); //
//                    HashMap
    var map = mapOf<Int,String>(1 to "S",2 to "a")           //Immutable
    var map1 = HashMap<Int,String>()                                       //Mutable
    var map2 = mutableMapOf<Int,String>(1 to "S")       //Mutable
    var map3 = hashMapOf<Int,String>(1 to "A")              //Mutable
    map3[2] = "S"
    map2[1] = "A"
    map1[2] = "N"
//                      HashSet
    var set = setOf<Int>(1,2)                                        //Immutable
    var set1 = HashSet<Int>()                                                  //Mutable
    var set2 = hashSetOf<Int>(1,2,3)                                //Mutable
    var set3= mutableSetOf<Int>(1,2,3)                              //Mutable
}

//                       Modifiers
class Students{
    var id:Int =0         //Public by default from anywhere we can access
    private var name:String ="Arjun"     // Only in this file we can access
    internal var salary:Int = 12000       // access in only in this module

}

open class Students1{
    var id:Int =0         //Public by default from anywhere we can access
    private var name:String ="Arjun"     // Only in this file we can access
    internal var salary:Int = 12000       // access in only in this module
    protected var age:Int = 21            // if any class extends this class then age can access but if not extends then they can't access
}
