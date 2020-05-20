package factory_pattern_models.chicago_pizzas

import factory_pattern_models.Pizza
import factory_pattern_models.PizzaIngredientFactory
import factory_pattern_models.PizzaStore
import factory_pattern_models.new_york_pizzas.NewYorkIngredientFactory
import factory_pattern_models.pizzas.CheesePizza
import factory_pattern_models.pizzas.ClamPizza
import factory_pattern_models.pizzas.PepperoniPizza
import factory_pattern_models.pizzas.VeggiePizza

class ChicagoPizzaStore(private val pizzaIngredientFactory:PizzaIngredientFactory) : PizzaStore() {

    override fun createPizza(type: String): Pizza {
        return when(type){
            "Cheese" -> CheesePizza(pizzaIngredientFactory)
            "Pepperoni" -> PepperoniPizza(pizzaIngredientFactory)
            "Clam" -> ClamPizza(pizzaIngredientFactory)
            else -> VeggiePizza(pizzaIngredientFactory)
        }
    }
}