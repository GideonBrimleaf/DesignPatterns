package factory_pattern_models.chicago_pizzas

import factory_pattern_models.Pizza

class ChicagoGenericPizza : Pizza() {
    override val name = "Chicago Generico Pizza"
    override val dough = "Deep Crust"
    override val sauce = "Marinara"
    override val toppings = mutableListOf("Some generic stuff")

    override fun prepare(): String {
        return "Preparing El Generico  - Chicago style!"
    }

    override fun bake(): String {
        return "Baking El Generico"
    }

    override fun cut(): String {
        return "Cutting El Generico"
    }

    override fun box(): String {
        return "Boxing El Generico"
    }
}