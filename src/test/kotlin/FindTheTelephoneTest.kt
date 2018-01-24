import org.junit.Assert.*
import org.junit.Test

class FindTheTelephoneTest {

    @Test
    fun should_convert_phone_with_letters_to_numbers() {
        val inText = "1-HOME-SWEET-HOME"
        val expected = "1-4663-79338-4663"

        assertEquals(expected, FindTheTelephone().converter(inText))
    }

    @Test
    fun a_should_return_2() {
        assertEquals(FindTheTelephone().convertLetterToNumber('A'), "2")
    }

    @Test
    fun one_should_return_one() {
        assertEquals(FindTheTelephone().convertLetterToNumber('1'), "1")
    }

    @Test
    fun hifen_should_return_hifen() {
        assertEquals(FindTheTelephone().convertLetterToNumber('-'), "-")
    }

    @Test
    fun zero_should_return_zero() {
        assertEquals(FindTheTelephone().convertLetterToNumber('0'), "0")
    }
}