package factory_pattern_models

class ClamPizza : Pizza() {
    override fun prepare(): String {
        return "Preparing a Clam Pizza"
    }

    override fun bake(): String {
        return "Baking a Clam Pizza"
    }

    override fun cut(): String {
        return "Cutting a Clam Pizza"
    }

    override fun box(): String {
        return "Boxing a Clam Pizza"
    }
}