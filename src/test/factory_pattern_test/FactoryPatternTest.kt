package test.factory_pattern_test

import factory_pattern_models.chicago_pizzas.ChicagoPizzaStore
import factory_pattern_models.PizzaFactory
import factory_pattern_models.PizzaStore
import factory_pattern_models.new_york_pizzas.NewYorkPizzaStore
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

    @Test
    fun `Can flex with regions`(){
        val store = NewYorkPizzaStore()
        assertEquals("NY Cheese Pizza Being Boxed!", store.orderPizza("Cheese"))
    }
}