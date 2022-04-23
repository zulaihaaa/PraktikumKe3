package id.ac.polbeng.zulaiha.test_kelas

open class EmployeeF{
    open val baseSalery: Double = 10000.0
    open fun displayDetails() {
        println("I am an Employee")
    }
}
class Developer: EmployeeF() {
    override val baseSalery: Double = 10000.0
    override fun displayDetails(){
        super.displayDetails()
        println("I am a Developer")
    }
}

fun main () {
    val employeeF = EmployeeF()
    println("${employeeF.javaClass.simpleName} base salary is ${employeeF.baseSalery}")
    println(employeeF.displayDetails())
    val developer = Developer()
    println("${developer.javaClass.simpleName} base salary is${developer.baseSalery}")
    println(developer.displayDetails())
}