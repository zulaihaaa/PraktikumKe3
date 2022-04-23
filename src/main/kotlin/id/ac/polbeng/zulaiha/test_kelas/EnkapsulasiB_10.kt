package id.ac.polbeng.zulaiha.test_kelas

class EmployeeA(_id: Int, _name: String, _age: Int) {
    val id: Int = _id
        get() = field
    var name: String = _name
        get(){
            return field.toUpperCase()
        }
        set(value) {
            field = value
        }
    var age: Int = _age
        get() = field
        set(value) {
            field = if(value > 0) value else throw IllegalArgumentException("Age must be greater than zero")
        }
}
fun main() {
    val emp = EmployeeA(1101, "Jono", 25)
    println("Id : ${emp.id}, Nama : ${emp.name}, Umur : ${emp.age}")
    emp.age = 25
}