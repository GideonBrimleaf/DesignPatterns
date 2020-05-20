package factory_pattern_models.pizzas

import factory_pattern_models.Pizza
import factory_pattern_models.PizzaIngredientFactory

class CheesePizza(pizzaIngredientFactory: PizzaIngredientFactory) : Pizza(pizzaIngredientFactory) {
    override val name = "${pizzaIngredientFactory.name} Cheese Pizza"
    val cheese = pizzaIngredientFactory.createCheese()

    override fun prepare(): String {
        return "Preparing $name with ${dough.description}, " +
                "${sauce.description} and ${cheese.description}"
    }
}