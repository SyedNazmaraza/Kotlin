


//             Scope Functions , infix function , Extension Function , Default Function
fun main() {
    infixFun()
    var n:String = "Hello"
    n.add("World")

}
//               Scope Functions


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