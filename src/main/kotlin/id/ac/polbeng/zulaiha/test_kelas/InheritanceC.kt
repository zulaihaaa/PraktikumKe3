package id.ac.polbeng.zulaiha.test_kelas

open class Teacher{
    open fun teach(){
        println("Teaching...")
    }
    fun info(){
        println("I'am a Teacher.")
    }
}

class MathsTeacher : Teacher(){
    override fun teach() {
        println("Teaching Maths...")
    }
}
fun main(){
    val teacher = Teacher()
    val mathsTeacher = MathsTeacher()
    mathsTeacher.info()
    teacher.info()
    mathsTeacher.teach()
}