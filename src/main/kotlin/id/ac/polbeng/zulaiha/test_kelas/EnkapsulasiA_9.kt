package id.ac.polbeng.zulaiha.test_kelas

class Employee(_id: Int, _name: String, _age: Int){
    val id: Int = _id
        get() = field
    var name: String = _name
        get() = field
        set(value) {
            field
        }
    var age: Int =_age
        get() = field
        set(value) {
            field = value

        }
}

fun main(){
    val emp = Employee(1101, "Siti Zulaiha",20)
    println("id: ${emp.id}, Nama: ${emp.name}, umur : ${emp.age}")
}