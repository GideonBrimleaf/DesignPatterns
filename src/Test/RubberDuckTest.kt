package Test

import Models.RubberDuck
import org.junit.Ignore
import org.junit.Test
import kotlin.test.assertNotEquals

class RubberDuckTest {

    private val valjean = RubberDuck("Valjean")

    @Test
    fun `Rubber ducks don't fly`(){
        assertNotEquals("flying", valjean.fly())
    }

    @Test
    fun `Rubber ducks don't quack`(){
        assertNotEquals("Quacking", valjean.quack())
    }
}