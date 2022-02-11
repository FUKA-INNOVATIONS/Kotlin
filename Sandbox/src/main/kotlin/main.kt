import java.util.*

fun main() {

    val arr = arrayOf("eka", "toka")
    val v = "JOJOJ"
    val nextNumber = Random().nextInt(arr.size)
    println("Random next int: $nextNumber")


    val waterFilter: (Int) -> Double = { dirty -> dirty / 2.1 }
    println(waterFilter(3))

}

abstract class AbstractClass() {
    abstract fun absFun()
}

// Must have 1 constructor param
// MUST NOT have a body => { }
data class DataClass(val name: String) {  }


//can not have a constructor
interface InterfaceClass {
    fun iFun() { }
}

//can not have a constructor
object Singleton {

}

class NormalClass() : AbstractClass(), InterfaceClass {

    // Must implement abstract fun without a body
    override fun absFun() {
        //TODO("Not yet implemented")
    }
}
