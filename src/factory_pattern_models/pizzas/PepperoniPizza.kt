package factory_pattern_models.pizzas

import factory_pattern_models.Pizza
import factory_pattern_models.PizzaIngredientFactory

class PepperoniPizza(pizzaIngredientFactory: PizzaIngredientFactory) : Pizza(pizzaIngredientFactory) {
    override val name = "${pizzaIngredientFactory.name} Pepperoni Pizza"
    val pepperoni = pizzaIngredientFactory.createPepperoni()

    override fun prepare(): String {
        return "Preparing $name with ${dough.description}, " +
                "${sauce.description} and ${pepperoni.description}"
    }
}