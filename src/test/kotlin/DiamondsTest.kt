import org.junit.Assert.*
import org.junit.Test

class DiamondsTest{

    @Test
    fun simpleDiamond() {
        Diamonds().diamondGenerator('E')
    }

    @Test
    fun repeatSpaceTest() {
        assertEquals("   ", Diamonds().repeatSpace(3))
    }

}