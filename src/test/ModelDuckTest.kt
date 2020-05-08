package test

import strategy_pattern_models.FlyRocketPowered
import strategy_pattern_models.ModelDuck
import org.junit.Test
import kotlin.test.assertEquals

class ModelDuckTest {

    private val renard = ModelDuck("renard")

    @Test
    fun `Can turbo charge the model duck`(){
        assertEquals("I ain't flying!", renard.performFly())
        renard.flyBehaviour = FlyRocketPowered()
        assertEquals("I fly FAST AF!", renard.performFly())
    }

}