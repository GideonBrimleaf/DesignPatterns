package test.adapter_pattern_test

import adapter_pattern_models.duck_sim.Mallard
import adapter_pattern_models.duck_sim.TurkeyAdapter
import adapter_pattern_models.duck_sim.WildTurkey
import org.junit.Test
import kotlin.test.assertEquals

class DuckSimTest {

    @Test
    fun `Turkey can be a Duck`() {
        val ducko = Mallard()
        val turkeh = WildTurkey()
        val adapter = TurkeyAdapter(turkeh)

        assertEquals("Mallard Quacking!", ducko.quack())
        assertEquals( "Wild gobble gobble!", adapter.quack())
        assertEquals("Tukeh fly! Tukeh fly! Tukeh fly! Tukeh fly! Tukeh fly!", adapter.fly())
    }
}