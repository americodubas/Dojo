/**
 * Quando se lista o nome de autores de livros, artigos e outras publicações
 * é comum que se apresente o nome do autor ou dos autores da seguinte forma:
 * sobrenome do autor em letras maiúsculas,
 * seguido de uma vírgula e da primeira parte do nome apenas com as iniciais maiúsculas.
 *
 * Por exemplo:
 * SILVA, Joao
 * COELHO, Paulo
 * ARAUJO, Celso de
 *
 * Seu desafio é fazer um programa que leia um número inteiro
 * correspondendo ao número de nomes que será fornecido,
 * a seguir, leia estes nomes (que podem estar em qualquer tipo de letra)
 * e imprima a versão formatada no estilo exemplificado acima.
 *
 * As seguintes regras devem ser seguidas nesta formatação:
 *
 * O sobrenome será igual a última parte do nome e deve ser apresentado em letras maiúsculas;
 *
 * Se houver apenas uma parte no nome, ela deve ser apresentada em letras maiúsculas (sem vírgula),
 * se a entrada for “ Guimaraes” , a saída deve ser “ GUIMARAES”;
 *
 * Se a última parte do nome for igual a "FILHO", "FILHA", "NETO", "NETA", "SOBRINHO", "SOBRINHA" ou "JUNIOR"
 * e houver duas ou mais partes antes, a penúltima parte fará parte do sobrenome,
 * assim: se a entrada for "Joao Silva Neto",
 * a saída deve ser "SILVA NETO, Joao",
 * se a entrada for "Joao Neto",
 * a saída deve ser "NETO, Joao";
 *
 * As partes do nome que não fazem parte do sobrenome devem ser impressas com a inicial maiúscula e com as demais letras minúsculas;
 *
 * Os separadores "da", "de", "do", "das", "dos" não fazem parte do sobrenome e não iniciam por letra maiúscula.
 */
fun formatAuthorName(fullName: String): String {
    val names = fullName.split(" ")
    return when (names.size) {
        1 -> fullName.toUpperCase()
        2 -> twoPartName(names)
        else -> moreThanTwoPartName(names)
    }
}

private fun moreThanTwoPartName(names: List<String>): String {
    val nameBuilder = StringBuilder()

    val numberOfUsedNames = appendSurname(names, nameBuilder)

    nameBuilder.append(",")

    appendFirstName(numberOfUsedNames, nameBuilder, names)

    return nameBuilder.toString()
}

private fun appendSurname(names: List<String>, nameBuilder: StringBuilder): Int {
    return when (isMoreThanOneSurname(names)) {
        true -> appendTwoToSurname(nameBuilder, names)
        false -> appendOneToSurname(nameBuilder, names)
    }
}

private fun appendOneToSurname(nameBuilder: StringBuilder, names: List<String>): Int {
    nameBuilder.append(names.last().toUpperCase())
    return 1
}

private fun appendTwoToSurname(nameBuilder: StringBuilder, names: List<String>): Int {
    nameBuilder.append(names[names.size - 2].toUpperCase() + " " + names.last().toUpperCase())
    return 2
}

private fun isMoreThanOneSurname(names: List<String>) =
        (lastNameExceptions.contains(names.last().toUpperCase())
                && !separators.contains(names[names.size - 2]))

private fun appendFirstName(numberOfUsedNames: Int,
                            nameBuilder: StringBuilder,
                            names: List<String>) {

    for (i in 0..(names.size - 1 - numberOfUsedNames) ) {
        nameBuilder.append(
                capitalizeNameIfNotASeparator(names[i])
        )
    }

}

private fun capitalizeNameIfNotASeparator(s: String): String {
    return when (separators.contains(s.toLowerCase())){
        true -> " " + s.toLowerCase()
        false -> " " + s.capitalize()
    }
}

private fun twoPartName(names: List<String>) = names.last().toUpperCase() + ", " + names.first().capitalize()

private val lastNameExceptions = arrayOf("FILHO", "FILHA", "NETO", "NETA", "SOBRINHO", "SOBRINHA", "JUNIOR")
private val separators = arrayOf("da", "de", "do", "das", "dos")