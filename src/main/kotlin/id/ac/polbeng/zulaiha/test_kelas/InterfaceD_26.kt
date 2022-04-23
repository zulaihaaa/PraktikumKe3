package id.ac.polbeng.zulaiha.test_kelas

interface A {
    fun demo() {
        println("From interface A")
    }
}
interface B {
    fun demo() {
        println("From interface B")
    }
}
class MyClassB: A, B {
    override fun demo() {
        super<A>.demo()
        super<B>.demo()
    }
}
fun main() {
    val obj = MyClassB()
    obj.demo()
}
