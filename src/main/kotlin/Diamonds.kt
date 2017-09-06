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

    private var leftSpace = 0
    private var spaceBetweenLetters = 0
    private var firstLetter = true

    fun diamondGenerator(letter: Char): Array<String?> {

        val letters = 'A' until  letter + 1
        val lines = arrayOfNulls<String>(letters.count() * 2 - 1)
        var firstPosition = 0
        var lastPosition = lines.size - 1

        leftSpace = letters.count()
        spaceBetweenLetters = 1

        letters.forEach{
            val line = generateLine(it)

            lines[firstPosition++] = line
            lines[lastPosition--] = line
        }

        return lines
    }

    private fun generateLine(it: Char): String {
        val line = StringBuilder()
                .append("${repeatSpace(leftSpace)}$it")

        if (!firstLetter) {
            line.append("${repeatSpace(spaceBetweenLetters)}$it")
            spaceBetweenLetters += 2
        } else {
            firstLetter = false
        }

        leftSpace--

        return line.toString()
    }

    fun repeatSpace(t: Int):String {
        return " ".repeat(t)
    }

}