// Fuwad Kalhori
// 2008798

// Kirjoita unit test caset Marker luokalle
// line test coverage pitäisi olla yli 80%

class Marker(color: String, val inkCapacity:Int = 100) : DrawingTool(color), Cappable {
    var capIsOn = true
        private set //setter private, getter public
    val inkDecrement = 10

    var inkLevel = inkCapacity
        private set

    override fun capOff() {
        capIsOn = false
    }

    override fun capOn() {
        capIsOn = true
    }

    override fun draw():Boolean {
        if (!capIsOn && ((inkLevel - inkDecrement) >= 0)) {
            print("=")
            inkLevel -= inkDecrement
            return true
        }
        return false
    }

    fun fillTank (fillAmount:Int) {
        inkLevel = minOf(inkLevel + fillAmount, inkCapacity)
    }
}

interface Cappable {
    fun capOn()
    fun capOff()
}

abstract class DrawingTool (val color:String) {
    abstract fun draw():Boolean
}
