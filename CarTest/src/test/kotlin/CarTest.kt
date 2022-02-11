import org.junit.jupiter.api.Test

import org.junit.jupiter.api.Assertions.*

internal class CarTest {

    private val myCar = Car("ABC-123", "Volvo")

    @Test
    fun testConstructor () {
        val aCar = Car("BBY-987", "VW")
        assertTrue(aCar.registerID == "BBY-987","New car got wrong register id")
        assertTrue(aCar.brand == "VW","Brand for the new car was wrong")
        assertTrue(aCar.fuelLevel == aCar.tankCapacity, "Tank was not full")
        assertTrue(aCar.speed == 0, "Inital speed was not 0")
    }

    @Test
    fun accelerateShouldConsumeGasAndIncreaseSpeed() {
        val speed = myCar.speed
        val fuelLevel = myCar.fuelLevel
        assertTrue(myCar.accelerate(),"acceleration failed")
        assertTrue(myCar.fuelLevel == fuelLevel - myCar.fuelDecrement, "Wrong amount of fuel used")
        assertTrue(myCar.speed == speed + myCar.speedIncrement, "Speed after acceleration was wrong")
    }

    @Test
    fun maxSpeedShouldNotBeExceeded() {
        while (myCar.accelerate()) {
            myCar.fillTank(myCar.tankCapacity - myCar.fuelLevel)
        }
        assertTrue(myCar.speed <= myCar.maxSpeed, "Maximum speed was exceeded")
    }

    @Test
    fun whenStoppedSpeedShouldBe0 () {
        myCar.accelerate()
        myCar.accelerate()
        assertTrue(myCar.speed > 0, "Speed of accelerated car was zero")
        myCar.stopTheCar()
        assertTrue(myCar.speed == 0, "Speed of the stopped car was not zero")
    }

    @Test
    fun fillTankBaseCase() {
        // lets run the tank empty
        while (myCar.fuelLevel > 1) {
            while(myCar.accelerate()) {}
            myCar.stopTheCar()
        }
        val initialFuelLevel = myCar.fuelLevel
        myCar.fillTank(myCar.tankCapacity - 10)
        assertTrue(myCar.fuelLevel == initialFuelLevel + myCar.tankCapacity - 10, "Wrong amount of fuel in tank after filling")
    }

    @Test
    fun OverFillingTheTankShouldNotSucceed() {
        while (myCar.accelerate()) {}
        myCar.stopTheCar()
        val fuelLevel = myCar.fuelLevel
        myCar.fillTank(myCar.tankCapacity - fuelLevel + 1)
        assertTrue(myCar.fuelLevel == myCar.tankCapacity, "Tank was overfilled")
    }
}