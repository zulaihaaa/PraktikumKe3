package id.ac.polbeng.zulaiha.test_kelas

class LaptopB : computer{
    val batteryLife : Double

    constructor(name: String, brand: String, batteryLife: Double): super(name, brand){
        this.batteryLife = batteryLife
    }
    constructor(name: String,brand: String): this(name, brand, 0.0){
    }
    fun info(){
        println("Name: $name")
        println("Brand: $brand")
        println("Battery life : $batteryLife")
    }
}

fun main () {
    val myLaptop = LaptopB("Asus Think Pad","Asus")
    println(myLaptop.info())
}