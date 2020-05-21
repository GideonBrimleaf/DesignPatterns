package factory_pattern_models.new_york_pizzas

import factory_pattern_models.pizzas.Pizza
import factory_pattern_models.PizzaIngredientFactory
import factory_pattern_models.PizzaStore
import factory_pattern_models.pizzas.CheesePizza
import factory_pattern_models.pizzas.PepperoniPizza
import factory_pattern_models.pizzas.VeggiePizza

class NewYorkPizzaStore(private val pizzaIngredientFactory:PizzaIngredientFactory) : PizzaStore() {

    override fun createPizza(type: String): Pizza {
        return when(type){
            "Cheese" -> CheesePizza(pizzaIngredientFactory)
            "Pepperoni" -> PepperoniPizza(pizzaIngredientFactory)
            else -> VeggiePizza(pizzaIngredientFactory)
        }
    }
}