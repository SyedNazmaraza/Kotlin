


//             Scope Functions , infix function , Extension Function , Default Function
fun main() {
    infixFun()
    var n:String = "Hello"
    n.add("World")
    usewith()
    usealso()

}
//                 Scope Functions
class Humans{
    var name:String? = null
    var age:Int? = null
    var gender:String? = null
    var salary:Int?=null
    fun isHuman():Boolean = if (age!!>1000) false else true



}
// 1. with
fun usewith(){               //  with function return "lambda result" and context object "this"
    var h = Humans()
//    h.name="Arjun"
//    h.age=1
    var result = with(h){
        this.name = "Arjun"
        age =12
        isHuman()
    }
    println(result)
}
// 2. apply
fun useapply(){                //  apply function return "context object" and context object "this"
    var h = Humans().apply {
        name = "df"
        age = 21
    }.isHuman()

}
// 3. also
fun usealso(){                 //  also function return "context object" and context object "it"
    var h = Humans().apply {
        name = "Arjun"
        age = 21
        salary = 10000
    }.also {
        it.gender =  "male"
        if(it.gender.equals("male")){
            it.salary = it.salary?.plus(122)
        }
    }
    println(h.salary)
}
// 4. let
fun uselet(){                      //  let function return "lambda result" and context object "it"
    var h = Humans()
    h.name = "ARJUN"
    h.name?.let {
        println(it.lowercase())
    }

}
// 5. run
fun useRun(){                         //combination of let and with
    var h:Humans? = null
    h?.run {
        name = "Arjun"
    }


}




//                 Infix
fun infixFun(){
    var c = Number("1")
    var v = Number("2")

    var total = c + v
    println(total)
}
class Number(var a: String ) {
    operator infix fun plus(n: Number): String {
        return this.a + n.a
    }
}

//              Extension Function
fun String.add(i:String):String{
    return this+i;
}