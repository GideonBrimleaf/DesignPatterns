package factory_pattern_models.chicago_pizzas

import factory_pattern_models.Pizza

class ChicagoCheesePizza : Pizza() {
    override fun prepare(): String {
        return "Preparing a cheese pizza - Chicago style!"
    }

    override fun bake(): String {
        return "Baking a cheese pizza - Chicago style!"
    }

    override fun cut(): String {
        return "Cutting a cheese pizza - Chicago style!"
    }

    override fun box(): String {
        return "Boxing a cheese pizza - Chicago style!"
    }
}