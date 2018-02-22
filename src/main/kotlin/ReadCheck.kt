/**
 * Dado um cheque com o seu valor por extenso,
 * desenvolva um programa que retorne o seu valor numérico.
 * Por exemplo
 * se informarmos "dois mil quinhentos e vinte e três reais e dezoito centavos",
 * o seu programa deve retornar "2523,18"
 *
 */

//This map contains all numbers names and values to a maximum of XXX
private val numberValue = mapOf(
        "um" to 1,
        "dois" to 2,
        "tres" to 3,
        "quatro" to 4,
        "cinco" to 5,
        "seis" to 6,
        "sete" to 7,
        "oito" to 8,
        "nove" to 9,
        "dez" to 10,
        "onze" to 11,
        "doze" to 12,
        "treze" to 13,
        "quatorze" to 14,
        "quinze" to 15,
        "dezesseis" to 16,
        "dezessete" to 17,
        "dezoito" to 18,
        "dezenove" to 19,
        "vinte" to 20,
        "trinta" to 30,
        "quarenta" to 40,
        "cinquenta" to 50,
        "sessenta" to 60,
        "setenta" to 70,
        "oitenta" to 80,
        "noventa" to 90,
        "cem" to  100,
        "cento" to  100,
        "duzentos" to  200,
        "trezentos" to  300,
        "quatrocentos" to  400,
        "quinhentos" to  500,
        "seiscentos" to  600,
        "seteentos" to  700,
        "oitoentos" to  800,
        "novecentos" to  900)

//This map contains the three part delimiters and it's multiplier value
//To receive bigger numbers just add a new delimiter
private val delimiterMultiplier = mapOf(
        " milhão " to 1000000.0f,
        " mil " to 1000.0f,
        " reais" to 1.0f,
        " real" to 1.0f,
        " centavos" to 0.01f,
        " centavo" to 0.01f
)

private var remain: String = ""
private var total = 0.0f

//Receives a writen check value and convert to it's value
fun convertCheckToNumber(check: String): Float {
    total = 0.0f
    remain = check
    delimiterMultiplier.forEach{ k, v -> splitByDelimiterAndMultiplyByIt(k, v) }
    return total
}

//This method splits the value according to the delimiters
//The result will be a three part number
//Multiply the number be the delimiter value
fun splitByDelimiterAndMultiplyByIt(key: String, value: Float) {
    if (remain.isEmpty() || !remain.contains(key)) {
        return
    }
    val split = remain.split(key)
    remain = split[1]
    total += convertPartToNumber(split[0]) * value
}

//This method should receive a three part writen number and convert to it's value
fun convertPartToNumber(part: String): Int {
    val split = splitTheAndSeparator(part)
    var sum = 0
    split.forEach {
        if (it.trim().isNotEmpty()) sum += numberValue.getValue(it.trim())
    }
    return sum
}

fun splitTheAndSeparator(fullCheckName : String) = fullCheckName.split(" e ")