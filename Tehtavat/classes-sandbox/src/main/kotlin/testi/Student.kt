package testi

// Name: Fuwad Kalhori
// Student id: 2008798


object Universe {
    val humans = mutableSetOf<Human>()
}

open class Human(val name: String, initialAge: Int = 0) {
    val id = getId()
    var age: Int = maxOf(0, initialAge)
        set(value) { field = if(value > field) value else field }

    init {
        Universe.humans.add(this)
    }

    override fun toString() = "$name ($id), $age years"
    override fun equals(other: Any?) = (other is Human) && (id == other.id)
    override fun hashCode() = id.hashCode()

    companion object {
        private var lastId = 1
        private fun getId() = lastId++
    }
}

data class Course(val code: String, val credits: Int = 5)

class CourseRecord(val course: Course, val grade: Int) {
    override fun equals(other: Any?) = (other is CourseRecord) && (course == other.course)
    override fun hashCode() = course.hashCode()
}



fun main() {


    val course1 = Course("TX00CD46", 15)
    val course2 = Course("TX00CR61")
    val course3 = Course("ZZZ", 0)

    val matti = Student("Matti", 22)
    val maija = Student("Maija", 24)

    matti.addCompletedCourse(CourseRecord(course1, 5))
    matti.addCompletedCourse(CourseRecord(course2, 1))
    println(matti)
    println(maija)
    maija.addCompletedCourse(CourseRecord(course2, 0))
    println(maija)
    maija.addCompletedCourse(CourseRecord(course3, 5))
    println(maija)
    maija.addCompletedCourse(CourseRecord(course1, 5))
    println(maija)

}


class Student(name: String, age: Int) : Human(name, age) {
    val completetedCourses = mutableSetOf<CourseRecord>()

    val credits: Int
        get() = completetedCourses.map { it.course.credits }.sum()
    val grades: Double
        get() = completetedCourses.map { it.grade.toDouble() }.sum()

    val average: Double?
        get() : Double? = averageCalculator() ?: average

    fun averageCalculator (): Double? {
        val creditRecord = completetedCourses.map { (it.course.credits * it.grade)}
        return creditRecord.sum() / credits.toDouble()
    }

    fun addCompletedCourse(completed: CourseRecord) {
        if (completed.course.credits > 0 && completed.grade > 0) {
            completetedCourses.add(completed)
        }
    }

    override fun toString() = "$age years old, $credits credits, average $average"

}



// Student class has methods:
// fun addCompletedCourse(completed: CourseRecord) - adds a new CourseRecord to completedCourses
// course should be added only if credits > 0 and grade > 0
// (note: since completedCourses is set, there should be no duplicates)

// override fun toString(): String - returns a string that describes a student object ? mitä tietoja ?   ->  opiskelijan tiedot > 22 years, 20 credits, average 4.0
// An example of how Student class objects should behave:
//
//val course1 = Course("TX00CD46", 15)
//val course2 = Course("TX00CR61")
//val course3 = Course("ZZZ", 0)
//
//val matti = Student("Matti", 22)
//val maija = Student("Maija", 24)
//
//matti.addCompletedCourse(CourseRecord(course1, 5))
//matti.addCompletedCourse(CourseRecord(course2, 1))
//println(matti)
//println(maija)
//maija.addCompletedCourse(CourseRecord(course2, 0))
//println(maija)
//maija.addCompletedCourse(CourseRecord(course3, 5))
//println(maija)
//maija.addCompletedCourse(CourseRecord(course1, 5))
//println(maija)
//
// produces following output:
//Matti (1), 22 years, 20 credits, average 4.0
//Maija (2), 24 years, 0 credits, average N/A
//Maija (2), 24 years, 0 credits, average N/A
//Maija (2), 24 years, 0 credits, average N/A
//Maija (2), 24 years, 15 credits, average 5.0
