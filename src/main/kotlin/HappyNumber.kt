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
    private val happyNumber = 1

    fun isHappyNumber(number: Int): Boolean {

        val sum = powerAndSumEachNumber(number)

        if ( sum == happyNumber ) {
            return true
        }

        if (numberAlreadyUsed(sum)){
            return false
        }

        return isHappyNumber(sum)
    }

    fun numberAlreadyUsed(number: Int): Boolean {
        if (usedNumbers.contains(number)){
            return true
        }
        usedNumbers.add(number)
        return false
    }

    fun powerAndSumEachNumber(number: Int): Int {
        var sum = 0
        var intValue: Int
        var digit = number

        while (digit > 0) {
            intValue = digit % 10
            sum += intValue * intValue
            digit /= 10
        }
        return sum
    }


}