package factory_pattern_models

class CheesePizza : Pizza() {
    override fun prepare(): String {
        return "Preparing a cheese pizza"
    }

    override fun bake(): String {
        return "Baking a cheese pizza"
    }

    override fun cut(): String {
        return "Cutting a cheese pizza"
    }

    override fun box(): String {
        return "Boxing a cheese pizza"
    }
}