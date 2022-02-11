package nullability

fun main() {

    var marbles: Int? = null
    var integer: Int? = null
    var big: Int? = null
    var input: String?

    input = readLine()
    integer = input?.toIntOrNull() ?: 90
    //var integer2 = integer ?: 44

    // 90 is printed
    println(integer)


}