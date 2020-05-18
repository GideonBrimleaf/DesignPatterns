package factory_pattern_models

class PizzaStore(private val factory:PizzaFactory) {
    fun orderPizza(type:String):String {
        val pizza = factory.createPizza(type)
        pizza.prepare()
        pizza.bake()
        pizza.cut()
        return pizza.box()
    }
}