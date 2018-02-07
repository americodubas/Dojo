class AutorNameFormatter {

    /*
Seu desafio é fazer um programa que leia um número inteiro correspondendo ao número de nomes que será fornecido, e, a seguir, leia estes nomes (que podem estar em qualquer tipo de letra) e imprima a versão formatada no estilo exemplificado acima.

As seguintes regras devem ser seguidas nesta formatação:
o sobrenome será igual a última parte do nome e deve ser apresentado em letras maiúsculas;
se houver apenas uma parte no nome, ela deve ser apresentada em letras maiúsculas (sem vírgula): se a entrada for “ Guimaraes” , a saída deve ser “ GUIMARAES”;
se a última parte do nome for igual a "FILHO", "FILHA", "NETO", "NETA", "SOBRINHO", "SOBRINHA" ou "JUNIOR" e houver duas ou mais partes antes, a penúltima parte fará parte do sobrenome. Assim: se a entrada for "Joao Silva Neto", a saída deve ser "SILVA NETO, Joao" ; se a entrada for "Joao Neto" , a saída deve ser "NETO, Joao";
as partes do nome que não fazem parte do sobrenome devem ser impressas com a inicial maiúscula e com as demais letras minúsculas;
"da", "de", "do", "das", "dos" não fazem parte do sobrenome e não iniciam por letra maiúscula.
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