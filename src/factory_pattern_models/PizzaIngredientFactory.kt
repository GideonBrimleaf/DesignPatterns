package factory_pattern_models

import factory_pattern_models.ingredients.*

interface PizzaIngredientFactory {
    val name:String
    fun createDough(): Dough
    fun createSauce(): Sauce
    fun createCheese(): Cheese
    fun createVeggies(): MutableList<Veggies>
    fun createPepperoni():Pepperoni
    fun createClam(): Clam
}