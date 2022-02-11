import org.junit.jupiter.api.Test

import org.junit.jupiter.api.Assertions.*

internal class PersonTest {

    val myPerson = Person(name = "Petri", 120.0, 160)

    @Test
    fun BMI() {
        assertTrue(myPerson.BMI() > 46.8 && myPerson.BMI() < 46.9, "BMI calculation failed")
    }

    @Test
    fun testConstructor() {
        assertTrue(myPerson.name == "Petri", "Created person with Petri, but got something else")
        assertTrue(myPerson.height == 160, "Created person with 160 cm height, but got something else")
    }

}