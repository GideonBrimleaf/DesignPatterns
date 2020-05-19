package factory_pattern_models

abstract class PizzaStore() {

    protected abstract fun createPizza(type:String):Pizza

    fun orderPizza(type:String):String {
        val pizza = createPizza(type)
        pizza.prepare()
        pizza.bake()
        pizza.cut()
        return pizza.box()
    }
}