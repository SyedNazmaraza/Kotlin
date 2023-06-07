
 //                           Constructor's , Enum Class , Sealed Class, Data Class
fun main() {
    var human = Movie("A",21);
    println(human.name);

    var rick = Alien()
    rick.age=22
    println(rick.age)
    var human1 = Role.USER
    human1.getWhatCanaccess()
    println(human1.ordinal)

    var list: Array<Role> = Role.values()
    list.forEach { println(it) }


    var shape = Roles.Admin(2)
    println(shape.i)


}
//                              Primary And Secondary Constructor And Getter's , Setter's
class Alien(){
    var age : Int =0
        get() { return field }              // Getter
        set(value) { field = when{          // Setter
            value in 1..30 -> 30
            else -> 40
            }
            }
}
class Movie(var age : Int){  // we can declare the properties in primary Constructor
    var name:String?= null;
    init {
        println("age is $age");
    }
    constructor(name: String , age :Int ) :this(age){ // we can declare the properties in secondary Constructor
        this.name = name;
    }
}

//                                         ENUM

enum class Role(allaccess : Boolean = false) : Access{
    ADMIN(true) {
        override fun getWhatCanaccess() {
            println("All")
        }
    },
    USER{
        override fun getWhatCanaccess(){
            println("Home Page")
        }
    }
}
interface Access{
    fun getWhatCanaccess()
}
//                                     SEALED CLASS

sealed class Roles{
    class Admin(var i:Int):Roles()
    class User(i:String):Roles()
    data class Administrator(val i:String):Roles()
    object Security:Roles()
}

//                                        DATA CLASS
data class Aliens(val i:Int){
}
class Operate{
    fun oper(){
        var i = Aliens(1)
        var j = i.copy()
    }
}

