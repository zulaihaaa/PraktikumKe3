package id.ac.polbeng.zulaiha.test_kelas

class InitOrder(name: String) {
    val firstProperty = "First property : $name".also(::println)
    init {
        println("First initializer block that prints ${name}")
    }
    val secondProperty = "Second property: ${name.length}".also(::println)
    init {
        println("Second initializer block that prints ${name.length}")
    }
}
fun main(){
    val InitOrder = InitOrder("RPL")
}