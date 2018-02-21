
private val unity = mapOf(Pair ("um",1),Pair ("dois",2),Pair ("tres",3),Pair ("quatro",4)
        , Pair ("cinco",5), Pair ("seis",6),Pair ("sete",7),Pair ("oito",8), Pair ("nove",9))

private val dezena = mapOf(Pair ("dez",10),
        Pair ("onze",11),
        Pair ("doze",12),
        Pair ("treze",13),
        Pair ("quatorze",14),
        Pair ("quinze",15),
        Pair ("dezesseis",16),
        Pair ("dezessete",17),
        Pair ("dezoito",18),
        Pair ("dezenove",19),
        Pair ("vinte",20),Pair ("trinta",30),
        Pair ("quarenta",40),Pair ("cinquenta",50),Pair ("sessenta",60),Pair ("setenta",70),
        Pair ("oitenta",80),Pair ("noventa",90))

private val hundred = mapOf(Pair("cem", 100),
        Pair("cento", 100),
        Pair("duzentos", 200),
        Pair("trezentos", 300),
        Pair("quatrocentos", 400),
        Pair("quinhentos", 500),
        Pair("seissentos", 600),
        Pair("seteentos", 700),
        Pair("oitoentos", 800),
        Pair("novecentos", 900))

private val delimiter = arrayOf(" mil", " real", " reais")
private val delimiterCents = arrayOf(" centavo", " centavos")

fun convertDezenaToNumber (fullCheckName: String ) : Int {
    return  when (dezena.contains(fullCheckName.toLowerCase())) {
        true -> dezena.getValue(fullCheckName.toLowerCase())
        false -> 0
    }
}

fun convertUnitToNumber (fullCheckName: String ) : Int {
    return  when (unity.contains(fullCheckName.toLowerCase())) {
            true -> unity.getValue(fullCheckName.toLowerCase())
            false -> 0
        }
}

fun convertHundredToNumber (fullCheckName: String ) : Int {
    return  when (hundred.contains(fullCheckName.toLowerCase())) {
        true -> hundred.getValue(fullCheckName.toLowerCase())
        false -> 0
    }
}

fun splitValueBlock (fullCheckName : String) : List<String> {
    return fullCheckName.split(" e ")
}

fun returnThousandValue (fullCheckName: String) : String {
    var values = fullCheckName.split(delimiterReal)
}
