import org.junit.Assert.assertEquals
import org.junit.Test

class ATMachineTest {

    private val hundred = 0
    private val fifty = 1
    private val twenty = 2
    private val ten = 3

    @Test
    fun withdraw_30_one_of_20_and_one_of_10(){
        val bills = ATMachine().withdraw(30)
        assertEquals(bills[twenty], 1)
        assertEquals(bills[ten], 1)
    }

    @Test
    fun withdraw_80_one_of_30_one_of_10(){
        val bills = ATMachine().withdraw(80)
        assertEquals(bills[fifty], 1)
        assertEquals(bills[twenty], 1)
        assertEquals(bills[ten], 1)
    }

    @Test
    fun withdraw_190_one_of_100_one_of_50_two_of_20(){
        val bills = ATMachine().withdraw(190)
        assertEquals(bills[hundred], 1)
        assertEquals(bills[fifty], 1)
        assertEquals(bills[twenty], 2)
    }

}