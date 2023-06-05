


fun main(args: Array<String>) {

    var l = listOf<Int>(1,2,3,4,5,6,7)

    for(i in 0..l.size) {
        println(i);
    }
    if(l.size-1 !in l.indices){
        println("a")
    }

    var a = Fruit()
    println(a.cal())
    var a1 = Integer.parseInt("1")

}

class A(){
    fun apple() = 12
}
