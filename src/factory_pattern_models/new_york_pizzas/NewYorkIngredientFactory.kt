package factory_pattern_models.new_york_pizzas

import factory_pattern_models.PizzaIngredientFactory
import factory_pattern_models.ingredients.*

class NewYorkIngredientFactory : PizzaIngredientFactory {
    override val name:String = "New York"

    override fun createDough(): Dough {
        return ThinCrust()
    }

    override fun createSauce(): Sauce {
        return Marinara()
    }

    override fun createCheese(): Cheese {
        return Reggiano()
    }

    override fun createVeggies(): MutableList<Veggies> {
        return mutableListOf(Onion(), Mushroom(), RedPepper())
    }

    override fun createPepperoni(): Pepperoni {
        return SlicedPepperoni()
    }

    override fun createClam(): Clam {
        return FreshClams()
    }
}