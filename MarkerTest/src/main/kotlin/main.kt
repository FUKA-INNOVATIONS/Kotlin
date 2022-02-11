fun main(args: Array<String>) {
    val marker = Marker("Red",-35)
    marker.capOff()
    marker.draw()
    println(marker.inkLevel)

}