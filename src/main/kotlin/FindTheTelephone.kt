/**
Em alguns lugares é comum lembrar um número do telefone associando seus dígitos a letras.
Dessa maneira a expressão MY LOVE significa 69 5683. Claro que existem alguns problemas,
uma vez que alguns números de telefone não formam uma palavra ou uma frase e os dígitos 1 e 0
não estão associados a nenhuma letra.
Sua tarefa é ler uma expressão e encontrar o número de telefone correspondente baseado na
tabela abaixo. Uma expressão é composta por letras maiúsculas (A-Z), hifens (-) e os números
1 e 0.

Letras  ->  Número
ABC    ->  2
DEF    ->  3
GHI    ->  4
JKL    ->  5
MNO    ->  6
PQRS    ->  7
TUV    ->  8
WXYZ   ->  9

 Exemplo de entrada:

1-HOME-SWEET-HOME
MY-MISERABLE-JOB
Saída correspondente:

1-4663-79338-4663
69-647372253-562
 * */

class FindTheTelephone {

    companion object {
        private val characters = arrayListOf("ABC", "DEF", "GHI", "JKL", "MNO", "PQRS", "TUV", "WXYS")
        private val exceptions = "-10"
    }

    fun converter(phoneWithLeters: String): String {

        val phone = StringBuilder()


        phoneWithLeters.forEach {
            phone.append(convertLetterToNumber(it))
        }

        return phone.toString()
    }

    fun convertLetterToNumber(char: Char): String {
        if (isException(char)) return char.toString()

        var number = 1
        characters.find {
            number++
            it.contains(char)
        }

        return number.toString()
    }

    private fun isException(char: Char) = exceptions.contains(char)

}