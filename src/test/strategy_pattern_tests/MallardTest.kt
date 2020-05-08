package test.strategy_pattern_tests

import strategy_pattern_models.duck_sim.Mallard
import org.junit.Test
import kotlin.test.assertEquals

class MallardTest {

    private val danaerys = Mallard("Danaerys")

    @Test
    fun `Duck can fly`(){
        assertEquals("flying", danaerys.performFly())
    }

    @Test
    fun `Duck can swim`(){
        assertEquals("swimming", danaerys.swim())
    }

    @Test
    fun `Duck can quack`(){
        assertEquals("quacking", danaerys.performQuack())
    }

    @Test
    fun `Duck can be shown off`(){
        assertEquals("Looks like a legend", danaerys.display())
    }

}