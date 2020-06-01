package test.template_method_pattern

import org.junit.Assert.assertArrayEquals
import org.junit.Test
import template_method_pattern_models.Duck
import java.util.*
import kotlin.collections.ArrayList
import kotlin.test.assertEquals
import kotlin.test.assertFalse
import kotlin.test.assertTrue

class DuckTest {

    @Test
    fun `Can sort ducks`() {

        val daffy = Duck("Daffy", 8)
        val dewey = Duck("Dewey", 2)
        val howard = Duck("Howard", 7)
        val louie = Duck("Louie", 2)
        val donald = Duck("Donald", 10)
        val huey = Duck("Huey", 2)

        val demDucks = arrayOf(
            daffy, dewey, howard, louie, donald, huey
        )

        Arrays.sort(demDucks)

        assertTrue(
            arrayOf(
                dewey, louie, huey, howard, daffy, donald
            ).contentEquals(demDucks)
        )
    }
}