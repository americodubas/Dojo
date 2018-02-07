

class AutorNameFormatter {

/**

     */
    var lastNameRule = arrayOf("FILHO", "FILHA", "NETO", "NETA", "SOBRINHO", "SOBRINHA")

    var secondSurnameRule = arrayOf("da", "de", "do", "das", "dos")

    fun verifyLastName(nome: String): String {
        var completeName = getSplittedName(nome)

        isExisteUltimoNome(completeName)

        return ""
    }

    fun getSplittedName(nome: String): List<String> {
        return nome.split(Regex(" "))
    }

    fun isExisteUltimoNome(completeName: List<String>): Boolean {

        var ultimoNome = completeName[completeName.size - 1]
        return lastNameRule.contains(ultimoNome.toUpperCase())
    }

    fun isExisteSecondSurnameRule(completeName: List<String>): Boolean {

        var ultimoNome = completeName[completeName.size - 1]
        return lastNameRule.contains(ultimoNome.toUpperCase())
    }

    fun resolveLastName (completeName: List<String>): String {

        if (completeName.size == 2) {
            return formatCompleteName(completeName[1], completeName[0])
        }

        var isLastNameRule = isExisteUltimoNome(completeName)

        var isSecondSurname = isSecondSurname(completeName)



        return ""
    }

    fun formatCompleteName(surname: String, name: String): String {
        return surname.toUpperCase()+", "+name
    }

    fun isSecondSurname(completeName: List<String>): Boolean {

        var ultimoNome = completeName[completeName.size - 2]
        return secondSurnameRule.contains(ultimoNome.toLowerCase())


    }


}