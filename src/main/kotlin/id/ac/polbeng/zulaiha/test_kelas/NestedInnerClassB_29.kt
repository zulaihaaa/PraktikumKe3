package id.ac.polbeng.zulaiha.test_kelas

fun main() {
    var programmer: Human = object : Human {
        override fun think() {
            print("I am an example of Anonymous Inner Class ")
        }
    }
    programmer.think()
}
interface Human {
    fun think()

}