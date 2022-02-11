// Fuwad Kalhori
// 2008798

import org.junit.jupiter.api.Test

import org.junit.jupiter.api.Assertions.*

internal class MarkerTest {
    val marker = Marker("Red")

    @Test
    fun testConstructor() {
        val marker = Marker("Brown", 239)
        assertTrue(marker.color == "Brown", "Marker got wrong color")
        assertTrue(marker.inkCapacity == 239, "Marker got wrong ink capacity")
    }

    @Test
    fun getCapIsOn() {
        val marker = Marker("Red")
        assertEquals(true, marker.capIsOn)
    }

    @Test
    fun getInkDecrement() {
        assertEquals(10, marker.inkDecrement)
    }

    @Test
    fun getInkLevel() {
        val marker = Marker("Blue", 33)
        assertEquals(33, marker.inkLevel)
    }

    @Test
    fun capOff() {
        marker.capOff()
        assertFalse(marker.capIsOn, "Cap should be off but it is still on")
    }

    @Test
    fun capOn() {
        marker.capOff()
        assertFalse(marker.capIsOn, "Cap should be off but it is still on")
        marker.capOn()
        assertTrue(marker.capIsOn, "Cap should on of but it is still off")
    }

    @Test
    fun draw() {
        marker.capOff()
        marker.draw()
        assertEquals(90, marker.inkLevel )


        val marker2 = Marker("Red",-35)
        marker2.capOff()
        marker2.draw()
        println(marker2.inkLevel)
        assertEquals(-35, marker2.inkLevel )

        val marker3 = Marker("Red", -200)
        assertEquals(false, marker3.draw())
    }

    @Test
    fun fillTank() {
        marker.fillTank(30)
        assertEquals(100, marker.inkLevel)
    }

    @Test
    fun getInkCapacity() {
        val marker = Marker("Lightblue", -45)
        assertEquals(-45, marker.inkCapacity)
    }
}