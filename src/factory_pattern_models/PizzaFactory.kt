package factory_pattern_models

class PizzaFactory {
    fun createPizza(type:String): Pizza {

        return when(type){
            "Cheese" -> CheesePizza()
            "Pepperoni" -> PepperoniPizza()
            "Clam" -> ClamPizza()
            "Veggie" -> VeggiePizza()
            else -> GenericPizza()
        }
        
    }
}