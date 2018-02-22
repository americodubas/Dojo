import org.junit.Test

import org.junit.Assert.*

class ReadCheckKtTest {

    @Test
    fun splitValueBlock() {
        assertEquals(listOf("cento", "dez"), splitTheAndSeparator("cento e dez"))
        assertEquals(listOf("trezentos", "cinquenta", "dois"), splitTheAndSeparator("trezentos e cinquenta e dois"))
    }

    @Test
    fun convertFullCheckToNumber() {
        assertEquals(2000.0f, convertCheckToNumber("dois mil reais"))
        assertEquals(52000.0f, convertCheckToNumber("cinquenta e dois mil reais"))
        assertEquals(52641.0f, convertCheckToNumber("cinquenta e dois mil seiscentos e quarenta e um reais"))
        assertEquals(600.0f, convertCheckToNumber("seiscentos reais"))
        assertEquals(1000000.0f, convertCheckToNumber("um milhão reais"))
        assertEquals(1.0f, convertCheckToNumber("um real"))
        assertEquals(1.25f, convertCheckToNumber("um real e vinte e cinco centavos"))
        assertEquals(1234567.89f, convertCheckToNumber("um milhão duzentos e trinta e quatro mil quinhentos e sessenta e sete reais e oitenta e nove centavos"))
    }
}