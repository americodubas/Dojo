import org.junit.Test

import org.junit.Assert.*

class ReadCheckKtTest {

    @Test
    fun convertUnitToNumber() {
        assertEquals(1, convertUnitToNumber("um"))
        assertEquals(2, convertUnitToNumber("dois"))
    }

    @Test
    fun convertDezenaToNumber() {
        assertEquals(10, convertDezenaToNumber("dez"))
        assertEquals(20, convertDezenaToNumber("vinte"))
    }

    @Test
    fun convertHundredToNumber() {
        assertEquals(100, convertHundredToNumber("cem"))
        assertEquals(100, convertHundredToNumber("cento"))
        assertEquals(600, convertHundredToNumber("seissentos"))
    }

    @Test
    fun splitValueBlock() {
        assertEquals(listOf("cento", "dez"), splitValueBlock("cento e dez"))
        assertEquals(listOf("trezentos", "cinquenta", "dois"), splitValueBlock("trezentos e cinquenta e dois"))
    }

    @Test
    fun returnThousandValue() {
        assertEquals(true, returnThousandValue("trezentos e vinte e cinco mil"))
        assertEquals(false, returnThousandValue("trezentos e cinquenta e dois"))
    }
}