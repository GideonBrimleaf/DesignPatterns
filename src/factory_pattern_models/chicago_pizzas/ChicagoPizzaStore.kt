package factory_pattern_models.chicago_pizzas

import factory_pattern_models.Pizza
import factory_pattern_models.PizzaStore

class ChicagoPizzaStore : PizzaStore() {
    override fun createPizza(type: String): Pizza {
        return when(type){
            "Cheese" -> ChicagoCheesePizza()
            "Pepperoni" -> ChicagoPepperoniPizza()
            "Clam" -> ChicagoClamPizza()
            "Veggie" -> ChicagoVeggiePizza()
            else -> ChicagoGenericPizza()
        }
    }
}