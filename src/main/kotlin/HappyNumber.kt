import java.util.*

/**
 * Você está resolvendo este problema.
 * Este problema foi utilizado em 181 Dojo(s).
 * Para saber se um número é feliz, você deve obter o quadrado de cada dígito deste número,
 * em seguida você faz a soma desses resultados.
 * A seguir o mesmo procedimento deve ser feito com o valor resultante desta soma.
 * Se ao repetir o procedimento diversas vezes obtivermos o valor 1,
 * o número inicial é considerado feliz.
 * Tomamos o 7, que é um número feliz:
 * 7² = 49
 * 4² + 9² = 97
 * 9² + 7² = 130
 * 1² + 3² + 0² = 10
 * 1² + 0² = 1
 * Podemos observar nesse exemplo que os números 49, 97, 130 e 10 também são felizes.
 * Existem infinitos números felizes.
 * E um número triste? Como sabemos que um número não será feliz?
 * Desenvolva um programa que determine se um número é feliz ou triste.
 */
class HappyNumber {

    val usedNumbers = TreeSet<Int>()

    fun isHappyNumber(number: Int): Boolean {

        val charactersOfNumber = number.toString().toCharArray()
        var sum = 0
        var intValue: Int

        charactersOfNumber.forEach {
            intValue = it.toString().toInt()
            sum += intValue * intValue
        }

        if ( sum == 1 ) {
            return true
        }

        if (usedNumbers.contains(sum)){
            return false
        }
        usedNumbers.add(sum)

        return isHappyNumber(sum)
    }
}