import org.junit.Test
import org.junit.Assert.*

class AuthorNameTest {

    @Test
    fun oneName() {
        assertEquals("GUIMARAES", formatAuthorName("Guimaraes"))
    }

    @Test
    fun twoNames() {
        assertEquals("SILVA, Joao", formatAuthorName("joao silva"))
    }

    @Test
    fun twoNamesWithException() {
        assertEquals("ARAUJO, Celso de", formatAuthorName("celso de araujo"))
    }

    @Test
    fun threeNames() {
        assertEquals("COELHO, Paulo Cesar", formatAuthorName("paulo cesar coelho"))
    }

    @Test
    fun threeNamesWithException() {
        assertEquals("SILVA NETO, Joao da", formatAuthorName("joao da silva neto"))
    }
}