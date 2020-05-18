package factory_pattern_models.new_york_pizzas

import factory_pattern_models.Pizza

class NYPepperoniPizza : Pizza() {
    override fun prepare(): String {
        return "NY Pepperoni Pizza Being Prepared!"
    }

    override fun bake(): String {
        return "NY Pepperoni Pizza Being Baked!"
    }

    override fun cut(): String {
        return "NY Pepperoni Pizza Being Cut!"
    }

    override fun box(): String {
        return "NY Pepperoni Pizza Being Boxed!"
    }
}