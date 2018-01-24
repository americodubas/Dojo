import org.junit.Assert.*
import org.junit.Test

class FindTheTelephoneTest {

    @Test
    fun should_print_1_4663_79338_4663() {
        val textoEsperado = "1-4663-79338-4663"
        val textoEntrada = "1-HOME-SWEET-HOME"
        val textoConvertido = FindTheTelephone().converter(textoEntrada)

        assertEquals(textoEsperado, textoConvertido)
    }
}