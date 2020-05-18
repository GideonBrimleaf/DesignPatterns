package factory_pattern_models

open class Pizza {
    fun prepare():String {
        return "Making the pizza"
    }

    fun bake():String{
        return "Baking the pizza"
    }

    fun cut():String{
        return "Cutting the pizza"
    }

    fun box():String{
        return "boxing the pizza"
    }
}