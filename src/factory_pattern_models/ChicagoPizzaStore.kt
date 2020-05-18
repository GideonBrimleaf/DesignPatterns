package factory_pattern_models

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