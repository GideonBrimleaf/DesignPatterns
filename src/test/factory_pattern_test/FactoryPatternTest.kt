package test.factory_pattern_test

import factory_pattern_models.chicago_pizzas.ChicagoPizzaStore
import factory_pattern_models.PizzaFactory
import factory_pattern_models.PizzaStore
import org.junit.Before
import org.junit.Ignore
import org.junit.Test
import kotlin.test.assertEquals

class FactoryPatternTest {

    @Test
    fun `Selects the right pizza`(){
        val store = ChicagoPizzaStore()
        assertEquals("Boxing a Pepperoni Pizza - Chicago style!", store.orderPizza("Pepperoni"))
    }

    @Ignore
    @Test
    fun `Can flex with regions`(){
        val store = NYPizzaStore()
        assertEquals("Boxing a Cheese Pizza - NY Style!", store.orderPizza("Cheese"))
    }
}