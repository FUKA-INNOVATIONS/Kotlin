package functions

import java.util.*

    /*val temperature = 10
    val message = "temp is ${if (temperature > 50) "too worm" else "OK"}"
    println(message)*/


fun main() {
    val lottoNums = 1..40
    val userNums = listOf<Int>(1, 2, 3, 4, 5, 6, 7)
    //for (i in lottoNums) print(i)

    println(userNums[Random().nextInt(2)+1])
}
