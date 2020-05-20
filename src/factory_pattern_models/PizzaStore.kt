package factory_pattern_models

abstract class PizzaStore() {

    protected abstract fun createPizza(type:String):Pizza

    fun orderPizza(type:String):String {
        val pizza = createPizza(type)
        pizza.bake()
        pizza.cut()
        pizza.box()
        return pizza.prepare()
    }
}