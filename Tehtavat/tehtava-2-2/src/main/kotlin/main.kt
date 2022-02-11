import java.lang.NumberFormatException

// 2) Kirjoita funktio, joka lukee riveittäin käyttäjän syöttämiä, pilkuilla toisistaan erotettuja lukuja,
// kunnes syöte on laillinen lottorivi (n keskenään erisuurta numeroa jotka ovat välillä rng, oletuksena
// n = 7 ja rng 1..40).
// Funktio palauttaa käyttäjän syöttämät numerot listana kokonaislukuja. Vihje: käytä funktiota readline()
// käyttäjän antaman syötteen lukemiseen.


fun readNumbers(rng: IntRange = 1..40, n: Int = 7): List<Int> {
    val range = rng
    var numbers = listOf<Int>()

    println("Pelaa")
    while (true) {
        try {
            numbers = readLine()!!.split(",").map { it.toInt() }
            val koko = numbers.size
            if (koko < n || koko > n) {
                for (number in numbers) {
                    if (number !in range) {
                        println("Lukujen suuruus on virheellinen, niiden tulisi olla välilltä $rng. Kokeile onnesi uudestaan!")
                        break
                    }
                }
                println("Lukujen määrä on virheellinen, kirjoita $n numeroa pilkulla erotettuna ilman välilyöntiä. Kokeile onnesi uudestaan!")
                continue
            } else return numbers
        } catch (e: NumberFormatException) {
            println("Virheellisiä numeroita, anna numeroita eikä kirjaimia ja yritä uudestaan")
            continue
        }
    }
}


fun lisaa (numero: Int, lista: List<Int>) : Boolean {
    var lista = mutableListOf<Int>()
    if (!lista.contains(numero)){
        lista.add(numero)
        return false
    } else
        return true
}


fun main(args: Array<String>) {

    val rivi = readNumbers()
    println(rivi)






}