package factory_pattern_models.chicago_pizzas

import factory_pattern_models.Pizza

class ChicagoVeggiePizza : Pizza() {
    override val name = "Chicago Vegetarian Pizza"
    override val dough = "Deep Crust"
    override val sauce = "Marinara"
    override val toppings = mutableListOf("Veggie Cheese", "Mushrooms", "Pineapple")

    override fun prepare(): String {
        return "Preparing a Veggie Pizza - Chicago style!"
    }

    override fun bake(): String {
        return "Baking a Veggie Pizza - Chicago style!"
    }

    override fun cut(): String {
        return "Cutting a Veggie Pizza - Chicago style!"
    }

    override fun box(): String {
        return "Boxing a Veggie Pizza - Chicago style!"
    }
}