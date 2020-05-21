package factory_pattern_models.pizzas

import factory_pattern_models.PizzaIngredientFactory
import factory_pattern_models.ingredients.*

abstract class Pizza(private val pizzaIngredientFactory: PizzaIngredientFactory) {
    abstract val name:String
    val dough:Dough = pizzaIngredientFactory.createDough()
    val sauce:Sauce = pizzaIngredientFactory.createSauce()

    abstract fun prepare():String

    fun bake():String{
        return "Bake for 25 minutes at 350"
    }

    fun cut():String{
        return "Cutting the pizza into diagonal slices"
    }

    fun box():String{
        return "Place pizza in official pizza store box"
    }
}