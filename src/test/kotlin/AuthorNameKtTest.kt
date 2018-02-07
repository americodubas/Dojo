import org.junit.Test
import org.junit.Assert.*

class AuthorNameTest {

    @Test
    fun formatAuthorName() {
        assertEquals("SILVA, Joao", formatAuthorName("Joao Silva"))
        assertEquals("ARAUJO, Celso de", formatAuthorName("celso DE araujo"))

    }

    @Test
    fun oneName() {
        assertEquals("GUIMARAES", formatAuthorName("Guimaraes"))
    }

    @Test
    fun twoName() {
        assertEquals("SILVA, Joao", formatAuthorName("joao silva"))
    }

    @Test
    fun threeName() {
        assertEquals("SILVA NETO, Joao", formatAuthorName("joao silva neto"))
    }
}