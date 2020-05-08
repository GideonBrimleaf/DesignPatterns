package test.strategy_pattern_tests

import strategy_pattern_models.duck_sim.RubberDuck
import org.junit.Test
import kotlin.test.assertNotEquals

class RubberDuckTest {

    private val valjean = RubberDuck("Valjean")

    @Test
    fun `Rubber ducks don't fly`(){
        assertNotEquals("flying", valjean.performFly())
    }

    @Test
    fun `Rubber ducks don't quack`(){
        assertNotEquals("quacking", valjean.performQuack())
    }
}