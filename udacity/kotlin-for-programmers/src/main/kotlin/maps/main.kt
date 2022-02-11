package maps

fun main() {

    val player1: Int = 1
    val player2: Int = 2
    val player3: Int = 3

    val tilasto = mutableMapOf<Int, Int>()

    tilasto[player1] = 4
    val uusiNoppa = 34
    tilasto[player1] = tilasto[player1]?.plus(uusiNoppa) ?: uusiNoppa
    tilasto[player2] = 56
    tilasto[player3] = 6

    val result = tilasto.toList().sortedBy { (_, value) -> value}.toMap()
    //println(result)
    println(tilasto.toList().sortedBy { (_, value) -> value}.toMap())

    /*for (pisteet in result) {
        println("Pelaaja ${pisteet.key}: ${pisteet.value}")
    }*/





}