import org.junit.Test

import org.junit.Assert.*

class HappyNumberTest {

    @Test
    fun should_return_true_when_number_is_seven() {
        assertTrue(HappyNumber().isHappyNumber(7))
    }

    @Test
    fun should_return_false_when_number_is_eight() {
        assertFalse(HappyNumber().isHappyNumber(8))
    }

    @Test
    fun should_return_eight_from_power_and_sum_twenty_two(){
        assertEquals(HappyNumber().powerAndSumEachNumber(22), 8)
    }

    @Test
    fun should_return_true_if_number_was_used(){
        val happy = HappyNumber()
        happy.usedNumbers.add(1)
        assertTrue(happy.numberAlreadyUsed(1))
    }

    @Test
    fun should_return_false_if_number_was_not_used(){
        val happy = HappyNumber()
        happy.usedNumbers.add(1)
        assertFalse(happy.numberAlreadyUsed(2))
    }

    @Test
    fun find_happy_numbers() {
        val numbers = 1 until 100
        numbers.forEach {
            if (HappyNumber().isHappyNumber(it)) {
                println(it)
            }
        }
    }

}