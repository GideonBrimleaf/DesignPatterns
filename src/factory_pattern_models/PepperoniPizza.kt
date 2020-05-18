package factory_pattern_models

class PepperoniPizza : Pizza() {
    override fun prepare(): String {
        return "Preparing a Pepperoni Pizza"
    }

    override fun bake(): String {
        return "Baking a Pepperoni Pizza"
    }

    override fun cut(): String {
        return "Cutting a Pepperoni Pizza"
    }

    override fun box(): String {
        return "Boxing a Pepperoni Pizza"
    }
}