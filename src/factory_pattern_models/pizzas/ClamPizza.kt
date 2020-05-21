package factory_pattern_models.pizzas

import factory_pattern_models.PizzaIngredientFactory

class ClamPizza(pizzaIngredientFactory: PizzaIngredientFactory) : Pizza(pizzaIngredientFactory) {
    override val name = "${pizzaIngredientFactory.name} Clam Pizza"
    val clam = pizzaIngredientFactory.createClam()

    override fun prepare(): String {
        return "Preparing $name with ${dough.description}, " +
                "${sauce.description} and ${clam.description}"
    }
}