package factory_pattern_models.chicago_pizzas

import factory_pattern_models.Pizza

class ChicagoPepperoniPizza : Pizza() {
    override val name = "Chicago Pepperoni Pizza"
    override val dough = "Deep Crust"
    override val sauce = "Marinara"
    override val toppings = mutableListOf("Pepperoni", "Lot's O' Cheese")

    override fun prepare(): String {
        return "Preparing a Pepperoni Pizza - Chicago style!"
    }

    override fun bake(): String {
        return "Baking a Pepperoni Pizza - Chicago style!"
    }

    override fun cut(): String {
        return "Cutting a Pepperoni Pizza - Chicago style!"
    }

    override fun box(): String {
        return "Boxing a Pepperoni Pizza - Chicago style!"
    }
}