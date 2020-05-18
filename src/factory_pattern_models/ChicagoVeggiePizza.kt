package factory_pattern_models

class ChicagoVeggiePizza : Pizza() {
    override fun prepare(): String {
        return "Preparing a Veggie Pizza - Chicago style!"
    }

    override fun bake(): String {
        return "Baking a Veggie Pizza - Chicago style!"
    }

    override fun cut(): String {
        return "Cutting a Veggie Pizza - Chicago style!"
    }

    override fun box(): String {
        return "Boxing a Veggie Pizza - Chicago style!"
    }
}