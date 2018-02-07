import org.junit.Assert.*
import org.junit.Test

class AutorNameFormatterTest {

    @Test
    fun should_split_name_by_space() {
        var teste = "Joao Silva Neto"
        var name = AutorNameFormatter().getSplittedName(teste)
        assertEquals(name.size, 3)
    }

    @Test
    fun is_last_name_ignored() {
        val expected = true
        val nameSplitted = listOf("Joana","Filha")
        var valueReturned = AutorNameFormatter().isExisteUltimoNome(nameSplitted)

        assertEquals(expected, valueReturned)
    }

    @Test
    fun resolve_nome_length_2() {
        val expected = "FILHA, Joana"
        val nameSplitted = listOf("Joana","Filha")
        var valueReturned = AutorNameFormatter().resolveLastName(nameSplitted)

        assertEquals(expected, valueReturned)
    }

}