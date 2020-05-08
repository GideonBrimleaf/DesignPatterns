package test.strategy_pattern_tests

import org.junit.Test
import strategy_pattern_models.adventure_time.Bard
import strategy_pattern_models.adventure_time.ShortSword
import kotlin.test.assertEquals

class BardTest {

    val gideon = Bard("Gideon Brimleaf")

    @Test
    fun `Gideon can fight`(){
        assertEquals("Sonic Blast!", gideon.fight())
    }

    @Test
    fun `Gideon can change weapons`(){
        gideon.weapon = ShortSword()
        assertEquals("Swish Swish! Clang Clang!", gideon.fight())
    }
}