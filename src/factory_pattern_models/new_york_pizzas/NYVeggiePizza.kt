package factory_pattern_models.new_york_pizzas

import factory_pattern_models.Pizza

class NYVeggiePizza : Pizza() {
    override fun prepare(): String {
        return "NY Veggie Pizza Being Prepared!"
    }

    override fun bake(): String {
        return "NY Veggie Pizza Being Baked!"
    }

    override fun cut(): String {
        return "NY Veggie Pizza Being Cut!"
    }

    override fun box(): String {
        return "NY Veggie Pizza Being Boxed!"
    }
}