package `when`

fun main() {
    var numberOfFish = 8

    when (numberOfFish) {
        in 11..20 -> println("in 11..20")
        40 -> {
            println("Fish 40")
            println("in a block")
        }
        in 1..10 -> if (numberOfFish == 7) println("in 1..10 - exactly 7") else println("in 1..10")
    }

}