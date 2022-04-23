package id.ac.polbeng.zulaiha.test_kelas

class PersonB (_firstName: String, _lastName: String, _age: Int){
    var firsName:String = _firstName
    var lastName:String = _lastName
    var age: Int = _age
}

fun main(){
    val budi = PersonB("budi", "Gunawan", 21)
    println("name : ${budi.firsName} ${budi.lastName}")
    println("Age : ${budi.age}")
}