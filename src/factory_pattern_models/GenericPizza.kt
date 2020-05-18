package factory_pattern_models

class GenericPizza : Pizza() {
    override fun prepare(): String {
        return "Preparing El Generico"
    }

    override fun bake(): String {
        return "Baking El Generico"
    }

    override fun cut(): String {
        return "Cutting El Generico"
    }

    override fun box(): String {
        return "Boxing El Generico"
    }
}