import org.junit.Assert.*
import org.junit.Test

class DiamondsTest{

    @Test
    fun should_print_diamond() {
        val lines = Diamonds().diamondGenerator('F')
        lines.forEach {
            println(it)
        }
    }

    @Test
    fun should_return_a_diamond_from_A_to_C_with_five_lines() {
        val lines = Diamonds().diamondGenerator('C')

        assertEquals(lines.size, 5)
        assertEquals("   A", lines[0])
        assertEquals("  B B", lines[1])
        assertEquals(" C   C", lines[2])
        assertEquals("  B B", lines[3])
        assertEquals("   A", lines[4])
    }

    @Test
    fun should_return_three_spaces() {
        assertEquals("   ", Diamonds().repeatSpace(3))
    }

}