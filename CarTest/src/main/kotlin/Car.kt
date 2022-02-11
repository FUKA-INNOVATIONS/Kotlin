// Fuwad Kalhori
// 2008798

class Car(var registerID:String, val brand:String) {

    val tankCapacity: Int = 50
    var fuelLevel : Int = 50
    var fuelDecrement: Int = 1

    var speed: Int = 0
    val maxSpeed: Int = 50
    var speedIncrement: Int = 1

    fun accelerate(): Boolean {

        if (speed <= maxSpeed && fuelLevel > 0 && fuelLevel >= fuelDecrement) {
            fuelLevel -= fuelDecrement
            speed = minOf(maxSpeed, (speed + 1))
        }

        if (fuelLevel < fuelDecrement) return false else return true
    }

    fun fillTank(newFuelLevel: Int) {
        fuelLevel = minOf(newFuelLevel, tankCapacity)
    }

    fun stopTheCar() {
        speed = 0
    }
}