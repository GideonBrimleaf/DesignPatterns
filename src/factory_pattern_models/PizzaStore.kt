package factory_pattern_models

class PizzaStore(private val factory:PizzaFactory) {
    fun orderPizza(type:String):Pizza {
        val pizza = factory.createPizza(type)
        pizza.prepare()
        pizza.bake()
        pizza.cut()
        pizza.box()
        return pizza
    }
}