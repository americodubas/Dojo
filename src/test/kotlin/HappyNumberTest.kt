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

}