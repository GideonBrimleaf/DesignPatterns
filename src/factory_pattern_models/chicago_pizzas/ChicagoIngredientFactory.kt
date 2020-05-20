package factory_pattern_models.chicago_pizzas

import factory_pattern_models.PizzaIngredientFactory
import factory_pattern_models.ingredients.*

class ChicagoIngredientFactory : PizzaIngredientFactory{
    override val name: String = "Chicago"

    override fun createDough(): Dough {
        return ThickCrust()
    }

    override fun createSauce(): Sauce {
        return PlumTomato()
    }

    override fun createCheese(): Cheese {
        return Mozzarella()
    }

    override fun createVeggies(): MutableList<Veggies> {
        return mutableListOf(Aubergine(), Spinach(), BlackOlives())
    }

    override fun createPepperoni(): Pepperoni {
        return SlicedPepperoni()
    }

    override fun createClam(): Clam {
        return FrozenClams()
    }

}