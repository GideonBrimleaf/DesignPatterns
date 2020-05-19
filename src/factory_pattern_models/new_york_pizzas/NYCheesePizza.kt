package factory_pattern_models.new_york_pizzas

import factory_pattern_models.Pizza

class NYCheesePizza : Pizza() {
    override val name = "New York Cheese Pizza"
    override val dough = "Thin Crust"
    override val sauce = "Cheesy"
    override val toppings = mutableListOf("Blue Cheese", "Soft Cheese", "Hard Cheese")

    override fun prepare(): String {
        return "NY Cheese Pizza Being Prepared!"
    }

    override fun bake(): String {
        return "NY Cheese Pizza Being Baked!"
    }

    override fun cut(): String {
        return "NY Cheese Pizza Being Cut!"
    }

    override fun box(): String {
        return "NY Cheese Pizza Being Boxed!"
    }
}