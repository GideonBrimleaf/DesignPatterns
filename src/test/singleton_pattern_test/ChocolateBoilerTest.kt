package test.singleton_pattern_test

import org.junit.Before
import org.junit.Test
import singleton_pattern_models.ChocolateBoiler
import kotlin.test.assertEquals

class ChocolateBoilerTest {

    @Before
    fun `Setting up a boiler`(){
        val boiler = ChocolateBoiler
        boiler.fill()
    }

    @Test
    fun `Testing only one instance`(){
        val boiler2 = ChocolateBoiler
        assertEquals(false, boiler2.empty)
    }

}