package factory_pattern_models.new_york_pizzas

import factory_pattern_models.Pizza

class NYVeggiePizza : Pizza() {
    override val name = "New York Veggie Pizza"
    override val dough = "Thin Crust"
    override val sauce = "Marinara Sauce"
    override val toppings = mutableListOf("Vegan Cheese", "Mushrooms")

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