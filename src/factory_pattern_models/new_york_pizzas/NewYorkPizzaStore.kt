package factory_pattern_models.new_york_pizzas

import factory_pattern_models.Pizza
import factory_pattern_models.PizzaStore

class NewYorkPizzaStore : PizzaStore() {
    override fun createPizza(type: String): Pizza {
        return when(type){
            "Cheese" -> NYCheesePizza()
            "Pepperoni" -> NYPepperoniPizza()
            else -> NYVeggiePizza()
        }
    }
}