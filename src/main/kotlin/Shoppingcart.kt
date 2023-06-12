

fun main() {
    var p1 : Product = Product("Abcd",1,123)
    var p2 : Product = Product("Xyz",2,120,20)
    var cart = ShoppingCart()
    cart.addingItems(p1)
    cart.addingItems(p2)
    println(cart.totalPrice())

}
class ShoppingCart() {
    var cart = ArrayList<Product>()
    fun addingItems(item: Product) {
        cart.add(item)
    }
    fun removingItems(item: Product) {
        cart.remove(item)
    }
    fun totalPrice():Int {
        var i: Int = 0;
        cart.forEach { i = i.plus(it.price) - applyingDiscount(it.discount) }
        return i
    }
    private fun applyingDiscount(amount: Int?): Int {
        var value = amount?.let {
            var j = amount
            j
        } ?: 0
        return value
    }
}
data class Product(var name : String ,var quantity : Int,var price :Int,var discount:Int? = null){}