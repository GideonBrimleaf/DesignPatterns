package factory_pattern_models.chicago_pizzas

import factory_pattern_models.Pizza

class ChicagoClamPizza : Pizza() {
    override fun prepare(): String {
        return "Preparing a Clam Pizza  - Chicago style!"
    }

    override fun bake(): String {
        return "Baking a Clam Pizza"
    }

    override fun cut(): String {
        return "Cutting a Clam Pizza"
    }

    override fun box(): String {
        return "Boxing a Clam Pizza"
    }
}