package factory_pattern_models

import factory_pattern_models.chicago_pizzas.*

class PizzaFactory {
    fun createPizza(type:String): Pizza {

        return when(type){
            "Cheese" -> ChicagoCheesePizza()
            "Pepperoni" -> ChicagoPepperoniPizza()
            "Clam" -> ChicagoClamPizza()
            "Veggie" -> ChicagoVeggiePizza()
            else -> ChicagoGenericPizza()
        }
        
    }
}