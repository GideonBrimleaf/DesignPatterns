package factory_pattern_models

class ChicagoPepperoniPizza : Pizza() {
    override fun prepare(): String {
        return "Preparing a Pepperoni Pizza - Chicago style!"
    }

    override fun bake(): String {
        return "Baking a Pepperoni Pizza - Chicago style!"
    }

    override fun cut(): String {
        return "Cutting a Pepperoni Pizza - Chicago style!"
    }

    override fun box(): String {
        return "Boxing a Pepperoni Pizza - Chicago style!"
    }
}