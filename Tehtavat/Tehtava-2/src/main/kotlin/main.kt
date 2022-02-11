import kotlin.math.abs

fun main(args: Array<String>) {


// Nimi: Fuwad Kalhori
// Opiskelijanumero: 2008798


// 1
// kirjoita funktion pickNumber lyhennettyyn muotoon
// ja laita range parametrille oletusarvoksi range 1:stä 6:een
//fun pickNumber(range: IntRange): Int {
//    return range.random()
//}
    val pickNumber = { range: IntRange -> ( range.random() ) }



    // 2
// kirjoita funktio, joka tulostaa n kappletta random lukuja 1 ja 100 väliltä
    fun printMultipleRandoms(amount: Int) {
        for (i in 1..amount) {
            println(pickNumber(1..100))
        }
    }



//  3
// Kirjoita funktio, joka heittää 10 (oletusarvo) noppaa  1000 (oletusarvo) kertaa  ja listaa kullakin nopalla heitetyn
// silmälukujen summan suuruusjärjestyksessä. Käytä pickNumber funtiota.


    // 4
// Oheisten tehtävien tekeminen kannattaa aloittaa yksinkertaisista funktioista (merkitty *:llä) -
// niistä koostamalla on helpompi toteuttaa monimutkaisemmat.
    fun main() {
        //playLotto()
    }

    // 1) Kirjoita funktio, joka
// 1. arpoo uuden lottorivin
// 2. lukee käyttäjän arvaaman laillisen lottorivin ja kertoo kuinka monta numeroa siinä on oikein
// 3. tekee askeleet 1 ja 2 uudesta mikäli käyttäjä haluaa
    fun playLotto() {}

    // 2) Kirjoita funktio, joka lukee riveittäin käyttäjän syöttämiä, pilkuilla toisistaan erotettuja lukuja,
// kunnes syöte on laillinen lottorivi (n keskenään erisuurta numeroa jotka ovat välillä rng, oletuksena
// n = 7 ja rng 1..40).
// Funktio palauttaa käyttäjän syöttämät numerot listana kokonaislukuja. Vihje: käytä funktiota readline()
// käyttäjän antaman syötteen lukemiseen.
    fun readNumbers(rng: IntRange, n: Int): List<Int> { return listOf() }

    // 3*) Kirjoita funktio joka palauttaa listoissa numbers1 ja numbers2 esiintyvien yhteisten numeroiden määrän
    fun numCommon(numbers1: List<Int>, numbers2: List<Int>): Int { return 0 }

    // 4*) Kirjoita funktio, joka palauttaa luvun i esiintymien määrän listassa numbers
    fun numOccurences(i: Int, numbers: List<Int>): Int { return 0 }

    // 5*) Kirjoita funktio, joka palauttaa listassa numbers olevien erisuurten lukujen määrän
// vihje: käytä joukkoa
    fun numUnique(numbers: List<Int>): Int { return 0 }

    // 6*) Kirjoita funktio, joka palauttaa n numeroa lukualueelta rng listana,
// oletuksena Veikkaus Oy:n lotto-peli
    fun pickNumbers(rng: IntRange, n: Int): List<Int> { return listOf() }




}