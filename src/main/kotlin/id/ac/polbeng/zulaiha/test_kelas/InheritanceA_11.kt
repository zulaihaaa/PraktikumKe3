package id.ac.polbeng.zulaiha.test_kelas

open class computer(val name: String, val brand: String)

class Laptop (name: String, brand: String, val batteryLife: Double) : computer( name, brand){
    fun info (){
        println("Name: $name")
        println("Brand : $brand")
        println("Battery Life : $batteryLife")

    }
}

fun main(){
    val myLaptop = Laptop ("Acer Aspire 4783", "Acer", 2.5)
    println(myLaptop.info())

}