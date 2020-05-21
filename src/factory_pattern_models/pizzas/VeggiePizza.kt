package factory_pattern_models.pizzas

import factory_pattern_models.PizzaIngredientFactory

class VeggiePizza(pizzaIngredientFactory: PizzaIngredientFactory) : Pizza(pizzaIngredientFactory) {
    override val name = "${pizzaIngredientFactory.name} Veggie Pizza"
    val veggies = pizzaIngredientFactory.createVeggies()

    override fun prepare(): String {
        return "Preparing $name with ${dough.description}, " +
                "${sauce.description} and ${veggies.map { it.description + "," }} "
    }
}