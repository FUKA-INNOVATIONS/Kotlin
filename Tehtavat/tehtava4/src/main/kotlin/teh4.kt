
import javax.print.attribute.standard.Destination

// Boat owner can own many boats
// A boat has only one owner
// There are two types of boats
//
// SailBoat and PowerBoat
// PowerBoat has always an engine
// SailBoat may have an engine
// It should not be possible to create instances of Boat class





// Find below skeleton classes for the project
// Fix them so that they fulfill the requirements above and instruction below
/* print out could look as follows:
        [Norppa, Aallotar, Esmeralda, Mutku, Sitku]
        Esmeralda's sails hoisted
        Sitku's sails hoisted
        [Mutku 12.0, Sitku 12.0]
        Sitku's sails hoisted
        Powerboat Norppa navigating to Turku
        Powerboat Aallotar navigating to Turku
        Sailboat Esmeralda sailing to Turku
        Sailboat Mutku navigating to Turku
        Sailboat Sitku sailing to Turku
* */

fun main() {


    /*
    *  OPE toooudella toivon :) että olen ymmärtänyt tehtävien kuvaukset oikein
    * */

    //1) create an instance of Boatowner
    val boatOnwer = BoatOwner("Fuad K.")
    val boatOwner2 = BoatOwner("Tomas K.")

    //2)  add two powerBoats and three sailboats to the collection
    val pb1 = PowerBoat("Power 100", 11.0, Engine(130), boatOnwer)
    boatOnwer.addBoat(pb1)
    val pb2 = PowerBoat("Sea power", 13.8, Engine(110), boatOnwer)
    boatOnwer.addBoat(pb2)
    val sb1 = SailBoat(name = "Saily bird", length = 14.7, engine = Engine(400), owner = boatOnwer)
    boatOnwer.addBoat(sb1)
    val sb2 = SailBoat(name = "We sail", length = 14.7, engine = null, owner = boatOnwer)
    boatOnwer.addBoat(sb2)
    val sb3 = SailBoat(name = "Fin saliors", length = 14.7, engine = null, owner = boatOnwer)
    boatOnwer.addBoat(sb3)




    //3) print the boat names to console
    println(boatOnwer.listBoatNames())

    //4) hoist the sails of the boats that do not have an engine
    boatOnwer.boats.filter { it.engine == null }.map {it.hoistSails() }


    //5)  print names and lenghts of boats that are longer than 11.0 m
    boatOnwer.boats.filter { it.length > 11.0 }.map { println("${it.name}, ${it.length}") }

    //6) navigate with each boat
    boatOnwer.boats.map { it.navigate("Turku") }

}

data class BoatOwner (var name: String) {

    //7) add here a suitable collection for the boats
    val boats = mutableSetOf<Boat>()

    //8) implement the addBoat methods
    fun addBoat(newBoat:Boat) {
        if (this.hashCode() == newBoat.hashCode()) boats.add(newBoat) else println("Boat not added because it doesnt belong to this owner.")
    }

    //9) function will call navigate() each boat in the collection
    fun navigateAllBoats(destination: String) = boats.map { it.navigate(destination) }

    // function that returns boatnames as a list
    fun listBoatNames():List<String> = boats.map { it.name }

    // function that returns the boats -list
    fun boats():List<Boat> = boats.toList()
}

//10) Boat class should be such that no instances can be created
abstract class Boat (var name:String, val length:Double, var engine:Engine? = null, val owner: BoatOwner) {

    /*
    * Yritin ylikirjoittaa equals metodia ja luoda hashcodea
    * mutta
    * main funktiossa tai missään muuallakaan vertailu ei ollut sallittua
    * sain kokoajan virheilmoituksia että ei saa verrata toisiinsa
    * joten
    * keksin tämän ratkaisun joka on toisin sanoin puhdasta luovuutta =D
    * */
    override fun hashCode(): Int = owner.hashCode()

    open fun navigate (destination:String) = println ("Boat $name is navigating to $destination")

    open fun hoistSails() { }

    //11) method for starting the engine
    open fun startEngine() = engine?.start()

    //12) method for stopping the engine
    open fun stopEngine () = engine?.stop()
}

class PowerBoat(name:String, length: Double, engine: Engine, owner: BoatOwner):Boat(name, length, engine, owner) {

    override fun navigate (destination: String) = println ("Powerboat ${ super.name } navigating to $destination")
}

// 13) Sailboat may have an engine, but by default it has no engine (hint: use nullable type)
// sailboat must have sailArea
class SailBoat(name: String, length: Double, sailArea: String = "Valtameri", engine: Engine? = null, owner: BoatOwner) : Boat(name, length, engine, owner) {

    //14) add a private property (instance variable) for sailsHoisted
    private var sailsHoisted: Boolean = false

    //15) function that hoists the sails
    override fun hoistSails() {
            sailsHoisted = true
            println("${name}'s sails hoisted")
    }

    //16) if sails are hoisted print out "Sailboat nn sailing to xx"
    // if sails are not hoisted, but engine exists print out "Sailboat nn navigating to xx"
    // otherwise print out "sailboat nn's sails are not hoisted and is has no engine
    override fun navigate (destination: String) {
        if ( sailsHoisted ) {
            println ("Sailboat ${ super.name } sailing to $destination")
        } else if ( !sailsHoisted && engine != null ) {
            println ("Sailboat ${ super.name } navigating to $destination")
        } else {
            println ("Sailboat ${ super.name }'s sails are not hoisted and it has no engine")
        }
    }
}


// Engine should have an property/instance variable for engineOn
// as well as start() and stop() -methods

class Engine (val hp:Int) {
    private var engineIsOn = false

    fun start() { engineIsOn = true }
    fun stop() { engineIsOn = false }
}