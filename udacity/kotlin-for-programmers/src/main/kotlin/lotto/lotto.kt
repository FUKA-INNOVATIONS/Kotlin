package lotto

val strs = "name, 2012, 2017".split(",").toTypedArray()

fun pickNumber(range: IntRange = 1..6) = range.random()


fun main() {

    fun numCommon(numbers1: List<Int>, numbers2: List<Int>): Int { return 0 }

    fun numOccurences1(i: Int, numbers: List<Int>) = numbers.filter { it == i }.size


}