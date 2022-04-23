package id.ac.polbeng.zulaiha.test_kelas

private class privateExample {
    private val i = 1
    private fun doSomething() {
        println("Welcome to Psrivate access!")
        println("Private Access : $i")
    }
    fun calldoSomething(){
        doSomething();
    }
}
//Protected
open class C() {
    protected val i = 1
}
class D : C() {
    fun getValue() : Int {
        println("Welcome to Protected access!")
        return i
    }
}

class internalExample {
    internal val i = 1
    internal fun doSomething() {
        println("Welcome to Internal access!")
        println("Internal Access : $i")
    }
}

class publicExample {
    val i = 1
    fun doSomething() {
        println("Welcome to Public access!")
        println("Public Access : $i")
    }
}
fun main() {
    val objPrivate = privateExample()
    objPrivate.calldoSomething()
    val objProtected = D()
    println(println("Protected Access : ${objProtected.getValue()}"))
    val objInternal = internalExample()
    objInternal.doSomething()
    val objPublic = publicExample()
    objPublic.doSomething()
}
