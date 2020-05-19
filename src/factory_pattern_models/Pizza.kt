package factory_pattern_models

abstract class Pizza {
    abstract val name:String
    abstract val dough:String
    abstract val sauce:String
    abstract val toppings:MutableList<String>

    abstract fun prepare():String

    abstract fun bake():String

    abstract fun cut():String

    abstract fun box():String
}