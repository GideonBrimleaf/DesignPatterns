package test.factory_pattern_test

import factory_pattern_models.ChicagoPizzaStore
import factory_pattern_models.PizzaFactory
import factory_pattern_models.PizzaStore
import org.junit.Before
import org.junit.Test
import kotlin.test.assertEquals

class FactoryPatternTest {
    private lateinit var factory:PizzaFactory
    private lateinit var store:PizzaStore

    @Before
    fun before(){
        factory = PizzaFactory()
        store = ChicagoPizzaStore()
    }

    @Test
    fun `Selects the right pizza`(){
        assertEquals("Boxing a Pepperoni Pizza - Chicago style!", store.orderPizza("Pepperoni"))
    }
}