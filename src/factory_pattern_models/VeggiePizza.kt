package factory_pattern_models

class VeggiePizza : Pizza() {
    override fun prepare(): String {
        return "Preparing a Veggie Pizza"
    }

    override fun bake(): String {
        return "Baking a Veggie Pizza"
    }

    override fun cut(): String {
        return "Cutting a Veggie Pizza"
    }

    override fun box(): String {
        return "Boxing a Veggie Pizza"
    }
}