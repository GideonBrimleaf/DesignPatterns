package test.factory_pattern_test

import factory_pattern_models.chicago_pizzas.ChicagoPizzaStore
import factory_pattern_models.chicago_pizzas.ChicagoIngredientFactory
import factory_pattern_models.new_york_pizzas.NewYorkIngredientFactory
import factory_pattern_models.new_york_pizzas.NewYorkPizzaStore
import org.junit.Ignore
import org.junit.Test
import kotlin.test.assertEquals

class FactoryPatternTest {

    @Test
    fun `Selects the right pizza`(){
        val ingredients = ChicagoIngredientFactory()
        val store = ChicagoPizzaStore(ingredients)
        assertEquals("Preparing Chicago Pepperoni " +
                     "Pizza with Thick Crust Dough, " +
                     "Plum Tomato Sauce and Sliced Pepperoni", store.orderPizza("Pepperoni")
        )
    }

    @Test
    fun `Can flex with regions`(){
        val ingredients = NewYorkIngredientFactory()
        val store = NewYorkPizzaStore(ingredients)
        assertEquals("Preparing New York Cheese " +
                     "Pizza with Thin Crust Dough, " +
                     "Marinara Sauce and Reggiano Cheese", store.orderPizza("Cheese")
        )
    }
}