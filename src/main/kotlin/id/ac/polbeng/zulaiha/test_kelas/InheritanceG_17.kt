package id.ac.polbeng.zulaiha.test_kelas

open class Base (val name : String){
    init {
        println("initializing Base")
    }
    open val size : Int = name.length.also{
        println("initializing size in Base: $it")
    }
}
class Derived(name: String, val lastName:String) :
    Base(name.capitalize().also { println("Argumen For Base: $it") }) {
    init {
        println("initializing Derived")
    }

    override val size: Int = (super.size + lastName.length).also {
        println("initializing size in Derived : $it")
    }
}

fun main() {
    val turunan = Derived ("Siti", "Zulaiha")
    turunan.size
}
