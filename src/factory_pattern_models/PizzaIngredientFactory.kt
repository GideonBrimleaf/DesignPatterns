package factory_pattern_models

import factory_pattern_models.ingredients.*

interface PizzaIngredientFactory {
    fun createDough(): Dough
    fun createSauce(): Sauce
    fun createCheese(): Cheese
    fun createVeggies(): Veggies
    fun createPepperoni():Pepperoni
    fun createClam(): Clam
}