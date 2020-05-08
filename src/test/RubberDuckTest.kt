package test

import strategy_pattern_models.RubberDuck
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