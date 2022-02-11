abstract class AqariumFish : FishAction {
    abstract val color: String
    override fun eat() = println("yum")
}

class Shark : AqariumFish(), FishAction {
    override val color = "gray"
    override fun eat() {
        println("hunt and eat fish")
    }
}

class Plecostomus : AqariumFish(), FishAction {
    override val color = "gold"
    override fun eat() {
        println("eat algae")
    }
}

interface FishAction {
    fun eat()
}
