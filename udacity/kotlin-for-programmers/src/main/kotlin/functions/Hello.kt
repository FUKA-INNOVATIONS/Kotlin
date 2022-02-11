package functions

val decorations = listOf ("rock", "pagoda", "plastic plant", "alligator", "flowerpot")

val numbers1 = listOf(1, 2, 3, 4, 5, 6, 7)
val numbers2 = listOf(8, 8, 8, 5, 77, 2, 79)


// 3*) Kirjoita funktio joka palauttaa listoissa numbers1 ja numbers2 esiintyvien yhteisten numeroiden määrän
/*fun numCommon(numbers1: List<Int>, numbers2: List<Int>): Int {
    var oikeatNumerot = mutableListOf<Int>()
    for (i in numbers1) {
        for (x in numbers2){
            if(i == x) oikeatNumerot.add(i)
        }
    }

    return oikeatNumerot.size
}*/


// 6*) Kirjoita funktio, joka palauttaa n numeroa lukualueelta rng listana,
// oletuksena Veikkaus Oy:n lotto-peli
fun pickNumbers(rng: IntRange, n: Int): List<Int> { return listOf() }







fun main() {
    //val oikea = arvattu.filter { it == 77 }
    //println(oikea)
    //println(numCommon(numbers1, numbers2))


    println(numbers2.distinct().count())



}








/*
import java.util.*

fun randomDay() : String {
    val week = arrayOf ("Monday", "Tuesday", "Wednesday", "Thursday",
        "Friday", "Saturday", "Sunday")
    return week[Random().nextInt(week.size)]
}

fun fishFood (day : String) : String {
    return when (day) {
        "Monday" -> "flakes"
        "Tuesday" -> "pellets"
        "Wednesday" -> "redworms"
        "Thursday" -> "granules"
        "Friday" -> "mosquitoes"
        "Saturday" -> "lettuce"
        "Sunday" -> "plankton"
        else -> "nothing"
    }
}

fun feedTheFish() {
    val day = randomDay()
    val food = fishFood(day)
    println ("Today is $day and the fish eat $food")
    println("Change water: ${shouldChangeWater(day)}")

}

fun swim(speed: String = "fast") {
    println("swimming $speed")
}

fun shouldChangeWater(day: String, temperature: Int = 22, dirty: Int = 20) : Boolean {
    return when {
        isTooHot(temperature) -> true
        isDirty(dirty) -> true
        isSunday(day) -> true
        else -> false
    }
}

fun isTooHot(temperature: Int) = temperature > 30
fun isDirty(dirty: Int) = dirty > 30
fun isSunday(day: String) = day == "sunday"

fun main(args: Array<String>) {
    feedTheFish()
}*/