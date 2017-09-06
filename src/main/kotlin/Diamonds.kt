/**
 * Dado uma letra ('A' a 'Z'), exiba um diamante iniciando em 'A' e tendo a letra fornecida com o ponto mais distante.
 * Por exemplo, dado a letra 'E' temos:
 *     A
 *    B B
 *   C   C
 *  D     D
 * E       E
 *  D     D
 *   C   C
 *    B B
 *     A
 *
 * Dado a letra 'C' temos:
 *   A
 *  B B
 * C   C
 *  B B
 *   A
 */
class Diamonds {

    var space = 0
    var spaceBetween = 0

    fun diamondGenerator(letter: Char) {
        val letters = 'A' until  letter+1
        space = letters.count()
        spaceBetween = 1
        letters.forEach{
            printDiamond(-1, 2, letters.count(), it)
        }

        space = 2
        spaceBetween -= 4
        val lettersReversed  = letters.reversed().drop(1)
        lettersReversed.forEach {
            printDiamond(1, -2, letters.count(), it)
        }

    }

    private fun printDiamond(spaceIncrement: Int, spaceBetweenIncrement: Int, lettersCount: Int, it: Char) {
        print("${repeatSpace(space)}$it")
        if (space != lettersCount) {
            print("${repeatSpace(spaceBetween)}$it")
            spaceBetween += spaceBetweenIncrement
        }

        println()
        space += spaceIncrement
    }

    fun repeatSpace(times: Int):String {
        return " ".repeat(times)
    }

}