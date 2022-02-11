import testi.CourseRecord
import testi.Student

fun buildAquarium() {
    val aquarium6 = Aquarium(length = 25, width = 25, height = 40)
    aquarium6.printSize()
    val myTower = TowerTank(diameter = 25, height = 40)
    myTower.printSize()
}

fun makeFish() {
    val shark = Shark()
    val pleco = Plecostomus()
    println("Shark: ${shark.color}")
    shark.eat()
    println("Plecostomus: ${pleco.color}")
    pleco.eat()

    println()


}


data class Course(val code: String, val credits: Int = 5)

fun main(args: Array<String>) {
    //makeFish()

    val harri = Student(name = "Harri", age = 23)
    val pekka = Student(name = "Pekka", age = 32)
    val ari = Student(name = "Ari", age = 45)

    val harriCourse1 = Course(code = "HARRIKURSSI1", credits = 21)
    //val harriCourseRecord1 = CourseRecord(harriCourse1, grade = 3)

}